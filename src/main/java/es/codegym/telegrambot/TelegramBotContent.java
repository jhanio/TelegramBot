package es.codegym.telegrambot;

public class TelegramBotContent {
    public static final String STEP_1_TEXT = """
        **¡BIENVENIDO A LA REAL SALCHIPAPA!**

        El aroma irresistible de una deliciosa salchicha, repleta de papas fritas crujientes te envuelve mientras entras en este reino culinario. Tu estómago ruge con anticipación, listo para una aventura de sabor.
        
        """;
    public static final String STEP_2_TEXT = """
       
        **Elige tu estilo de salchipapa:**

        1. **Clásica:** La reina de las salchipapas, con salchichas asadas, papas fritas doradas, salsa de tomate y mayonesa.
        
        2. **Especial:** Para los amantes del queso, esta salchipapa apila dos capas de queso derretido sobre las salchichas y las papas fritas.
        
        3. **Picante:** Crujientes chiles jalapeños elevan esta salchipapa a un nuevo nivel de sabor.
        
        4. **Vegetariana:** Una opción deliciosa y saludable, con salchichas de tofu, papas fritas al horno, salsa vegana y guacamole.

        **¿Estás listo para ordenar?**
        
        """;


    public static final String STEP_3_TEXT = """
        **¡Tu pedido de salchipapa ha sido recibido!**

        **Tu estilo de salchipapa:** %s
        **Precio:** %d

        **¿Te gustaría agregar crema adicional?**

        1. Aji de polleria (+%.2f)
        2. Tartara  (+%.2f)
        3. Mayonesa  (+%.2f)
        4. Ketchup  (+%.2f)
        5. No deseo salsa  (+%.2f)

        **Elige tu opción:**
        """;

    public static final String STEP_4_TEXT = """
        **Resumen de tu pedido de salchipapa:**

        **Estilo de salchipapa:** %s
        **Precio:** %d

        **Adicionales:**

        %s

        **Total:** %d

        **¿Confirmas tu pedido?**

        1. Sí
        2. No
        """;

    public static final String FINAL_TEXT = """
           **¡Tu salchipapa está en camino!**

        Prepárate para disfrutar de una deliciosa salchipapa hecha con los mejores ingredientes.

        **¡Gracias por tu orden!**
        **¿Te gustara pedir algo mas??**
        """

            ;
    public static final String NOMORE_TEXT = """
           **¡Vamos a preparar tu SALCHIPAPON!!!!**

        **¡Gracias por tu orden!**
       
        """

            ;

}
