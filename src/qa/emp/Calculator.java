package qa.emp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner thisScan = new Scanner(System.in);
        int scanVal = thisScan.nextInt();
        int scanVal2 = thisScan.nextInt();
        thisScan.nextLine();
        System.out.println("Enter an operator: ");
        String scanOp = thisScan.nextLine();

        switch (scanOp){
            case "+":
                System.out.println(scanVal+scanVal2);
                break;
            case "/":
                System.out.println(scanVal/scanVal2);
                break;
            case "-":
                System.out.println(scanVal-scanVal2);
                break;
            case "%":
                System.out.println(scanVal%scanVal2);
                break;
            case "*":
                System.out.println(scanVal*scanVal2);
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
