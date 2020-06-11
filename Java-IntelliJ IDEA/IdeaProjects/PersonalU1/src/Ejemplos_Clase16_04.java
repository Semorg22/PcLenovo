public class Ejemplos_Clase16_04 {

    public static void main (String [] args){

        //dada una cadena de texto, censure un caracter
        //alfalfa == xlfxlfx
        System.out.println(censurar_letra("alfalfa",'a'));

        //buscar una palabra para censurar una palabra
        System.out.println(buscar_palabra("El tang es pa las perras","perras"));
        System.out.println(censurar_palabra("El tang es pa las perras","perras"));

    }

    static String censurar_letra (String S,char c){
        return S.replace(c,'x');
    }

    static String censurar_palabra (String S1,String S2){
        String S3 = "";
        int indice = buscar_palabra(S1,S2);
        if(indice==-1){
            S3=S1;
        }
        else{
            for (int i = 0; i < indice; i++) {
                S3 = S3+S1.charAt(i);
            }
            for (int i = indice; i < indice+S2.length(); i++) {
                S3 = S3+"x";
            }
            for (int i = indice+S2.length(); i < S1.length(); i++) {
                S3 = S3+S1.charAt(i);
            }
        }
        return S3;
    }

    static int buscar_palabra (String S1, String S2){
        for (int i = 0; i < S1.length()-S2.length()+1; i++) {
            if (S1.substring(i,i+S2.length()).equals(S2)){
                return i;
            }
        }
        return -1;
    }
}
