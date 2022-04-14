#Singleton

##El problema
En sistemas en los que muchos clientes usan una clase, se crean demasiadas
instancias.

1-Asegurar que la clase sólo tenga una instancia.

2-Poveer acceso de manera global a esa instancia.

##La solución

- Crear un constructor privado que prevenga la creación con new.
- Crear un método estático que devuelva una instancia de la misma clase.
  (método de clase).
- Asegurar que si ya existe una instancia el método estático devuelva esa misma instancia.

##Una analogía en el Real World
Tenemos un sistema con muchas clases cliente que necesitan imprimir con una impresora (única).

##Ventajas / Inconvenientes

##Ejercicio

- Crear una impresora
- Ver que si varios clientes imprimen, al final del día el número de impresiones será la suma.

##UML

##Links de interés