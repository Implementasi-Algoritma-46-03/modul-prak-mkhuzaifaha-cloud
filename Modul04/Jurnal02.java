
import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiN = sc.nextInt();
        int penghasilan1 = nilaiN * 1000000;
        double pajak = 0;

        String statuspajak ="";
         if (nilaiN > 500){
            pajak = penghasilan1 * 0.3 ;
            statuspajak = "30%";
        }else if (nilaiN > 251){
            pajak = penghasilan1 * 0.25;
            statuspajak = "25%";
         }else if (nilaiN > 51){
            pajak = penghasilan1 * 0.15;
            statuspajak = "15%";
        }else if (nilaiN > 0){
            pajak = penghasilan1 * 0.05;
            statuspajak = "5%";
        
        
        }
        int jumlahpajak = (int) pajak;
        int penghasilanSetelahPajak = penghasilan1 - jumlahpajak;

        System.out.println("Penghasilan kotor = " + nilaiN + " juta Rupiah");
        System.out.println("Pajak " + statuspajak + " = Rp. " + jumlahpajak);
        System.out.println("Penghasilan bersih = Rp. " + penghasilanSetelahPajak);
        
    }
}
