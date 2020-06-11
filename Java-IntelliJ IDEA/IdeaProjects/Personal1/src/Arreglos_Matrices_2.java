public class Arreglos_Matrices_2 {
    public static void main (String [] args){
        //Arreglo de enteros
        boolean booleanos[] = {false,true,true,false,false,false,true};

        //Invertida de arreglo
        boolean invertido[] = invertida(booleanos);
        for(int i=0;i<invertido.length;i++){
            System.out.print(invertido[i] + " ");
        }
        System.out.println();
        System.out.println();

        //Matriz de reales
        double reales[][]= {{1.2,2.0},
                            {4.5,4.5},
                            {4.5,2.0},
                            {1.2,2.0}};


        //Menor y mayor de la matriz
        System.out.println("Real menor: " + menor(reales));
        System.out.println("Real mayor: " + mayor(reales));
        System.out.println();

        //Repeticiones de n en la matriz
        double d = 2.0;
        int repeticion = Repeticiones_N(reales,d);
        System.out.println("Repeticiones de " + d + " en la matriz: " + repeticion);
        System.out.println();

        //Matriz traspuesta
        double[][]dobles = {{1.2,2.0},
                            {4.5,4.5},
                            {4.5,2.0},
                            {1.2,2.0}};
        double[][]Jmmm;
        Jmmm = traspuesta(dobles);
        for(int i=0;i<Jmmm.length;i++) {
            for (int j = 0; j < Jmmm[0].length; j++) {
                System.out.print(Jmmm[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean[]invertida (boolean []arrbool){
        boolean nuevo[] = new boolean[arrbool.length];
        for(int i=0;i<arrbool.length;i++){
            if(arrbool[i]==false){
                nuevo [i] = true;
            }
        }
        return nuevo;
    }

    static double menor(double[][]matriz){
        double MENOR = matriz[0][0];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                if(MENOR>matriz[i][j]){
                    MENOR = matriz[i][j];
                }
            }
        }
        return MENOR;
    }

    static double mayor(double[][]matriz){
        double MAYOR=matriz[0][0];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                if(MAYOR<matriz[i][j]){
                    MAYOR = matriz[i][j];
                }
            }
        }
        return MAYOR;
    }

    static int Repeticiones_N(double[][]matriz,double n){
        int contador = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                if(matriz[i][j] == n){
                    contador = contador + 1;
                }
            }
        }
        return contador;
    }

    static double[][]traspuesta(double[][]Hola){
        double [][]Adios = new double[Hola[0].length][Hola.length];
        for(int i = 0;i<Hola.length;i++){
            for(int j = 0;j<Hola[0].length;j++){
                Adios[j][i] = Hola[i][j];
            }
        }
        return Adios;
    }
}
