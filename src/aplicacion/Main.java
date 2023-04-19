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

        String decode1 = huffman.decode(root,
                        "1000101110101100001011101000111000001101100000011110011110100101100001101001110011010001" +
                        "011101011111110100001111001111110011110100011000110000001011010111101111111011101011011" +
                        "01110011101101111001111111001010010100101000001011010110001011001101000111001001011000011" +
                        "001000110101101010111111111110110111011100100001001010110001111111000100011101100110010110" +
                        "10001101111101011010001101110000000111001001010100011111100001100101101011100110011110100" +
                                "011000110000001011010111110011100");

        String decode2 = huffman.decode(root,
                        "0110101011011100101000111101011100110111010110110100001000111010100101111010011111110111" +
                                "00101000111101011100110111010110000110001001101000111001001000110001011001100111" +
                                "0010010000111101111010");

        System.out.println(decode1);
        System.out.println(decode2);
    }
}