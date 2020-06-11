import java.util.Scanner;
public class pared {

    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        System.out.println(pintura(a,b));
    }

    static int pintura (int a, int b){
        return a*b;
    }
}
