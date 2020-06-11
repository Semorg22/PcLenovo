import java.util.Scanner;
public class Parcial_programacion_DIANA{

    public static void main (String [] args){

        Scanner teclado = new Scanner (System.in);

        System.out.print("Ingrese tamaño del arreglo: ");
        int x = teclado.nextInt();
        char arreglo[] = arreglo_nuevo(x);
        System.out.print("Este es su arreglo: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
        }

        System.out.println();

        System.out.println("Ingrese dirección");
        System.out.print("(Izquierda = 1 o Derecha = 2) : ");
        int direccion = teclado.nextInt();
        System.out.print("Ingrese posiciones: ");
        int posicion = teclado.nextInt();

        System.out.println("Nuevo arreglo: ");
        String lado = direccionM(direccion);
        char nuevo[] = arreglo_caracteres(arreglo,lado,posicion);
        for (int i = 0; i < nuevo.length; i++) {
            System.out.print(nuevo[i]);
        }

        System.out.println();
        System.out.print("Digite el dia que desea verificar: ");
        int n;
        n = teclado.nextInt();
        int rey = pagorey(n);
        System.out.println("Tiene " + rey + " monedas");

    }

    static char [] arreglo_caracteres (char[] arreglo,String cadena, int x){
        char finall[] = new char [arreglo.length];
        int posicion = 0;
        if(cadena=="derecha"){
            for (int i = arreglo.length-1; i >= 0; i--) {
                posicion = i;
                if(posicion==arreglo.length-1){
                    posicion=0;
                    posicion+=x-1;
                    finall[posicion] = arreglo[arreglo.length-1];
                }
                if((posicion+x)>arreglo.length-1){
                    int posicion2 = (posicion+x)-arreglo.length;
                    finall[posicion2] = arreglo[posicion];
                }
                else{
                    int posicion2 = posicion+x;
                    finall[posicion2] = arreglo[posicion];
                }
            }
        }
        if(cadena=="izquierda"){
            for (int i = 0; i < arreglo.length; i++) {
                posicion = i;
                if(posicion==0){
                    posicion=arreglo.length;
                    posicion-=x+1;
                    finall[posicion] = arreglo[0];
                }
                if((posicion-x)<0){
                    int posicion2 = (posicion-x)+arreglo.length;
                    finall[posicion2] = arreglo[posicion];
                }
                else{
                    int posicion2 = posicion-x;
                    finall[posicion2] = arreglo[posicion];
                }
            }
        }
        return finall;
    }

    static char [] arreglo_nuevo (int x){
        Scanner teclado = new Scanner (System.in);
        char arreglo [] = new char[x];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Dijite caracter de la posicion " + i + ": ");
            arreglo[i] = teclado.next().charAt(0);
        }
        return arreglo;
    }

    static String direccionM (int direccion){
        String lado = "";
        if (direccion==1){
            lado = "izquierda";
        }
        else if(direccion==2){
            lado = "derecha";
        }
        return lado;
    }

    static int pagorey(int n){
        int suma = 0;
        int contador = 0;
        int moneda = 1;
        for (int i = 1; i <= n; i ++){
            suma = suma + moneda;
            contador = contador + 1;
            if (contador >= moneda){
                moneda = moneda + 1;
                contador = 0;
            }
        }
        return suma;
    }
}
