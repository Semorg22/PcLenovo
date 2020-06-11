import java.util.Scanner;
public class Parcial_Tercer_Corte {

    //Sebastian Felipe Moreno Gómez     CODIGO: 1920010692

    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);

        System.out.print("1.Digite el numero de cuadros: ");
        int c = teclado.nextInt();
        System.out.println("Sissa debe recibir " + cuadros_por_grano(c) + " granos.");

        System.out.println();//linea
        String s = "toro";
        String t = "computadores";
        System.out.println("2." + "\""+s+"\"" + " es sub-secuencia de " + "\""+t+"\"" + ": " + secuencia(s,t,s.length(),t.length()));

    }

    static int cuadros_por_grano (int c){
        if(c==1){
            return 1;
        }
        else if(c==2){
            return 2;
        }
        else{
            return cuadros_por_grano(c-1) * 2;
        }
    }

    static boolean secuencia (String S, String T, int i, int j){
        if (i == 0) {
            return true;
        }
        else if (j == 0) {
            return false;
        }
        else if (S.charAt(i-1) == T.charAt(j-1)) {
            return secuencia(S, T, i - 1, j - 1);
        }
        else {
            return secuencia(S, T, i, j - 1);
        }
    }
}
