import java.util.Scanner;
public class escaleras {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int m = teclado.nextInt();
        System.out.println(escaleras(n,m));
        
    }

    static int escaleras(int n, int m){
        if ((n/2)%m==0){
            return n/2;
        }
        else{
            return escaleras(n+2,m);
        }
    }
}
