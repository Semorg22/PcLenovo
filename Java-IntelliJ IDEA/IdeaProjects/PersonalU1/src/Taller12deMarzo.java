import java.util.Scanner;
public class Taller12deMarzo {

    //SEBASTIAN MORENO - JULIAN NARANJO

    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese numero y potencia, separados por un espacio:");
        double x1 = teclado.nextDouble();
        int n1 = teclado.nextInt();
        System.out.println(calcular_elevado(x1,n1));

        System.out.println("Ana viene cada: ");
        int a = teclado.nextInt();
        System.out.print("Bernardo viene cada: ");
        int b = teclado.nextInt();
        System.out.print("Carlos viene cada: ");
        int c = teclado.nextInt();
        System.out.println("Se volveran a ver en: " + (reencuentro(a,b,c)) + " dias");

        System.out.println("Ingrese poblacion x y población y, separados por un espacio:");
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        System.out.print("Ingrese porcentaje m y porcentaje n, separados por un espacio:");
        int m = teclado.nextInt();
        int n = teclado.nextInt();
        System.out.println("Pasarán " + (calcular_años(x,y,m,n)) + " años.");
    }

    static double calcular_elevado(double x1, int n1){
        double e;
        double potencia = x1;

        if(n1==0){
            e=1;
            return e;
        }
        else if(n1==1){
            return x1;
        }
        else{
            for(int i=2;i<=n1;i++){
                potencia*=x1;
            }
            return potencia;
        }
    }

    static int reencuentro(int a, int b, int c){
        if (a%b==0 && a%c==0){
            return a;
        }
        else if(b%a==0 && b%c==0){
            return b;
        }
        else if(c%a==0 && c%b==0){
            return c;
        }
        else{
            return a*b*c;
        }
    }

    static int calcular_años(int x, int y, int m, int n){
        int years=0;
        int i = 0;
        while(x>y){
            x = x + ((x*m)/100);
            y = y + ((y*n)/100);
            years = i;
            i++;
        }
        return years;
    }
}
