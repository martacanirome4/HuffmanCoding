package aplicacion;
import java.util.*;
import algorithm.Huffman;
import algorithm.HuffmanNode;
import algorithm.MyComparator;

public class Main {

    public static void main(String[] args) {

        Huffman huffman = new Huffman();

        char[] characters={'A', 'B', 'C', 'D', 'E', 'G', 'I', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', ' ', ','};
        int[] occurrences={11, 2, 4, 3, 14, 3, 6, 6, 3, 6, 7, 4, 1, 10, 4, 3, 4, 2, 17, 2};

        HuffmanNode root = huffman.buildHuffmanTree(characters, occurrences);
        huffman.printCode(root, "");
    }
}