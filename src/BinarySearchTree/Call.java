package BinarySearchTree;

import javax.naming.BinaryRefAddr;
import java.util.Scanner;

public class Call {
    public static void main(String[] args) {
//        BinaryTree sv = new BinaryTree();
//        Scanner scanner = new Scanner(System.in);
        int[] nums = {1,2,3,4,5,6,7,8};
        BinarySearchTree sv = new BinarySearchTree();
        sv.populateSorted(nums);
        sv.display();
    }
}
