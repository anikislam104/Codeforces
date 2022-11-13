import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int k=scanner.nextInt();
        int subtracted_value=number;
        for( int i=0;i<k;i++){
            if(subtracted_value%10==0){
                subtracted_value=subtracted_value/10;
            }
            else {
                subtracted_value--;
            }
        }
        System.out.println(subtracted_value);
    }
}
