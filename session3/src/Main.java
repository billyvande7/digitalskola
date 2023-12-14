public class Main {
    public static void main(String args[]) {

        String bintang = "";
        for (int i = 0; i<10; i++){
            if(i < 5){
                bintang += "*";
                System.out.println(bintang);
            } else if (i > 5) {
                System.out.println(bintang.substring(0, 5 - (i - 5)));
            } else{
                System.out.println(bintang);
            }
        }
    }
}