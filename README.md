# Practicas de Fundamentos de Programación II

Este repositorio se ha creado para albergar las practicas del Laboratorio de la asignatura de Fundamentos de Programación II.

> ## Práctica 1 - Teatro
> 
> Modelar un sistema de gestión de los espectadores abonados en un teatro. Cada espectador cuenta con un número de abonado, y se conoce su nombre y edad.
> En función de la edad, a cada espectador se le debe asignar una categoría:
> * Para espectadores menores de 18 años: **Categoría A**.
> * Para espectadores con edades entre 18 y 65 años: **Categoría B**.
> * Para espectadores mayores de 65 años: **Categoría C**.
>
> Cada uno de los espectaculos tiene un título y un grupo de espectadores. Se debe calcular el dinero total recaudado en cada espectáculo, considerando el precio de la entrada de cada uno de los especadores se obtiene teniendo en cuenta lo siguiente:
> * Precio para espectadores en categoría A: *10 €*.
> * Precio para espectadores en categoría B: *20 €*.
> * Precio para espectadores en categoría C: *15 €*.
> * Si el número de abonado del espectador es un número por debajo de 50, se aplica un descuento del **25%**.
> 
> Por otro lado, el teatro registra una serie de datos estadísticos relacionados con los espectáculos que se representan. Concretamente, se debe contabilizar el número total de espectadores, así como la edad media de los espectadores, a nivel global de todos los espectáculos en conjunto.

> ## Práctica 2 - Apartamentos
> modelar una web de alojamientos turísticos en París. Todos los alojamientos cuentan con un nombre, dirección y precio por noche. Hay dos tipos de alojamientos turísticos, hoteles y apartamentos, ambos con características comunes. Además, es necesario contabilizar el número total de alojamientos existentes de cada tipo, aumentando una variable cada vez que se crea un nuevo elemento del tipo de alojamiento correspondiente.

> ## Práctica 3 - Juego de Rol
> 
> modelar un juego de rol. Se desarrolla un sistema de combate que enfrenta a dos tipos de personajes: Guerreros y Magos, cada uno con sus propias habilidades y características que determinan su rendimiento en el campo de batalla. Todos los personajes se definen por su nombre, nivel, puntos de vida (PV) y puntos de experiencia (PE).
> * Los PV calculados como 50+(Nivel*2).
> * El nivel va aumentando por cada 100 PE acumulados.
> * Los PE al crear un nuevo personaje son 0.
> 
> Además, los guerreros tienen una característica de fuerza, mientras que los magos poseen un índice de agilidad.
> La forma de atacar depende del tipo de personaje. El daño infligido por un Guerrero sobre el contrincante se calcula: Nivel + (Fuerza * 0.8). El ataque que puede producir un mago sobre el otro personaje se calcula: Nivel + (Agilidad * 0.6). Al finalizar cada combate, al ganador se le otorgarán 55 puntos de experiencia y 35 al perdedor. Hay que tener en cuenta que al subir de nivel la vida del jugador se regenera.
> Se creará un grupo de jugadores que se enfrentarán en rondas sucesivas de combates uno a uno siguiendo el orden de creación de los personajes. De esta forma, se enfrentarán el primero con el segundo, y el tercero con el cuarto etc. El vencedor de cada enfrentamiento avanzará a la siguiente ronda y el perdedor quedará eliminado. Conforme los combates avanzan, los participantes se reducen, hasta quedar un vencedor final. Tras cada combate se anuncia el ganador y se muestra su información actualizada. También se debe mostrar quién es el vencedor final una vez terminadas todas las rondas de combate.

> ## Práctica 4 - Radar de Carretera
>
> Se va a diseñar un sistema de control de los vehículos que circulan por una carretera. De todos los vehículos se conoce su matrícula y su marca. Además, de los coches se conoce sus años de antigüedad, de los camiones su peso, y de las motos su cilindrada. La velocidad a la que circula cada vehículo, medida por un radar situado en la carretera, se calcula en base a un número entero n, con valor aleatorio entre 1 y 20, que se pasa como parámetro al método de cálculo de la velocidad:
> * Coches -> Velocidad = 10*n
> * Camiones -> Velocidad = 8*n
> * Motos -> Velocidad = 6*n
>
> En una carretera, la velocidad máxima permitida depende del tipo de vehículo, siendo 120km/h para coches, 100km/h para camiones, y 80km/h para motos. Además, existe un mínimo de velocidad de 60km/h, común para todos los vehículos que pasen por la carretera. Estos valores de velocidad se deben modelar como constantes en una interfaz.
>
> Como medida de seguridad, cuando se da de alta una nueva carretera en el sistema, se establece un límite de infracciones de velocidad y se crea un registro de vehículos infractores. Cada vez que un vehículo está fuera de los límites de velocidad establecidos, se añade al registro y salta una
excepción de tipo VelocidadException, indicando el mensaje “**VELOCIDAD** Ha superado la velocidad máxima permitida para este tipo de vehículo” o “**VELOCIDAD** Este vehículo circula a una velocidad demasiado baja”, según corresponda. Ese mensaje se establece en el momento en el que se lanza la excepción. Si el registro se llena de infractores, cuando se detecta una nueva infracción la carretera se cierra al tráfico por seguridad (es decir, se finaliza la ejecución del programa capturando la excepción correspondiente a salirse de los límites de un array).
>
> Para los vehículos que cumplen con la velocidad establecida, no se aplica ningún otro control. Sin embargo, si no cumplen las normas de velocidad, se revisan otros elementos:
> * Si es un coche con una antigüedad mayor a 15 años, salta una excepción AntiguoException indicando que “**ANTIGÜEDAD** Este coche es demasiado antiguo para circular por esta carretera”.
> * Si es un camión que pesa más de 15000kg, salta una excepción PesadoException indicando que “**PESO** Este camión es demasiado pesado para circular por esta carretera”.
> * Si es una moto con cilindrada inferior a 250cc, salta una excepción CilindradaBajaException indicando que “**CILINDRADA** Esta moto no tiene cilindrada suficiente para circular por esta carretera”.
> * os mensajes de información de estas tres excepciones deben ser mensajes por defecto de las excepciones, en lugar de establecerlos al lanzarlas.
>
> Todas las excepciones contempladas en este ejercicio deben ser correctamente gestionadas en el programa principal.