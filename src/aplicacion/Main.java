package aplicacion;
import java.util.*;
import algorithm.Huffman;

public class Main {

    public static void main(String[] args) {
        char[] characters={'A', 'B', 'C', 'D', 'E', 'G', 'I', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', ' ', ','};
        int[] occurences={11, 2, 4, 3, 14, 3, 6, 6, 3, 6, 7, 4, 1, 10, 4, 3, 4, 2, 17, 2};
        HuffmanNode root = Huffman.buildHuffmanTree(characters, ocurrences);
        Huffman.printCode(root, "");
    }
}