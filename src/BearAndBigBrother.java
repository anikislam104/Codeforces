import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int year_count=0;
        while (a<=b){
            a=a*3;
            b=b*2;
            year_count++;
        }
        System.out.println(year_count);
    }
}
