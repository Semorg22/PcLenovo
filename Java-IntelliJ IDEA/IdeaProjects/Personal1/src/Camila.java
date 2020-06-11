public class Camila {

    public static void main (String [] args){
        corazon(30);
        System.out.println("Camila");
        System.out.println("Aunque se sientas mal y sin fuerzas");
        System.out.println("recuerda que cada dia puede ser");
        System.out.println("el inicio de algo maravilloso.");
        corazon(30);
    }

    static void corazon (int n){
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                System.out.print("♡");
            }
            System.out.println();
        }
    }
}
