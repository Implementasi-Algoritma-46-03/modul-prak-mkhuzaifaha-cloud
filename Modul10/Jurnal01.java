public class Jurnal01 {

    public static void main(final String[] args) {
      
       for (int pola = 0; pola <= 6; pola++){
        if (pola % 2 ==0){
            System.out.print(" ");
        } 
            for (int spasi = 1; spasi <= 5; spasi++){
            System.out.print(pola);

            if (spasi < 5 || pola % 2 != 0){
                System.out.print(" ");
                }
            }   
            
       System.out.println();
       }
    }
}

    
