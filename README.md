# TAREA-1-RETS

  **IMAGEN DE LA EJECUCIÓN DEL PROYECTO**
<img width="960" alt="Captura_ejecutada" src="https://github.com/ToalaSanRi/TAREA-1-RETS/assets/169106800/aa37d409-3edd-4ecc-80e9-44d46b97af6a">


                -- COMPONENTES DEL CÓDIGO --

**Clase Main que extiende Application:** Esta es la clase principal de la aplicación que extiende la clase javafx.application.Application y proporciona el método start() que JavaFX invoca al iniciar la aplicación.

**Método main:** Este método inicia la aplicación JavaFX invocando el método launch() con los argumentos proporcionados.

**Método start():** Este método es donde se construye la interfaz gráfica de la aplicación.

**BorderPane:** Se utiliza como el contenedor principal de la interfaz de usuario. Permite organizar los nodos en cinco áreas: arriba, abajo, izquierda, derecha y centro.

**ListView:** Se utilizan dos ListView. Uno en el lado izquierdo y otro en el lado derecho. Un ListView es una lista vertical de elementos desplazables. El lado izquierdo muestra una lista de StackPane, cada uno conteniendo un Label con un nombre. El lado derecho muestra una lista de strings con un fondo negro y texto blanco.

**ScrollPane:** Se utiliza para permitir el desplazamiento vertical en el ListView del lado izquierdo.

**TextField:** Un campo de texto que aparece en la parte inferior del lado derecho con un fondo azul y texto blanco.

**Rectángulo y Label dentro de un StackPane:** El método createLabeledBox() crea un StackPane que contiene un rectángulo y un Label dentro de un HBox. Este método se utiliza para crear elementos individuales en el ListView del lado izquierdo.
