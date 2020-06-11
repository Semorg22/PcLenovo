public class Recursion_21_05_2020 {
    //Recursion con cadenas

    public static void main (String [] args){

        //Dadas dos cadenas, determine si son iguales
        String a = "Politecnico";
        String b = "Politecnico";
        System.out.println(comparar_cadenas(a,b,0));

        //Dada una cadena retorne la misma cadena, alrevez
        System.out.println(palabra_alrevez(a));

    }

    static boolean comparar_cadenas (String a,String b,int i){
        if(a.length()!=b.length()){
            return false;
        }
        else if(a.charAt(i)!=b.charAt(i)){
            return false;
        }
        else if(i==a.length()-1){
            return true;
        }
        else{
            return comparar_cadenas(a,b,i+1);
        }
    }

    static String palabra_alrevez (String x){
        if(x.length()-1==0){
            return x;
        }
        else{
            return palabra_alrevez(x.substring(1)) + x.charAt(0);
        }

    }

    static boolean palindrome (String pal, int i){
        if(pal.charAt(i) != pal.charAt(pal.length()-1-i)){
            return false;
        }
        else if(i>=pal.length()/2){
            return true;
        }
        else{
            return palindrome(pal,i+1);
        }
    }
}
