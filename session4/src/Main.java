import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        boolean loop = true;
        while(loop){
            System.out.println("angka 1 : ");
            int angka1 = inputUser.nextInt();
            System.out.println("angka 2 : ");
            int angka2 = inputUser.nextInt();
            System.out.println("Operasi (+,-,*,/): ");

            String operasi = inputUser.next();
            switch (operasi){
                case "+":
                    System.out.println("hasil: " +  angka1+angka2);
                    break;
                case "-" :
                    System.out.println("hasil: " +  (angka1-angka2));
                    break;
                case "*" :
                    System.out.println("hasil: " +  angka1*angka2);
                    break;
                case "/" :
                    System.out.println("hasil: " +  angka1/angka2);
                    break;
                default:
                    System.out.println("pilihan tidak ada");
                    loop = false;
            }
        }

    }
}