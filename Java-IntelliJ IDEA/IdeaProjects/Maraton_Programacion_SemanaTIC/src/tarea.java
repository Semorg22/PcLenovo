import java.util.Scanner;
public class tarea {

    //no funciono

    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);

        int x1 = teclado.nextInt();
        int y1 = teclado.nextInt();
        int x2 = teclado.nextInt();
        int y2 = teclado.nextInt();
        System.out.println(tarea(x1,y1,x2,y2));
    }

    static int tarea (int x1,int y1,int x2, int y2) {
        int contador = 0;
        if(x1==x2){
            if(y2>y1) {
                for (int i = y1; i <= y2; i++) {
                    contador++;
                }
                return contador;
            }
            else if(y1>y2){
                for (int i = y2; i <= y1; i++) {
                    contador++;
                }
                return contador;
            }
        }
        else if(x2>x1) {
            for (int i = x1; i <= x2; i++) {
                contador++;
            }
            return contador;
        }
        else if(x1>x2){
            for (int i = x2; i <= x1; i++) {
                contador++;
            }
        }
        return contador;
    }
}
