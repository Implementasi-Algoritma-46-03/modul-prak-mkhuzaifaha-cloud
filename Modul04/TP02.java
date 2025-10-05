public class TP02 {

    public static void main(final String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int transaksi = input.nextInt(); // Membaca total transaksi awal
        double total = transaksi; // Total awal tanpa diskon
        double diskon = 0; // Variabel untuk menyimpan diskon
        double pajak, totalBayar;

        // Jika belanja lebih dari 200.000, dapat diskon 5%
        if (transaksi > 200000) {
            diskon = transaksi * 0.05; // 5% dari total transaksi
        }

        total -= diskon; // Kurangi diskon dari total
        pajak = total * 0.11; // Pajak 11% dari total setelah diskon
        totalBayar = total + pajak; // Total akhir setelah ditambah pajak

        // Cetak hasil sesuai format soal
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
