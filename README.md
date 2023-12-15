# Ejercicio de Java: Utilización de Tuberías para Redireccionar Entrada y Salida
## Objetivo
Aprender a utilizar tuberías para redireccionar la entrada y salida entre programas en Java.

## Enunciado
### GeneradorAleatorio

Desarrollar un programa llamado "GeneradorAleatorio" que:
- Genere 40 números aleatorios entre 0 y 100.
- Muestre los números en la salida estándar.

### Ordenador
Desarrollar un programa llamado "Ordenador" que:
- Lea números desde la entrada estándar.
- Almacene los números en un array.
- Ordene los números utilizando un algoritmo de ordenamiento
- Muestre el array ordenado en la salida estándar.

## Procedimiento
- Probar cada programa por separado para verificar su correcto funcionamiento.
- Utilizar el operador "|" para conectar la salida de "GeneradorAleatorio" a la entrada de "Ordenador".

## Instrucciones para la Ejecución
### 1. Clonar el repositorio
- ssh
```
git clone git@github.com:Perico6255/Entrada-Salida-Java.git
```
- http
```
git clone https://github.com/Perico6255/Entrada-Salida-Java.git
```
### 2. Compilación
```
javac -d bin src/Ordenador.java src/GeneradorAleatorio.java       
```
### 3. Ejecucion 
```
cd bin/
java GeneradorAleatorio | java Ordenador   
```
