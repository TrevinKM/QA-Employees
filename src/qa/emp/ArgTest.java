package qa.emp;

import java.util.ArrayList;
import java.util.Scanner;

public class ArgTest {
    public static void varargs(String s, int ... nums){
        System.out.println(s);
        System.out.println("Number of arguments " + nums.length);
        for (int num1:nums) {
            System.out.println(num1);
        }
    }
    public static void varargs(int ... nums){
        System.out.println("Number of arguments " + nums.length);
        for (int num1:nums) {
            System.out.println(num1);
        }
    }

    public static void main(String[] args) {
//        ArrayList<Integer> nums = new ArrayList<>();
//
//
//        Scanner thisScan = new Scanner(System.in);
//
//        System.out.println("Enter an operator: ");
//        String scanOp = thisScan.nextLine();
//        System.out.println("Enter two numbers : ");
//
//        while (thisScan.hasNextInt()) {
//            int scanVal = thisScan.nextInt();
//            nums.add(scanVal);
//        }

        varargs(1,2,3,4,5);
        varargs("---Hello---",1,2,3,4,5,6);

    }
}
