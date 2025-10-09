public class TP02 {

    public static void main(final String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int transaksi = input.nextInt(); 
        double total = transaksi; 
        double diskon = 0;
        double pajak, totalBayar;

        
        if (transaksi > 200000) {
            diskon = transaksi * 0.05; 
        }

        total -= diskon; 
        pajak = total * 0.11; 
        totalBayar = (int)total + pajak; 

        System.out.println("Transaksi = " + transaksi);
        if (diskon > 0) {
            System.out.println("Total = " + transaksi + " - " + diskon);
        } else {
            System.out.println("Total = " + transaksi);
        }
        System.out.println("Ppn 11% = " + pajak);
        System.out.println("Total dibayar = " + totalBayar);
    }
}
