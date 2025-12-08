import java.util.Scanner;
public class TP01 {

    public static void main(final String[] args) {
       
        Scanner in = new Scanner(System.in);
        double[][] index = new double[1][10];  
        double[][] index2 = new double[1][10];

        for (int i = 0; i < 10; i++) {
            index[0][i] = in.nextDouble();
        }
        for (int j = 0; j < 10; j++) {
            index2[0][j] = in.nextDouble();
        }
        bubbleSort(index);
        bubbleSort(index2);

         for (int i = 0; i< 10;i++){
            System.out.printf("%.2f",index[0][i]);
             if (i < 9){
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int j = 0; j< 10;j++){
            System.out.printf("%.2f",index2[0][j]);
             if (j < 9){
                System.out.print(" ");
            }
        }
        in.close();

    }
    public static void bubbleSort(double[][] index) {
        int n = index[0].length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (index[0][j] > index[0][j+1]) {
  
                    double temp = index[0][j];
                    index[0][j] = index[0][j+1];
                    index[0][j+1] = temp;
                }
            }
        }
       
    }

}