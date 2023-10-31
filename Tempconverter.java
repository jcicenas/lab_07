import java.util.*;
public class Tempconverter {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        boolean sentinel = true, sentinel2 = true;
        double temp = 0;
        String temp1 = "";

        while(sentinel2){
            do {
                System.out.println("Please enter a temperature in degress C to be converted to F");
                if(newscan.hasNextInt()){
                    temp = newscan.nextInt();
                    sentinel = false;
                    System.out.println(temp);
                    System.out.printf("%-20s%5.2f%n","Degrees C:" ,(temp * (9/5)) + 32);
                    System.out.printf("%-20s%5.2f%n","Degrees F: ",(temp * (9/5)) + 32);
                }
                else{
                    temp1 = newscan.nextLine();
                    if(temp1.equalsIgnoreCase("n")){
                        sentinel2 = false;
                    }
                    System.out.println("Invalid Character  - Try again or enter 'n'");
                }
            } while (sentinel == true);
            
            
        }
        newscan.close();
    }
    
}