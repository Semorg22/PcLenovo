import java.util.Scanner;
public class Taller_Recursion_11_05 {

    //Sebastian Moreno  Codigo: 1920010692
    //Julian Naranjo    Codigo: 1920010409
    //Paula Duarte      Codigo: 1920010763
    //Santiago Acosta   Codigo: 1920010823

    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);

        System.out.print("1.Digite el numero de piedras: ");
        int p = teclado.nextInt();
        System.out.println("Indiana tardara " + orden_indiana(p) + " segundos.");

        System.out.println();

        System.out.print("2.Digite el numero de cuadros: ");
        int c = teclado.nextInt();
        System.out.println("Sissa debe recibir " + cuadros_por_grano(c) + " granos.");

        System.out.println();

        System.out.print("3.Digite el numero de piedras en el juego: ");
        int pj = teclado.nextInt();
        System.out.println(juego_piedras(pj) + " es el ganador.");

    }

    static int orden_indiana (int p){
        if(p==1){
            return 1;
        }
        else{
            return orden_indiana (p-1) * p;
        }
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

    static String juego_piedras (int pj){
        if(pj==1){
            return "David";
        }
        else if(pj==2){
            return "Juan";
        }
        else{
            if(juego_piedras(pj-1)=="Juan" && juego_piedras(pj-2)=="Juan"){
                return "David";
            }
            else if(juego_piedras(pj-1)=="David" || juego_piedras(pj-2)=="David"){

            }
            return "Juan";
        }
    }
}   
