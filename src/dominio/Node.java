package dominio;
import java.util.*;

/**
 * Implementación sencilla de un nodo para el de árbol de Huffman
 */
class Node implements Comparable<Node> {
    char character;
    int frequency;
    Node left, right;

    public Node(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }

    public Node(int frequency, Node left, Node right) {
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    public boolean isLeaf() {
        return (left == null && right == null);
    }

    public int compareTo(Node other) {
        return this.frequency - other.frequency;
    }
}