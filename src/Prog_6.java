public class Prog_6 {
    public static void main(String[] args) {
        int sum_square = 0;
        int square_sum;
        int sum_numbers = 0;
        int diffrence;
        for (int i = 0; i <= 100; i++) {
            sum_square = sum_square + (i * i);
        }
        for (int j = 0; j <= 100; j++) {
            sum_numbers = sum_numbers + j;
        }
        square_sum = sum_numbers * sum_numbers;
        diffrence = square_sum - sum_square;
        System.out.println("Difference between the sum of the squares of the first one hundred natural numbers and the square of the sum = "+diffrence);
    }
}
