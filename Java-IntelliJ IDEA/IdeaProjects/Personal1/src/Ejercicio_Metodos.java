import java.util.Scanner;
public class Ejercicio_Metodos {

    public static void main (String [] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese edad:");
        byte edad = teclado.nextByte();
        boolean adulto;
        adulto = es_mayor_de_edad(edad);
        System.out.println("Es mayor de edad: " + adulto);

        System.out.println("\nIngrese deuda:");
        double deuda = teclado.nextDouble();
        System.out.println("Ingrese tasa/porcentaje en numero:");
        double porcentaje /*en numero*/ = teclado.nextDouble();
        double tasa = porcentaje / 100;
        double deuda_total_año;
        deuda_total_año = calcular_deuda_total_año(deuda, tasa);
        System.out.println("Su deuda en un año sera: " + deuda_total_año);

        System.out.println("\nIngrese numero 1:");
        double num1 = teclado.nextDouble();
        System.out.println("Ingrese numero 2:");
        double num2 = teclado.nextDouble();
        System.out.println("Ingrese numero 3:");
        double num3 = teclado.nextDouble();
        double resultado_mediana;
        resultado_mediana = calcular_mediana(num1, num2, num3);
        System.out.println("La mediana es: " + resultado_mediana);
    }

    static boolean es_mayor_de_edad(byte edad){
        boolean mayor_de_edad = edad>=18;
        return mayor_de_edad;
    }

    static double calcular_deuda_total_año(double deuda,double tasa_de_interes) {
        double deuda_año = deuda*(Math.pow((1+tasa_de_interes),12));
        return deuda_año;
    }

    static double calcular_mediana(double num_1, double num_2, double num_3){
        double maximo_entre_dos = Math.max(num_1,num_2);
        double max = Math.max(maximo_entre_dos,num_3);

        double minimo_entre_dos = Math.min(num_1,num_2);
        double min = Math.min(minimo_entre_dos,num_3);
        double mediana=0;
        if (num_1<max && num_1>min) {
            mediana = num_1;
        }
        if (num_2<max && num_2>min) {
            mediana = num_2;
        }
        if (num_3<max && num_3>min) {
            mediana = num_3;
        }
        return mediana;
    }
}

