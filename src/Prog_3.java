/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/
public class Prog_3 {
    public static void main(String[] args) {
        long l = 600851475143L;
        for (long n = 2; n < l; ++n) {
            while (l % n == 0) {
                l = l / n;
            }
        }
        System.out.println(l);
    }
}
