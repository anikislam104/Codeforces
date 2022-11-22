import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number=scanner.next();
        int count=0;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==52 || number.charAt(i)==55){
                count++;
            }
        }
        if(count==4 || count==7){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
