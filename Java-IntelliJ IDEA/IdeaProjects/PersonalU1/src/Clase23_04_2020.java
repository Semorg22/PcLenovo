public class Clase23_04_2020 {
    //Cadenas y caracteres, ejercicios

    public static void main (String [] args){

        String x = "Reconocer";
        System.out.println("1. \"" + x + "\"" + es_palindrome(x));
        String frase = "Anita lava la tina";
        System.out.println("2. \"" + frase + "\"" + es_palindrome(frase));
        System.out.println("3. \"" + frase + "\" " + extraer_iniciales(frase));

        //Dadas dos cadenas s y t determine si t es una subcadena de s.
        String cadena = "Laboratorio";
        String cadena2 = "rato";
        System.out.println("4." + es_subcadena(cadena,cadena2));


    }

    //Es palindrome
    static String es_palindrome (String palabra){
        String pegada = eliminar_espacios(palabra);
        String minus = pegada.toLowerCase();
        for (int i = 0; i <=minus.length()/2; i++) {
            if(minus.charAt(i)!= minus.charAt(minus.length()-1-i)){
                return " no es palindrome";
            }
        }
        return " es palindrome";
    }

    //Iniciales de palabras en una frase
    static String extraer_iniciales (String frase){
        String iniciales ="";
        if(frase.charAt(0)!=' '){
            iniciales = iniciales+frase.charAt(0);
        }
        for (int i = 1; i < frase.length(); i++) {
            if(frase.charAt(i) != ' ' && frase.charAt(i-1) == ' '){
                iniciales = iniciales+frase.charAt(i);
            }
        }
        return iniciales;
    }

    //subcadena de una palabra
    static boolean subcadena (String s, String c){
        for (int i = 0; i < s.length()-c.length()+1; i++) {
            if (s.substring(i,i+c.length()).equals(c)){
                return true;
            }
        }
        return false;
    }
    //subcadena de una palabra, javier
    static boolean es_subcadena (String s, String t){
        return s.indexOf(t) != -1;
    }

    //eliminar espacios
    static String eliminar_espacios(String x){
        String y="";
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)!= ' '){
                y = y+x.charAt(i);
            }
        }
        return y;
    }
}
