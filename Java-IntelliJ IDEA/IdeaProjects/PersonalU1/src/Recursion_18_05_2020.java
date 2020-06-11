public class Recursion_18_05_2020 {
    //Ejercicios de recursion con arreglos y/o Strings.

    public static void main (String [] args){

        /*
        Dado un arreglo de numeros reales, retorne la suma de sus elementos
        x={ 3.5 , 4.5 , 3.3 , 5.7 }

        Va a sumar cada uno y borrarlo del arreglo, luego cuando este vacio suma 0.
        x={ 3.5 , 4.5 , 3.3 , 5.7 }
                System.out.println(sumar_arreglo_sinrecorrer(x));
        */
        double[]x = { 3.5 , 4.5 , 3.3 , 5.7 };
        System.out.println(sumar_arreglo(x,x.length-1));

        /*
        Dada una matriz de reales, retorne la suma de sus elementos
         m = {{2.3,4.5,3.2},
              {3.4,4.6,0.3},
              {1.3,0.9,0.7}};
         suma = 17.0
         */
        double[][] m = {{2.3,4.5,4.5,3.2},
                        {3.4,4.6,5.6,0.3},
                        {1.3,0.9,5.7,0.7}};
        System.out.println(sumar_matriz(m,m.length-1,m[0].length-1));

        /*
        Dada una matriz de reales, retorne el menor de sus elementos
         m = {{2.3,4.5,3.2},
              {3.4,4.6,0.3},
              {1.3,0.9,0.7}};
         menor = 0.9
         */
        double[][] n = {{2.3,4.5,4.5},
                        {3.4,4.6,5.6},
                        {1.3,0.9,5.7}};
        System.out.println(encontrar_menor_(n,n.length-1,n[0].length-1,n[n.length-1][n[0].length-1]));

        /*
        Dada una palabra, determine si es palindrome o no.
        */
        String p = "reconocer";
        System.out.println(palindrome(p,0));

    }

    //se pueden usar adicionales, como este "int i" que se uso como contador, recorrer arreglo
    static double sumar_arreglo (double[] x, int i){
        if(i==0){
            return x[0];
        }
        else{
            return sumar_arreglo(x,i-1)+x[i];
        }
    }

    static double sumar_matriz (double[][]m, int i, int j){
        if(i==0 && j==0){
            return m[0][0];
        }
        else if(j==0){
            return sumar_matriz(m,i-1,m[0].length-1)+m[i][j];
        }
        else{
            return sumar_matriz(m,i,j-1)+m[i][j];
        }
    }

    static double encontrar_menor_ (double[][]m, int i, int j,double menor){
        if(i==0 && j==0 && m[0][0]<menor){
            return m[0][0];
        }
        else if(i==0 && j==0 && m[0][0]>=menor){
            return menor;
        }
        else if(j==0 && m[i][j]<menor){
            return encontrar_menor_(m,i-1,m[0].length-1,m[i][j]);
        }
        else if(j==0 && m[i][j]>=menor){
            return encontrar_menor_(m,i-1,m[0].length-1,menor);
        }
        else if(j>0 && m[i][j]<menor){
            return encontrar_menor_(m,i,j-1,m[i][j]);
        }
        else{
            return encontrar_menor_(m,i,j-1,menor);
        }

    }

    static boolean palindrome (String palabra, int i){
        if(palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)){
            return false;
        }
        else if(i>=palabra.length()/2){
            return true;
        }
        else{
            return palindrome(palabra,i+1);
        }
    }

    static double sumar_arreglo_sinrecorrer (double[]x){
        if(x.length==0){
            return 0;
        }
        else{
            return sumar_arreglo_sinrecorrer(eliminar_ultimo(x))+x[x.length-1];
        }
    }

    static double[] eliminar_ultimo(double[]x){
        double[] y = new double[x.length-1];
        for (int i = 0; i < y.length; i++) {
            y[i]=x[i];
        }
        return y;
    }
}
