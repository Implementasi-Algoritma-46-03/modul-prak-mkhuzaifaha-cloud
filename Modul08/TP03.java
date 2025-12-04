import java.util.Scanner;
public class TP03 {
    
    public static void main(final String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int catatan;
        int hasil = 0; 
        do {
            catatan = sc.nextInt(); 
            hasil = hasil + catatan; 
        }while(catatan != 0); 
        System.out.println(hasil);

    }
}
