import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        int n=scanner.nextInt();
        int w=scanner.nextInt();
        int loan=(k*w*(w+1)-2*n)/2;
        if(loan<0){
            System.out.println(0);
        }
        else{
            System.out.println(loan);
        }
    }
}
