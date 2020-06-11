public class Ejercicios_Clase30_04_2020 {

    public static void main (String [] args){

        //Dada una cadena de texto, retorne la misma cadena invertida
        //S="Politecnico" T="ocincetiloP"
        String cadena="Politecnico";
        String invertida = cadena_alreves(cadena);
        System.out.println("\"" + cadena + "\"" + " invertida es: " + invertida);

        //Dadas dos cadenas S y T, determine si S y T son anagramas.
        // "amor" "roma" "omar" "ramo"
        String uno = "aroma";
        String dos = "omar";
        boolean anagramas = son_anagramas_javier(uno,dos);
        System.out.println("\""+uno+"\"" + " es anagrama de " + "\""+dos+"\"" + " : " + anagramas);

        //Dadas dos cadenas S y T, retorne el numero de veces que T esta contenido en S
        //S="Politecnico Grancolombiano" T="co" debe dar 2
        String one = "Politecnico Grancolombiano";
        String two = "co";
        int veces = encontrar_ocurrencias_javier(one,two);
        System.out.println("En " + "\""+one+"\"" + " esta " + "\""+two+"\": " + veces + " veces.");
    }

    static String cadena_alreves (String cadena){
        String invertida = "";
        char []arreglo = cadena.toCharArray();
        for (int i = arreglo.length-1; i >= 0; i--) {
            invertida += arreglo[i];
        }
        return invertida;
    }

    static String cadena_alreves_javier (String cadena){
        String invertida = "";
        for (int i = cadena.length()-1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }
        return invertida;
    }

    static boolean son_anagramas_javier(String x,String y){
        if (x.length()!=y.length()){
            return false;
        }
        for (int i = 0; i < x.length() ; i++) {
            if(y.indexOf(x.charAt(i))>=0){
                y=borrar_caracter_javier(y,y.indexOf(x.charAt(i)));
            }
        }
        return y.isEmpty();
    }

    static String borrar_caracter_javier (String S, int posicion){
        String nuevo="";
        for (int i = 0; i <posicion ; i++) {
            nuevo+=S.charAt(i);
        }
        for (int i = posicion+1; i < S.length(); i++) {
            nuevo+=S.charAt(i);
        }
        return nuevo;
    }

    static int encontrar_ocurrencias_javier(String S, String T){
        int contador = 0;
        int i = S.indexOf(T);
        while(i>-1){
            contador++;
            i=S.indexOf(T,i+1);
        }
        return contador;
    }
}


