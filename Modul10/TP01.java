public class TP01 {

   public static void main(String[] args) {
       int segitiga = 5;
       for (int i = segitiga; i >= 1; i--) {
             for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
