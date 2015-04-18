TRABAJO LOTERIA
===============

Una lotería es un tipo de juego de azar donde el jugador elige un subconjunto de elementos de un conjunto predefinido y los ganadores son elegidos por sorteo o por los resultados de algún deporte. En general, los premios se definen en términos de porcentaje de la recaudación de las apuestas.

Un sistema de lotería debe ser capaz de leer las apuestas y el resultado (del sorteo) y cálcular los ganadores y las cantidades de los premios.

Este trabajo consiste en la implementación de un sistema de loterías en Java. Un aspecto importante de este sistema es que sea extensible, es decir, una nueva lotería puede ser fácilmente añadido al sistema. El uso correcto de la orientación a objetos es esencial para esto. Inicialmente, el sistema debe ser compatible con dos tipos de loterías: Quina y Lotogol.

El programa debe recibir como parámetro en linea de comandos el nombre de la lotería y un directorio. El directorio debe contener dos archivos: apuestas y resultados. Cada línea en el archivo de apuestas contiene una apuesta en el formato específico para cada lotería. El archivo de resultados contiene sólo una línea con el resultado. El programa debe escribir en la salida estándar el total acumulado, el total de premios, el valor de cada premio y el número de ganadores de cada premio.

Quina
=====

En esté tipo de loteria, el jugador elige 5, 6 o 7 números entre 1 y 80. Estas apuestas tienen un precio de S/. 0.75, S/. 3.00 y S/. 7.50, respectivamente. Son sorteados 5 números, el jugador gana si acierta 5, 4 o 3 números. Del total recaudado, 32.20%  (del total de 104.5%) están destinados a premios. El valor destinado al pago de los premios tiene la siguiente distribución:

    35% se reparten entre las apuestas que contengan 5 aciertos, Quina;
    25% se reparten entre las apuestas que contengan 4 aciertos, Quadra;
    y 25% se reparten entre las apuestas que contengan 3 aciertos, Terno.
    
Cada línea del archivo de apuestas para Quina es el número de una apuesta, separadas por un espacio. Pueden existir 5, 6 o 7 números por cada línea. Del mismo modo, la única fila del archivo de resultados contiene los cinco números sorteados.

Considere como directório, con nombre ejemplo-quina, el cual contiene como archivo de las apuestas, con el siguiente contenido:

8 25 36 37 49 60 74
5 22 31 36 37 50 60
7 37 63 64 74
5 8 25 32 37 60
11 21 44 47 62
8 25 36 37 60
6 8 17 25 44 60
4 27 30 32 33 38 76

el archivo de resultado, con el siguiente contenido:

8 25 36 37 60

Si el programa fuese llamado con los parámetros quina exemplo-quina, el programa debe escribir en la pantalla la siguiente respuesta:

30.75
9.48
Quina 2 1.66
Quadra 1 2.37
Terno 2 1.18

Esto significa que el total acumulado es S/. 30.75 y la valor destinado para los premios fue de S/. 9.48. Dos apuestas que acertaron la quina y cada uno ganó el premio de S/. 1.66. Una apuesta acertó la quadra y ganó S/. 2.37. Dos apuestas acertaron el terno y ganaron cada uno S/. 1.18.

Lotogol
=======

En Lotogol el apostador elige la puntuación de 5 partidos de fútbol. Para cada partido el apostador debe elegir la cantidad de goles en las opciones 0, 1, 2, 3 o + (lo que significa más de 3 goles), de los dos equipos. El apostador puede competir con 1, 2 o 4 apuestas iguales. El costo de cada tipo de apuesta es, respectivamente, S/. 0.50 , S/. 1.00 y S/. 2.00. El apostador gana si acierta 5, 4 o 3 resultados de los juegos. Del total recaudado, el 28% ( del total de 104.4%) están destinados a premios. El valor destinado al pago de los premios tiene la siguiente distribución :

    40% entre los que acertaron 5 resultados;
    30% entre los que acertaron 4 resultados;
    30% entre los que acertaron 3 resultados.

Cada línea del archivo de apuestas para Lotogol consta de 11 elementos separados por espacios. El primer elemento es la cantidad de juegos (1, 2 o 4) a los que está apostando. Los próximos 10 elementos representan las resultados de cada juego. Por ejemplo, la línea 4 3 1 + 2 0 0 + 1 1 2 representa una apuesta de 4 juegos, con resultados: 3 1, + 2, 0 0, + 1 e 1 2. El archivo de resultado contiene sólo una línea con 10 elementos, que son los resultados de 5 juegos.

Consideremos un ejemplo para el directorio ejemplo-lotogol, con archivo de las apuestas con el siguiente contenido:

1 3 2 + 2 3 3 0 + 2 3
2 2 + + 2 0 0 0 + 2 3
1 3 3 + 2 3 3 0 + 2 3
1 + 0 0 2 2 + 3 + + 1
2 3 2 0 2 + 2 0 + 2 3
1 2 0 3 0 3 3 0 + 1 3
1 3 2 + 2 3 3 0 + 2 3
2 3 2 + 2 1 3 0 + 2 3
2 0 0 3 1 2 + 0 1 2 +

e el arquivo de resultado, con el siguiente contenido:

3 2 + 2 3 3 0 + 2 3

La ejecución del programa con los parámetros lotogol ejemplo-lotogol, debería imprimir en la pantalla lo siguiente:

6.50
1.74
1º (5 acertos) 2 0.35
2º (4 acertos) 3 0.17
3º (3 acertos) 4 0.13

Esto significa que el acumulado total fue de S/. 6.50 y la cantidad asignada para premios fue de S/. 1.74. Dos apuestas acertaron 5 resultados y cada uno ganó por S/. 0.35. Tres apuestas acertaron 4 resultados, ganando S/. 0.17. Cuatro apuestas acertaron 3 resultados y cada uno ganó S/. 0.13.


