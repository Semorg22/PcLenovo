public class ArreglosyMatrices {
    //Marzo 30 de 2020 , Clase de 3:20pm hasta 6:40pm

    public static void main (String [] args){

        //Arreglos de double y float inicializan en 0.0
        //Arreglos de byte, short, int y long inicializan en 0
        //Arreglos de boolean inicializan en false
        //Arreglos de char inicializan en ' /u0000'
        //Arreglos de string inicializan en null

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


    }
}
