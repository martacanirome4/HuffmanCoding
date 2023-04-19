package algorithm;
import java.util.*;
import algorithm.HuffmanNode;
import algorithm.MyComparator;

public class Huffman {

    public static HuffmanNode buildHuffmanTree(char[] characters, int[] ocurrences) {

        int n = characters.length;
        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(n, new MyComparator());

        // Create nodes for each character and add to priority queue
        for (int i = 0; i < n; i++) {
            HuffmanNode node = new HuffmanNode();
            node.character = characters[i];
            node.frequency = ocurrences[i]/n;
            node.left = null;
            node.right = null;
            q.add(node);
        }
        // Construct the Huffman tree by repeatedly merging nodes
        HuffmanNode root = null;
        while (q.size() > 1) {
            HuffmanNode x = q.peek();
            q.poll();
            HuffmanNode y = q.peek();
            q.poll();
            HuffmanNode f = new HuffmanNode();
            f.frequency = x.frequency + y.frequency;
            f.character = '-';
            f.left = x;
            f.right = y;
            root = f;
            q.add(f);
        }
        return root;
    }


    public static void printCode(HuffmanNode root, String s) {

        if (    root.left == null &&
                root.right == null &&
                Character.isLetter(root.character)
        ) {
            System.out.println(root.character + ":" + s);

            return;
        }

        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static String decode(HuffmanNode root, String encodedMessage) {
        StringBuilder decodedMessage = new StringBuilder();
        HuffmanNode current = root;

        for (int i = 0; i < encodedMessage.length(); i++) {
            char c = encodedMessage.charAt(i);
            if (c == '0') {
                current = current.left;
            } else if (c == '1') {
                current = current.right;
            }
            if (current.left == null && current.right == null) {
                decodedMessage.append(current.character);
                current = root;
            }
        }

        return decodedMessage.toString();
    }
}