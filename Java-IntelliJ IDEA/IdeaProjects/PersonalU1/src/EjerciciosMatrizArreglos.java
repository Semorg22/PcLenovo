public class EjerciciosMatrizArreglos {

    public static void main (String [] args){
        /*
        {{'2','#','%','p'},
        {'j','O','+','&'},
        {'u','?','*','$'}};

        {{4,2},
        {3,6},
        {2,5},
        {3,0}};

        1. Dada una matriz de char, determine si la matriz es cuadrada o no
        2. Dada una matriz de char, devuelva la primera fila
        3. Dada una matriz de enteros, devuelva la traspuesta
        */
        char[][]M= {{'2','#','%','p'},
                    {'j','O','+','&'},
                    {'u','?','*','$'}};
        System.out.println(es_cuadrada(M));
        System.out.println();


        char[] solucion=primera_fila(M);
        for (int i = 0; i < solucion.length; i++) {
            System.out.print(solucion[i] + " ");
        }


        System.out.println();
        System.out.println();
        int [][]enteros={{4,2},
                         {3,6},
                         {2,5},
                         {3,0}};
        int[][]solucion2=traspuesta(enteros);
        for (int i = 0; i < solucion2.length; i++) {
            for (int j = 0; j < solucion2[0].length; j++) {
                System.out.print(solucion2[i][j]+" ");
            }
            System.out.println();
        }
    }


    static boolean es_cuadrada(char[][]matriz){
        return matriz.length==matriz[0].length;
    }

    static char[] primera_fila(char[][]matriz1){
        return matriz1[0];
    }

    static int[][] traspuesta(int[][]E){
        int[][]ETrasp = new int [E[0].length][E.length];
        for (int i = 0; i < E.length; i++) {
            for (int j = 0; j < E[0].length; j++) {
                ETrasp[j][i] = E[i][j];
            }
        }
        return ETrasp;
    }
}
