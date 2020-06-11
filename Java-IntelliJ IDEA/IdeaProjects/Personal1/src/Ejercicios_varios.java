public class Ejercicios_varios {

    public static void main (String [] args){
        imprimir_triangulo(5);
        System.out.println();
        imprimir_cuadrado(5);
    }

    static void imprimir_triangulo(int N){
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void imprimir_cuadrado(int n){
        //nos movemos al mismo tiempo por filas y columnas (pero columnas es mas rapido), por eso es un for anidado.

        for (int i=1;i<=n;i++){ //for para las filas.

            for(int j=1;j<=n;j++){ //for para las columnas.
                System.out.print("# ");
            }
            System.out.println();//salto de linea para poder imprimir segunda fila.
        }
    }
}
