/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/
public class Prog_4 {
    private static boolean ispal(int i) {
        int reverse = 0;
        int initial = i;
        while (initial > 0) {
            reverse = 10 * reverse + (initial % 10);
            initial = initial / 10;
        }
        return reverse == i;
    }

    public static void main(String[] args) {
        int val = 1;
        for (int j = 999; j >= 100; j--) {
            for (int k = 999; k >= 100; k--) {
                int mul = j * k;
                if (mul > val && ispal(mul)) {
                    val = mul;
                }
            }
        }
        System.out.println("Number is :" + val);
    }
}
