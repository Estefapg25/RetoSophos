Reto Automatización


Para la solución en agregar el producto al carrito de compras se implemento un feature con un escenario donde se ingresa a la URL se busca el producto deseado y se agrega al carrito de compras.

Se implemento un stepdefinitions para agregar los pasos ingresados en lenguaje gherkin en el feature.
Se utilizaron 2 tasks para iniciar la aplicación y las acciones para buscar y agregar el producto.
Se utilizó una espera en las interactions para poder manejar tiempos de espera en la página y el sistema no logre capturar los objetos.
Se utilizó un model para que quedara estructurado y con posibilidades de trabajar en un futuro como deben de quedar los proyectos de automatización, donde se agregaron atributos del objeto producto.
Se utilizó una clase questions para validar que el producto fuera igual al producto agregado en la lista del carrito de compras, se implemento la comparación con un containts para buscar el producto agregado con los productos de la lista.
Se utilizó un runner para la ejecución del feature anterior
Se agregó una excepción en caso de que el producto no se encontrara en la lista, el proyecto mostrara un mensaje diciente.
Se utilizaron 3 user interfaces donde se mapearon todos los objetos necesarios para encontrar los elementos, como en la página dada, la mayoria de objetos no tenian id propio, se utilizó la creación de los XPATH para poder encontrar con facilidad el elemento
Se agrego en las propiedades de serenity las opciones que requeria para abrir el chrome, y para manejar tiempos implicitos en el proyecto.

No se realiza documentación del código directamente en el eclipse porque no es una buena práctica, de igual forma los métodos y las clases tienen nombres dicientes para que cualquier persona que no conozca del proyecto tenga la posibilidad de entender fácilmente.