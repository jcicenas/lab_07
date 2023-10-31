public class FirstInitial {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if ((0 <= i) && (i < 2)) {
                System.out.println("      *********");
            }else if((8 < i) && (i < 11)){
                System.out.println("*************");
            }else{
                System.out.println("        *****");
            }
        }
    }
}
