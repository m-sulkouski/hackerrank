package hackerrank.m_sulkouski.github.com;

import java.util.Scanner;

public class Day10_BinaryNumbers {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println("Enter a decimal  value: ");
//        int n = Integer.parseInt(input.nextLine());


        input.close();
    }
    private static int[] decimalToBinary (int decimal) {
        int[] binary;
        int counter = 0;
        int base = 2;
        int remainder = 0;

        while (base < decimal) {
            if (base * 2 < decimal) {
                counter++;
                base *= 2;
            }
            else {
                break;
            }
        }

        binary = new int[counter];
        for (int i = binary.length; i > 0; i--) {
            if (decimal >= 2) {
                if (Math.pow(2,i) > decimal) {
                    decimal -= Math.pow(2,i);
                    binary[i-1] = 1;
                }
                else {
                    binary[i-1] = 0;
                }
            }
            else {
                if (decimal == 1) {
                    binary[0] = 1;
                }
                break;
            }

        }

        return binary;
    }
}
