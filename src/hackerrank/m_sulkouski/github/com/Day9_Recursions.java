package hackerrank.m_sulkouski.github.com;

public class Day9_Recursions {
    public static void main(String[] args) {
        System.out.println(factorialRecursion(5));
    }

    private static int factorialRecursion(int n) {
        if (n <= 1) {
            return 1;
        }

        else {
            return n * factorialRecursion(n-1);
        }
    }
}
