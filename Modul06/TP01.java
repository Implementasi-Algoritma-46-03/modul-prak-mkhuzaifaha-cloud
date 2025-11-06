
import java.util.Scanner;

public class TP01 {
    public static void suhu() {
        Scanner input = new Scanner(System.in);
        double r1 = input.nextDouble();
        double r2 = input.nextDouble();
        double r3 = input.nextDouble();

        double celsius = r1 - 32 * 0.5555555555555556;
        double celsius2 = r2 - 32 * 0.5555555555555556;
        double celsius3 = r3 - 32 * 0.5555555555555556;

        double reamur = celsius * 0.8;
        double reamur2 = celsius2 * 0.8;
        double reamur3 = celsius3 * 0.8;

        System.out.printf("%.2f n%.2f %.2f\n ", celsius , celsius2 , celsius3 );
       System.out.printf("%.2f n%.2f %.2f\n ", reamur, reamur2 , reamur3 );
    }
        public static void main(String[] args) {
        suhu();
    }
}

