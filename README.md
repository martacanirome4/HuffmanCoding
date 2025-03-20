# 🌲 Algoritmo de Codificación de Huffman

**Compresión de datos eficiente mediante códigos binarios en Java**  
Este proyecto implementa el algoritmo de **codificación de Huffman**, una técnica de compresión sin pérdida, junto con funciones de codificación y descifrado basadas en árboles binarios.

![Huffman Tree](https://user-images.githubusercontent.com/50625677/233080625-86cf5375-9059-41fa-95b7-c2a80031a02f.png)  
Fuente: [Wikipedia - Huffman coding](https://en.wikipedia.org/wiki/Huffman_coding)

---

## 📜 ¿Qué es la codificación de Huffman?

La codificación de Huffman es un algoritmo de compresión que asigna **códigos de longitud variable** a símbolos, siendo **más cortos para los símbolos más frecuentes**. Así se consigue reducir el tamaño de los datos sin perder información.

- 📅 Desarrollado en **1952** por **David A. Huffman** como parte de un trabajo académico en el MIT.
- Es una técnica base en formatos como **ZIP, MP3, JPEG** y muchos otros.

### 💡 Curiosidades

- Huffman inventó su algoritmo como alternativa a la **codificación de Shannon-Fano**… ¡y resultó ser más eficiente!
- Es el algoritmo de compresión sin pérdida **más usado** en la historia de la informática.

---

## ⚙️ Funcionamiento del Proyecto

### 🧱 Codificador de Árbol de Huffman

1. A partir de una cadena y sus frecuencias, se construye un **árbol binario** donde los nodos más frecuentes están más cerca de la raíz.
2. Se recorren los caminos del árbol (izquierda = 0, derecha = 1) y se asignan códigos binarios únicos a cada símbolo.
3. Devuelve la **asignación de símbolos a códigos**.

### 🔓 Función de Descifrado

1. Recibe una cadena de bits y el árbol de Huffman.
2. Atraviesa el árbol según cada bit hasta llegar a un nodo hoja.
3. Genera el símbolo original. Repite hasta procesar todos los bits.

---

## 🚀 Compilación y Ejecución

```bash
# Clona este repositorio
git clone https://github.com/tuusuario/HuffmanCoding.git
cd HuffmanCoding

# Compila el proyecto
make compilar

# Ejecuta el programa
make ejecutar
```

---

## 🔗 Recursos Interesantes

- 📚 [Explicación visual interactiva – VisuAlgo](https://visualgo.net/en/huffman)
- 🎥 [Video: Huffman Coding Explained – Computerphile](https://www.youtube.com/watch?v=JsTptu56GM8)
- 🧠 [Artículo sobre David A. Huffman – MIT](https://www.cs.cmu.edu/~./huffman/)

---

## 👩‍💻 Autoría

Desarrollado por **Marta Canino Romero**  
[@martacanirome4](https://github.com/martacanirome4) – GitHub 2023
