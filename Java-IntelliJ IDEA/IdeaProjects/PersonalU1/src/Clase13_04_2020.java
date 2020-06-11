import java.util.Scanner;
public class Clase13_04_2020 {
    /*
    CARACTERES Y CADENAS
    ~ Tema no entra en parcial de segundo corte
    ---------------------------------------------
    °CHAR
    ~ 16bits (caracteres)
    ~ Puede ser un numero o un simbolo
    ~ '' se utilizan para indicar un caracter / Ejemplo: 'A'
    ---------------------------------------------
    ° CARACTERES DE OPERACION

    ~ '\t' tabulador horizontal (TECLADO: el tab, arriba de la bloq mayús)
    ~ '\n' Nueva linea (TECLADO: enter)
    ~ '\b' Backspace (TECLADO: borrar, encima del enter)
    ~ '\"' Comillas dobles (TECLADO: simbolo del 2)
    ~ '\'' Comillas sencillas (TECLADO: debajo del simbolo pregunta final)
    ~ '\\' Barra invertida sencilla (TECLADO: con el anerior)
    ---------------------------------------------
    ° CADENAS

    ~ Tipo de dato
    ~ Coleccion secuencial (ordenada) de caracteres usados para representar un texto
    ~ Vector de caracteres
    String (tipo de dato de cadena)
    ~ Como los arreglos, tiene pocisiones desde 0 hasta (tamaño de cadena-1)
    ~ nombreCadena.length() [length con cadenas, pones los parentesis]
    ~ charAt(0) = extrae el caracter 0, pocision 0
    */
    public static void main (String [] args){
        Scanner teclado =new Scanner (System.in);

        String x = "Politecnico";
        String y = "Grancolombiano";
        String z = x+" "+y;
        System.out.println(z);

        System.out.println(y.charAt(y.length()-1));

        char inicial=x.charAt(0);
        System.out.println(inicial);
        System.out.println(x.equals(y)); //comparar dos cadenas .equals()

        //--------------------------------------------------------------------------------------------------------------

        //Declaracion,inicializacion
        String a = "Poli";
        //Acceso
        System.out.println(a.charAt(2));

        //Recorrido
        for(int i=0;i<a.length();i++){
            System.out.print(x.charAt(i));
        }

        System.out.print("\"Ejemplo con comillas dobles y slato de linea.\"\n");
        System.out.print("Dijite la cadena: ");
        String w = teclado.nextLine();
        System.out.println("Dijito: " + w);
    }
}
