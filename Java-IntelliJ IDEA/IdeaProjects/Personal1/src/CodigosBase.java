import java.util.Scanner; //esto importa el scanner es decir, poder teclear
public class CodigosBase {

    /*  Tipos de variables primitivos
        Enteros:
	        byte = [-128,127] (8 bits)
	        short = [-32768,32767] (16 bits)
	        int = [-2 "elevado a la" 31,2"elevado a la"31-1] (32 bits)    (VALOR PREDETERMINADO JAVA)
	        long = [-2 "elevado a la" 63,2"elevado a la"63-1] (64 bits)
	    Reales:
	        float = numeros flotantes / decimales (32 bits)
	        double = numeros dobles / decimal doble que el float (64 bits)    (VALOR PREDETERMINADA JAVA)

	    char = caracteres
	    boolean = boleanos, verdaderos o falsos

	    [NO APLICA PARA PRIMITIVOS] String = cadenas de texto
	 */

    public static void main(String[] args) { //siempre debe ir, para comenzar a programar
        Scanner teclado=new Scanner (System.in); //esto es necesario para lo mismo, el escaner

        imprimir_cuadrado(5);
        System.out.println();

        System.out.println("Digite un número: ");
        int primeruso = teclado.nextInt();  //poner teclado.next(Tipo de variable)(); para que el valor sea dado por teclado
        System.out.println("Su primer número es: " + primeruso);

        System.out.println("Digite el año de ingreso a la U:");
        short año = teclado.nextShort();
        System.out.println("Digite el semestre de ingreso a la U:");
        byte semestre= teclado.nextByte();

        //IF Y ELSE
        if(año>=2018 && semestre>=1){ // if(poner condicion) y corchete{
            System.out.println("Lleva menos de cinco semestres"); //si se cumple, aqui poner que hacer
        }   //cierre del corchete del if
        else{   //else = en caso de que no cumpla el if poner else tambien con su corchete{
            System.out.println("Lleva mas de cinco semestres");   //si no se cumple, aqui poner que hacer
        }   //cierre del corchete del else

        //FOR
        for (int contador = 0;contador <= 20;contador++){
            System.out.println("\nEste es un for que cuenta: "+ contador); /* "\n" sirve para hacer un salto de linea*/
        }

        //WHILE
        int x = 0; //normal, valor de la variable.
        while/*mientras*/(x < 10/*x sea menor a 10, hacer lo que haya en el while.*/){
            System.out.println("\nX es: " + x);
            x+= 2;//operación para aumentar la variable.
        }

        //LLAMADA DE METODOS
        double xa = 292;
        double xb = 8;
        double sum=calcular_suma(xa,xb);    //en el main se puede llamar un metodo, se utiliza para no repetir codigo
        System.out.println(sum);    //sino que para poder reutilizarlo

        //ARREGLOS

        /*
        Arreglos de double y float inicializan en 0.0
        Arreglos de byte, short, int y long inicializan en 0
        Arreglos de boolean inicializan en false
        Arreglos de char inicializan en ' /u0000'
        Arreglos de string inicializan en null
        */

        double[] notas; //Declaración
        notas = new double[2]; //Creación

        //                  0   1       Posiciones
        double[] notas1 = {1.0,2.0};
        notas1[0] = 4.5; // para cambiar un valor se pone, arreglo, indice y luego el nuevo valor
        System.out.println(notas1[0]);

        //Posición de []
        //double[] notas; == double notas[];
        // Tambien se puede en una sola linea la declaracion y la creación
        // Tamaño debe ser int, puede ser variable, operación o número
        // double[] notas = new double[37];

        //MATRICES
        //Dada una matriz de enteros, devuelva la traspuesta
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

    //METODO PARA MATRIZ TRASPUESTA
    static int[][] traspuesta(int[][]E){
        int[][]ETrasp = new int [E[0].length][E.length];
        for (int i = 0; i < E.length; i++) {
            for (int j = 0; j < E[0].length; j++) {
                ETrasp[j][i] = E[i][j];
            }
        }
        return ETrasp;
    }

    //METODOS
    static/*siempre*/ double/*tipo de dato final*/ calcular_suma/*nombre*/ (double xa, double xb/*parametros*/){
        //  un metodo debe ir por fuera del main, no importa el orden
        double suma=xa+xb;
        return suma;    //debe ponerse el return al final para cerrar el metodo
        //cuando se abre el metodo se hace un cotrato, el return debe devolver el dato que puse despues del static
    }

    //METODO DE FOR,
    static void imprimir_cuadrado(int n){
        //nos movemos al mismo tiempo por filas y columnas (pero columnas es mas rapido), por eso es un for anidado.

        for (int i=1;i<=n;i++){ //for para las filas.

            for(int j=1;j<=n;j++){ //for para las columnas.
                System.out.print("@ ");
            }
            System.out.println();//salto de linea para poder imprimir segunda fila.
        }
    }
}