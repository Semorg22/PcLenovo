public class Arreglos_Matrices {

    public static void main (String [] args){
        //Imprimir cuadrado
        cuadrado(5);
        System.out.println();

        //Imprimir arreglo en cierta posicion
        double[]arreglo = {1,2,3,4,5,6};
        System.out.println(arreglo[4]);
        System.out.println();

        //Imprimir una matriz
        double[][]matriz = {{1.0,2.0},
                            {3.0,4.0},
                            {5.0,6.0},
                            {7.0,8.0}};
        matriz[3][1]=9.0;
        matriz[3][0]=8.0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Arreglo enteros
        int enteros[]= {11,2,13,234,25,1};

        //Menor y Mayor
        int Entero_menor = menor(enteros);
        System.out.println("Entero menor: " + Entero_menor);
        int Entero_mayor = mayor(enteros);
        System.out.println("Entero mayor: " + Entero_mayor);

        //Arreglo con enteros menor y mayor
        System.out.println();
        int Entero_mayor_menor[] = arreglo_mayor_menor(Entero_menor,Entero_mayor);
        System.out.print("Arreglo:  ");
        for(int i=0;i<Entero_mayor_menor.length;i++){
            System.out.print(Entero_mayor_menor[i] + " ");
        }
        System.out.println();
        System.out.println();

        //Retornar n o -1 de arreglo enteros
        int n = 3;
        int PscionN = Posicion_N_enArreglo(enteros,n);
        System.out.println(PscionN);

    }

    static void cuadrado (int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("& ");
            }
            System.out.println();
        }
    }

    static int menor (int[]arregloN){
        int MENOR = arregloN[0];
        for(int i=0;i<arregloN.length;i++){
            if(MENOR>arregloN[i]){
                MENOR = arregloN[i];
            }
        }
        return MENOR;
    }

    static int mayor (int[]arregloN){
        int MAYOR = arregloN[0];
        for(int i=0;i<arregloN.length;i++){
            if(MAYOR<arregloN[i]){
                MAYOR = arregloN[i];
            }
        }
        return MAYOR;
    }

    static int[]arreglo_mayor_menor(int n, int m){
        int arreglo[] = {n,m};
        return arreglo;
    }

    static int Posicion_N_enArreglo(int[]arregloN,int n){
        for(int i=0;i<arregloN.length;i++){
            if(n == arregloN[i]){
                return arregloN[i];
            }
        }
        return -1;
    }
}
