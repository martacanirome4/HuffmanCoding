import dominio.Huffman;
import dominio.Node;
import java.util.*;

public static void main(String[] args) {
    Huffman huffman = new Huffman();

    char[] chars = {'A', 'B', 'C', 'D', 'E', 'G', 'I', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', ' ', ','};
    int[] freqs = {11, 2, 4, 3, 14, 3, 6, 6, 3, 6, 7, 4, 1, 10, 4, 3, 4, 2, 17, 2};

    Node root = Huffman.buildHuffmanTree(chars, freqs);

    printHuffmanCodes(root, "");
}