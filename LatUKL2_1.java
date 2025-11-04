import java.util.Scanner;

public class LatUKL2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan bulat positif");

        int p = input.nextInt();
        if (p < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= p; i++) {
                faktorial *= i;
            }

            System.out.println("Faktorial dari " +p + " adalah "+faktorial);
        }
    }
    
}
