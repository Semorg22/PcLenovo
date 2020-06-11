import java.util.Scanner;
public class rombos {

    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);

        int x1 = teclado.nextInt();
        int y1 = teclado.nextInt();
        int x2 = teclado.nextInt();
        int y2 = teclado.nextInt();
        int x3 = teclado.nextInt();
        int y3 = teclado.nextInt();
        int x4 = teclado.nextInt();
        int y4 = teclado.nextInt();
        System.out.println(rombo(x1,y1,x2,y2,x3,y3,x4,y4));
    }

    static String rombo (int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){

        double dist_A = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        double dist_B = Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2));
        double dist_C = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
        double dist_D = Math.sqrt(Math.pow((x1-x4),2) + Math.pow((y1-y4),2));

        double dist_E = Math.sqrt(Math.pow((x3-x1),2) + Math.pow((y3-y1),2));
        double dist_F = Math.sqrt(Math.pow((x4-x2),2) + Math.pow((y4-y2),2));

        double cos1 = Math.acos((Math.pow((dist_E),2)-Math.pow((dist_A),2)-Math.pow((dist_B),2))/-2*(dist_A*dist_B));
        double cos2 = Math.acos((Math.pow((dist_F),2)-Math.pow((dist_B),2)-Math.pow((dist_C),2))/-2*(dist_B*dist_C));
        double cos3 = Math.acos((Math.pow((dist_E),2)-Math.pow((dist_C),2)-Math.pow((dist_D),2))/-2*(dist_C*dist_D));
        double cos4 = Math.acos((Math.pow((dist_F),2)-Math.pow((dist_D),2)-Math.pow((dist_A),2))/-2*(dist_D*dist_A));

        if((dist_A==dist_B && dist_A==dist_C && dist_A==dist_D) && (dist_B==dist_C && dist_B==dist_D)
            && (dist_C==dist_D)){
            if((cos1==cos2 && cos1==cos3 && cos1==cos4) && (cos2==cos3 && cos2==cos4)
                    && (cos3==cos4)){
                return "cuadrado";
            }
            else{
                return "rombo";
            }
        }
        else{
            return "ninguno";
        }
    }
}
