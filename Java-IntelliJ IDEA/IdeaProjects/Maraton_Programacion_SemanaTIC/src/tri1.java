import java.util.Scanner;
public class tri1 {
    
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);

        int filas = teclado.nextInt();
        int columnas = 2;
        int matriz [][] = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=teclado.nextInt();
            }
        }
        
    }

    static String palabra (){
        return "NO ES POSIBLE";
    }
}
