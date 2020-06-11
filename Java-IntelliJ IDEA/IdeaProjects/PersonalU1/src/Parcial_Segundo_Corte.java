import java.util.Scanner;
public class Parcial_Segundo_Corte {

    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingrese tamaño de la matriz separado por un espacio: ");
        int filas = teclado.nextInt();
        int columnas = teclado.nextInt();
        int [][] matriz_piscina = matriz_int(filas,columnas);

        System.out.println("Su matriz es: ");
        for (int i = 0; i < matriz_piscina.length; i++) {
            for (int j = 0; j < matriz_piscina[0].length; j++) {
                System.out.print(matriz_piscina[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();//espaciado

        System.out.print("Digite fila y columna para borde piscina: ");
        int fila_usuario = teclado.nextInt();
        int columna_usuario = teclado.nextInt();
        boolean borde_piscina = borde(matriz_piscina,fila_usuario,columna_usuario);
        System.out.println("Se encuentra en el borde: " + borde_piscina);

        System.out.print("Digite fila y columna para 1 adyacente: ");
        int fila2_usuario = teclado.nextInt();
        int columna2_usuario = teclado.nextInt();
        boolean adyacente_uno = uno_adyacente(matriz_piscina,fila2_usuario,columna2_usuario);
        System.out.println("Tiene un 1 adyacente: " + adyacente_uno);


    }

    //Revisar si se encuentra en el borde de la piscina
    static boolean borde(int [][] matriz, int f, int c){
        if ((f==matriz.length-1 || f==0) || ((f!=matriz.length-1 || f!=0) && (c==matriz[0].length-1 || c==0))){
            return true;
        }
        else{
            return false;
        }
    }

    //Revisar si tiene un 1 adyacente
    static boolean uno_adyacente(int [][]matriz,int f, int c){
        if((f==0 || f==matriz.length-1) && c==0){
            if(matriz[f][c+1]==1 || matriz[f+1][c] == 1 || matriz[f+1][c+1] == 1){
                return true;
            }
            else{
                return false;
            }
        }
        if((f==0 || f==matriz.length-1) && c==matriz[0].length-1){
            if(matriz[f][c-1]==1 || matriz[f+1][c] == 1 || matriz[f+1][c-1] == 1){
                return true;
            }
            else{
                return false;
            }
        }
        if((f!=0 && f!=matriz.length-1) && c==0){
            if(matriz[f-1][c]==1 || matriz[f-1][c+1] == 1 || matriz[f][c+1] == 1 || matriz[f+1][c+1]
                    == 1 || matriz[f+1][c] == 1){
                return true;
            }
            else{
                return false;
            }
        }
        if((f!=0 && f!=matriz.length-1) && c==matriz[0].length-1){
            if(matriz[f-1][c-1]==1 || matriz[f-1][c] == 1 || matriz[f][c-1] == 1 || matriz[f+1][c-1]
                    == 1 || matriz[f+1][c] == 1){
                return true;
            }
            else{
                return false;
            }
        }
        if((f!=0 && f!=matriz.length-1) && (c!=0 && c!=matriz[0].length-1)){
            if(matriz[f-1][c-1]==1 || matriz[f-1][c] == 1 || matriz[f-1][c+1] == 1 || matriz[f][c-1]
                    == 1 || matriz[f][c+1] == 1 || matriz[f+1][c-1] == 1|| matriz[f+1][c]
                    == 1|| matriz[f+1][c+1] == 1){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    //MATRIZ
    static int [][]matriz_int (int fila, int columna){
        Scanner teclado = new Scanner (System.in);
        int matriz_int [][] = new int[fila][columna];
        for (int i = 0; i < matriz_int.length; i++) {
            for (int j = 0; j < matriz_int[0].length; j++) {
                System.out.print("Ingrese valor de la posicion " + i + j + ": ");
                matriz_int[i][j]=teclado.nextInt();
            }
        }
        return matriz_int;
    }
}
