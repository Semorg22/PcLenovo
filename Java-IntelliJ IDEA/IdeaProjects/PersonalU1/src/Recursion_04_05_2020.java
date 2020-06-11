//Recursion es una alternativa a ciclos
//Revisar cuaderno
//Escribir caso recursivo: buscar la relación de recurrencia -> Resolver a mano un ejemplo pequeño
public class Recursion_04_05_2020 {

    public static void main(String [] args){
        System.out.println("Explicación: " + f(5));
        System.out.println("A) Factorial: " + factorial_javier(5));
        System.out.println("B) Elevar uno en otro: " + elevar_javier(4,5));
        System.out.println("C) Par: " + par_javier(5));
        System.out.println("D) M.C.D: " + MCD_javier(50,15));
    }

    //A). Dado un numero natural n, calcule el factorial de n
    //    5! = ((((1)*1)*2)*3)*4)*5
    //    5! = 4!*5
    //    5! = 3!*4*5
    //B). Dado un numero real x, y un numero natural n. retorne el valor de elevar x a la n.
    //C). Dado un numero natural n, determine si n es par o no.
    //D). Dados dos numeros naturales a y b calcule el M.C.D(a,b)

    //Dado un numero natural n, calcule la suma de sus digitos.
    // n = 3876 -> 24     n = 373 -> 13

    //Explicación
    static int f(int x){
        //caso base
        if(x==1){
            return 1;
        }
        //caso recursivo
        else{
            return f(x-1)+x;
        }
    }

    // A).
    static int factorial_javier(int n){
        //caso base
        if(n==0){
            return 1;
        }
        //caso recursivo
        else{
            return factorial_javier(n-1)*n;
        }
    }

    // B).
    static double elevar_javier(double num, int n){
        //caso base
        if(n==0){
            return 1;
        }
        //caso recursivo
        else{
            return elevar_javier(num,n-1)*num;
        }
    }

    // C).
    static boolean par_javier(int n){
        //casos base
        if(n==0){
            return true;
        }
        else if(n==1){
            return false;
        }
        //caso recursivo
        else{
            return par_javier(n-2);
        }
    }

    // D).
    static int MCD_javier(int a, int b){
        //casos base
        if(a%b==0){
            return b;
        }
        //caso recursivo
        else{
            return MCD_javier(b,a%b);
        }
    }
}
