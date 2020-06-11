import java.util.Scanner;
public class Ejercicio_Metodos_taller4y5 {

    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio 1");
        System.out.println("Ingrese las coordenadas (x y) separadas por un espacio y presione enter para continuar");
        System.out.print("Ingrese coordenada del caballo: ");
        int fila_cab = teclado.nextInt();
        int columna_cab = teclado.nextInt();
        System.out.print("Ingrese coordenada del rey: ");
        int fila_rey = teclado.nextInt();
        int columna_rey = teclado.nextInt();

        String J = calcular_el_jaque(fila_cab, columna_cab, fila_rey,columna_rey);
        System.out.println("\n" + J);

        System.out.println("\nEjercicio 2");
        System.out.println("Ingrese las coordenadas (x y) separadas por un espacio y presione enter para continuar");
        System.out.print("Ingrese primera coordenada: ");
        double xa = teclado.nextDouble();
        double ya = teclado.nextDouble();
        System.out.print("Ingrese segunda coordenada: ");
        double xb = teclado.nextDouble();
        double yb = teclado.nextDouble();
        System.out.print("Ingrese tercera coordenada: ");
        double xc = teclado.nextDouble();
        double yc = teclado.nextDouble();

        String C = puntos_colineales(xa,ya,xb,yb,xc,yc);
        System.out.println("\n" + C);
    }

    static String calcular_el_jaque(int fila_caballo, int columna_caballo, int fila_del_rey, int columna_del_rey){
        double distancia = Math.sqrt((Math.pow(fila_del_rey-fila_caballo,2))+(Math.pow(columna_del_rey-columna_caballo,2)));
        double valor_jaque = Math.sqrt(5);

        if (distancia == valor_jaque){
            return "El rey esta en jaque";
        }
        else{
            return "El rey no esta jaque";
        }
    }

    static String puntos_colineales(double xa, double ya, double xb, double yb, double xc, double yc){
        double distancia_xa_xb = Math.sqrt((Math.pow(xb-xa,2))+(Math.pow(yb-ya,2)));
        double distancia_xb_xc = Math.sqrt((Math.pow(xc-xb,2))+(Math.pow(yc-yb,2)));
        double distancia_xa_xc = Math.sqrt((Math.pow(xc-xa,2))+(Math.pow(yc-ya,2)));
        double suma_distancia = distancia_xa_xb + distancia_xb_xc;

        if (suma_distancia == distancia_xa_xc){
            return "Los puntos son colineales";
        }
        else{
            return "Los puntos no son colineales";
        }
    }
}
