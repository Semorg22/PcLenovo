public class Clase16_04_2020 {

    //String java 8 en google, oracle, Methot summary
    //Funciones de String

    public static void main (String [] args) {

        String ejemplo = "TREE";
        char inicial = ejemplo.charAt(0);
        //char.At funciona para sacar un char de la cadena
        System.out.println(inicial);

        String cadena1 = "Politecnico";
        String cadena2 = "politecnico";

        //diferencia lexicografica
        System.out.println(cadena1.compareTo(cadena2));
        //omite mayusculas
        System.out.println(cadena1.compareToIgnoreCase(cadena2));
        //compara si dos cadenas son iguales
        System.out.println(cadena1.equals(cadena2));
        //omite mayus o minus
        System.out.println(cadena1.equalsIgnoreCase(cadena2));

        String ej1 = "Poli";
        String ej2 = "tecnico";
        //funciona como el +
        System.out.println(ej1.concat(ej2));

        String cadena = "Politecnico";
        String caden1 = "tecnico";
        //revisar que la cadena termine en algo especifico
        System.out.println(cadena.endsWith("ico"));

        //indice del caracter en la cadena, si son varias veces, solo devuelve el primero
        System.out.println(cadena1.indexOf('o', 2));

        String cad1 = "alfalfa";
        //indice inical de los caracteres, en este caso f
        // -1 si no lo encuentra
        System.out.println(cad1.indexOf("fa", 3));

        String vacia = "";
        //revisa si la cadena esta vacia
        System.out.println(vacia.isEmpty());

        //lo mismo que indexof pero de atras para adelante
        System.out.println(cad1.lastIndexOf('a', 5));
        System.out.println(cad1.lastIndexOf("fa", 4));

        System.out.println(cad1.length()); //el largo de la cadena

        //reemplaza las letras especificas
        String cad2 = "a l f alfa";
        System.out.println(cad2.replace(' ', '\u0000'));

        //Empieza con, tal cosa, la inversa de endswith
        System.out.println(cad1.startsWith("a"));

        String x = "Miren este ejemplo";
        //hacer una subcadena desde tal indice hasta el fin
        System.out.println(x.substring(5));
        //hacer subcadena entre indices
        System.out.println(x.substring(6,10));

        //convertir cadena a arreglo de caracteres
        char []arreglo_x = x.toCharArray();
        //imprimir arreglo
        for (int i = 0; i < arreglo_x.length ; i++) {
            System.out.print(arreglo_x[i]);
        }
        System.out.println();

        //pasar minusculas
        System.out.println(x.toLowerCase());
        //pasar a mayusculas
        System.out.println(x.toUpperCase());

        //borrar espacios al inicio y al final
        String y = "  Miren  ";
        System.out.println(y.trim());
    }
}
