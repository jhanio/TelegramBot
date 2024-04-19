package es.codegym.telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Map;
import java.util.Scanner;

import static es.codegym.telegrambot.TelegramBotContent.*;

public class MyFirstTelegramBot extends MultiSessionTelegramBot {
    public static final String NAME = "larealsalchipapaatencion_bot";
    public static final String TOKEN = "6816012729:AAFoTDNj__dO3P8JDcp6LpMVQEK7umMHnhI";
    public MyFirstTelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
    public void onUpdateEventReceived(Update update) {
        // TODO: escribiremos la funcionalidad principal del bot aquí
        if (getMessageText().contains("hola")) {
            setUserGlory(20);
            sendPhotoMessageAsync("step_1_pic");
            sendTextMessageAsync(STEP_1_TEXT, Map.of(
                    "Quiero hacer un pedido", "step_1_btn"));
        }
        if (getCallbackQueryButtonKey().equals("step_1_btn")) {
            setUserGlory(20);
            sendPhotoMessageAsync("step_2_pic");
            sendTextMessageAsync(STEP_2_TEXT, Map.of(
                    "Clásica", "step_2_btn",
                    "Especial", "step_2_btn",
                    "Picante", "step_2_btn",
                    "Vegetariana", "step_2_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_2_btn")) {
            setUserGlory(20);
            sendPhotoMessageAsync("step_3_pic");
            sendTextMessageAsync(STEP_3_TEXT, Map.of(
                    "Aji de polleria (+%.2f)", "step_3_btn",
                    "Tartara (+%.2f)", "step_3_btn",
                    "Mayonesa (+%.2f)", "step_3_btn",
                    "Ketchup (+%.2f)", "step_3_btn",
                    "No deseo salsa", "step_3_btn"
            ));
        }

        if (getCallbackQueryButtonKey().startsWith("step_3_btn")) {
            setUserGlory(20);
            sendPhotoMessageAsync("step_4_pic");
            sendTextMessageAsync(STEP_4_TEXT, Map.of(
                    "Si confirmo el pedido (+%.2f)", "step_4_btn",
                    "No confirmo el pedido (+%.2f)", "step_4_btn"
            ));
        }

        if (getCallbackQueryButtonKey().startsWith("step_4_btn")) {
            String additionalSauce = getCallbackQueryButtonKey().substring("step_3_btn".length());
            setUserGlory(30);
            sendPhotoMessageAsync("step_5_pic");
            sendTextMessageAsync(FINAL_TEXT, Map.of(
                    "No gracias", "step_6_btn" ,
                    "Si quiero agregar otro pedido", "step_2_btn"
            ));
        }

        if (getCallbackQueryButtonKey().equals("step_6_btn")) {
            setUserGlory(30);
            sendPhotoMessageAsync("step_6_pic");
            sendTextMessageAsync(NOMORE_TEXT, Map.of());
        }

    }

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}
