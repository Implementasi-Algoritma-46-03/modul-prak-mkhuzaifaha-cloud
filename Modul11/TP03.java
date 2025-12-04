import java.util.Scanner;
public class TP03 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String kalimat = sc.nextLine();
        String[] kata = kalimat.trim().split("\\s+");
        System.out.print(kata.length);
        }

    }

