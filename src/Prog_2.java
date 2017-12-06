public class Prog_2 {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k ;

        System.out.print("1 , 2 ,");
        for (k = 0; k< 4000000 ; k++) {
            k = i + j;
            i = j;
            j = k;
            System.out.println(" , " + k);
        }
    }
}
