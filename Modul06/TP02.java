import java.util.Scanner;

public class TP02 {

    public static String hapusVokal(String kalimat) {
       
        String vokal = "aiueoAIUEO";
        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);
            if (vokal.indexOf(c) == -1) {
                hasil.append(c);
            }
        }

        return hasil.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan kalimat:");
        String kalimat = input.nextLine();

        String kalimatTanpaVokal = hapusVokal(kalimat);

        System.out.println("Kalimat tanpa vokal:");
        System.out.println(kalimatTanpaVokal);

        input.close();
    }
}