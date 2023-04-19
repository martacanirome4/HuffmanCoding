# Algoritmo de codificación de Huffman

Este proyecto contiene una implementación del algoritmo de codificación de Huffman en Java, junto con un codificador de árbol de Huffman y una función de descifrado.

## El algoritmo
El algoritmo de codificación de Huffman es una técnica de compresión de datos que asigna códigos de longitud variable a símbolos en función de sus frecuencias en los datos de entrada.
Fue desarrollado por David A. Huffman en 1952 cuando era estudiante de posgrado en el MIT.

![1200px-Huffman_tree_2 svg](https://user-images.githubusercontent.com/50625677/233080625-86cf5375-9059-41fa-95b7-c2a80031a02f.png)
Fuente: https://en.wikipedia.org/wiki/Huffman_coding

## Codificador de árbol de Huffman
El codificador del árbol de Huffman en este proyecto toma una cadena de caracteres y sus frecuencias correspondientes y construye un árbol de Huffman utilizando el algoritmo de codificación de Huffman. Luego genera los códigos para cada símbolo atravesando el árbol y devuelve una asignación de símbolos a códigos.

## Función de descifrado
La función de descifrado en este proyecto toma una cadena de 1 y 0 que se codificó usando el codificador de árbol de Huffman, junto con la asignación de símbolos a códigos. Atraviesa el árbol de Huffman para cada secuencia de bits, comenzando desde la raíz, hasta que llega a un nodo hoja y genera el símbolo correspondiente. Este proceso se repite hasta que se hayan procesado todos los bits codificados, lo que da como resultado la cadena de entrada original.

## Cómo compilar y ejecutar el proyecto
Para compilar y ejecutar el proyecto, sigue estos pasos:

- Clona este repositorio en tu ordenador.
- Abre una terminal y navega al directorio del proyecto.
- Ejecuta el comando 'make compilar' para compilar el proyecto.
- Ejecuta el comando 'make ejecutar' para ejecutar el programa.

## Autor
Marta Canino Romero, @martacanirome4 - GitHub 2023
