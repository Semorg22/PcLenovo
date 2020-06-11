public class Ejercicios_Cadenas_Caracteres {

    public static void main (String [] args){

        //1. Dada una palabra, determinar si es palindrome(se escribe igual de ambos lados).
        //Reconocer = SI
        //Hola = NO
        String x = "reconocer";
        System.out.println("1. \"" + x + "\"" + " es palindrome segun java: " + es_palindrome(x));

        //2. Dada una cadena, retorne la cadena sin espacios.
        //x = "Poli 2020 4ever"
        //y = "Poli20204ever"
        String y = "Poli 2020 4ever";
        System.out.println("2. \"" + y + "\"" + " sin espacios es: " + eliminar_espacios(y));

        //3. Dada una letra mayuscula del abecedario ingles, retorne la letra minuscula.
        char z = 'P';
        System.out.println("3. \"" + z + "\"" + " minuscula es: " + minuscula(z));

        //4. Dada una cadena del abecedario ingles en mayuscula, retorne la cadena en minuscula
        String a = "MONDAY";
        System.out.println("4. \"" + a + "\"" + " en minuscula es: " + minuscula(a));

    }

    //1.
    static boolean es_palindrome (String palabra){
        for (int i = 0; i <=palabra.length()/2; i++) {
            if(palabra.charAt(i)!= palabra.charAt(palabra.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    //2.
    static String eliminar_espacios(String x){
        String y="";
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)!= ' '){
                y = y+x.charAt(i);
            }
        }
        return y;
    }

    //3.
    static char minuscula (char x){
        return (char)(x+32); //pasar el int(la suma lo vuelve a int) a char
    }

    //4.
    static String minuscula (String x){
        String y = "";
        for (int i = 0; i < x.length(); i++) {
            y = y+minuscula(x.charAt(i));
        }
        return y;
    }
}
