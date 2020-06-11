import java.util.Scanner;
public class Pruebas {

    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);

        String n = "m";
        String t = "conputador";
        System.out.println(eliminar_primero(eliminar_primero("HOLA")));
        System.out.println(sub_secu(n,t,0));
        System.out.println(t.indexOf(n));












        /*PEDIR UNA MATRIZ POR TECLADO, CON VALORES INTERNOS

        System.out.print("Ingrese la cantidad de filas: ");
        int filas = teclado.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int columnas = teclado.nextInt();
        int matriz [][] = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese valor de la posicion " + i + j + ": ");
                matriz[i][j]=teclado.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }


        //HACER MATRIZ DE NUMEROS ALEATORIOS ENTRE 1 Y 9
        int a = 1;
        int b = 9;
        int fila = 4;
        int columna = 4;
        int [][] matriz_int = new int [fila][columna];
        for (int i = 0; i < matriz_int.length; i++) {
            for (int j = 0; j < matriz_int[0].length; j++) {
                matriz_int[i][j] = (int)Math.floor(Math.random()*(a-b)+b);
                System.out.print(matriz_int[i][j]);
            }
            System.out.println();
        }

        PEDIR ARREGLO INT CON VALORES
        System.out.println("Ingrese tamaño del arreglo");
        int x = teclado.nextInt();
        int arreglo [] = new int[x];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Dijite psicion" + i);
            arreglo[i]=teclado.nextInt();
        }*/

    }

    static String eliminar_primero(String E){
        String U = "";
        for (int i = 1; i < E.length(); i++) {
            U= U + E.charAt(i);
        }
        return U;
    }

    static boolean sub_secu (String S,String T,int i){
        if(T.indexOf(S.charAt(i))==-1){
            return false;
        }
        else{
            return true;
        }
    }
}
