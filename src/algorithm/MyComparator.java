package algorithm;
import java.util.*;
import algorithm.Huffman;
import algorithm.HuffmanNode;

/**
 * Compare Huffman nodes
 */
public class MyComparator implements Comparator<HuffmanNode> {

    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.frequency - y.frequency;
    }
}