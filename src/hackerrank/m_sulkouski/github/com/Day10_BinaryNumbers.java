package hackerrank.m_sulkouski.github.com;

import java.util.Scanner;

public class Day10_BinaryNumbers {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a decimal  value: ");
        int n = Integer.parseInt(input.nextLine());
        int[]bitValue = decimalToBinary(n);


        for (int i : bitValue) {
            System.out.print(i);
        }

        System.out.println();
        System.out.println(countConsecutiveOneBits(bitValue));


        input.close();
    }

    public static int countConsecutiveOneBits(int[] bitValue) {
        int currentBit = 0;
        int oneBitCounter = 0;
        int largestConsecutive = 0;
        for (int i : bitValue) {
            currentBit = i;
            if (currentBit == 1) {
                oneBitCounter++;
                if(oneBitCounter > largestConsecutive) {
                    largestConsecutive = oneBitCounter;
                }
            }
            else {
                oneBitCounter = 0;
            }
        }
        return largestConsecutive;
    }

    public static int[] decimalToBinary(int decimal) {
        int[] binary;
        int counter = 0;
        int base = 1;
        int remainder = 0;

        while (base <= decimal) {
            if (base * 2 <= decimal) {
                counter++;
                base *= 2;
            } else {
                counter++;
                break;
            }
        }

        binary = new int[counter];
        for (int i = counter - 1; i > 0; i--) {
            if (decimal >= 2) {
                if (Math.pow(2, i) <= decimal) {
                    decimal -= Math.pow(2, i);
                    binary[i] = 1;
                } else {
                    binary[i - 1] = 0;
                }
            }
            binary[0] = decimal == 1 ? 1 : 0;
        }

        return binary;
    }
}
