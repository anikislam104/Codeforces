import java.util.Scanner;

public class HighSchool {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        if(x==y){
            System.out.println('=');
        }
        else {
            double a = (y * Math.log(x));
            double b = x * Math.log(y);
            if (a == b) {
                System.out.println('=');
            } else if (a < b) {
                System.out.println('<');
            } else {
                System.out.println('>');
            }
        }
    }
}
