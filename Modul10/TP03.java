public class TP03 {

    public static void main(final String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (prima(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean prima(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
            
        } 
        return true;
        
    }
}