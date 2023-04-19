package dominio;
import java.util.*;
import dominio.Node;

public class Huffman {

    public static Node buildHuffmanTree(char[] chars, int[] freqs) {
        PriorityQueue<Node> pq = new PriorityQueue<Node>();

        for (int i = 0; i < chars.length; i++) {
            pq.offer(new Node(chars[i], freqs[i]));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node parent = new Node(left.frequency + right.frequency, left, right);
            pq.offer(parent);
        }

        return pq.poll();
    }

    public static void printHuffmanCodes(Node node, String code) {
        if (node.isLeaf()) {
            System.out.println(node.character + ": " + code);
            return;
        }

        printHuffmanCodes(node.left, code + "0");
        printHuffmanCodes(node.right, code + "1");
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] freqs = {5, 9, 12, 13, 16, 45};

        Node root = buildHuffmanTree(chars, freqs);

        printHuffmanCodes(root, "");
    }
}
