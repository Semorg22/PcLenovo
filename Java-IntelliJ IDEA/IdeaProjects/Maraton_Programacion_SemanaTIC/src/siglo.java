import java.util.Scanner;
public class siglo {

    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        System.out.println(siglo(n));
    }

    static int siglo(int n){
        if(1<=n && n<=100){
            return 1;
        }
        else{
            return siglo(n-100)+1;
        }
    }
}
