//Clase ejercicios de recursión
public class Recursion_07_05_2020 {

    public static void main (String [] args){

        //Dado un numero natural n, devuelva un valor que indique si n es par o no
        //0 1 2 3 4 5 6 7 8 9 10
        System.out.println("Es par: " + es_par_javier(8));

        /* Manera en que funciona
        es_par(8)
        =es_impar(7)
        =es_par(6)
        =es_impar(5)
        =es_par(4)
        =es_impar(3)
        =es_par(2)
        =es_impar(1)
        =true
            *Listo, da true y sube de ahi para arriba
        */

        //Dado un numero natural i, retorne el i-esimo elemento de la sucesión de fibonachi
        // 1 1 2 3 5 8 13 21 34 55 89 144 233
        // i=6 -> 8
        // i=10 -> 55
        System.out.println("Termino Fibonacci: " + fib_javier(4));

        //Dadon nos numeros naturales A y B, calcule el cociente entre A y B.
        //No usar ni multiplicación, ni division, ni residuo
        // A=27 B=7, ->3
        // A=14 B=3, ->4
        System.out.println("Cociente: " + cociente(21,7));

    }

    //TIPO DISTINTO DE RECURCION = *CRUZADA*
    static boolean es_par_javier (int n){
        if(n==0) {
            return true;
        }
        else{
            return es_impar_javier(n-1);
        }
    }

    static boolean es_impar_javier (int n){
        if(n==0){
            return false;
        }
        else{
            return es_par_javier(n-1);
        }
    }
    //  Es decir llama a otro metodo que llama a el primero, al menos dos metodos.

    //Otro tipo especial, porque llama dos veces a si mismo, no una.
    static int fib_javier (int i){
        if(i==1 || i==2){
            return 1;
        }
        else{
            return fib_javier(i-1) + fib_javier(i-2);
        }
    }

    static int cociente (int a, int b){
        if(a-b < 0){
            return 0;
        }
        else{
             return cociente(a-b,b)+1;
        }
    }
}
