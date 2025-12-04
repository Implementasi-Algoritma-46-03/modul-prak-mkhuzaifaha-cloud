import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String kalimat = sc.nextLine();
        //Trim untuk menghilangkan spasi di antara kata
        //split untuk memisahkan kata 
        String[] kata = kalimat.trim().split("\\s+");

        for (int i = 0; i < kata.length; i++) {
            System.out.print(kata[i] + " ");
        }

    }
}

