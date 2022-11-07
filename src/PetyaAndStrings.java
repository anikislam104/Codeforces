import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        String s2=scanner.next();
        int check_equality=1;
        for(int i=0;i<s1.length();i++){
            int a=s1.charAt(i);
            int b=s2.charAt(i);
            if(a>90){
                a=a-32;
            }
            if(b>90){
                b=b-32;
            }
            if(a>b){
                System.out.println(1);
                check_equality=0;
                break;
            }
            else if (a<b) {
                System.out.println(-1);
                check_equality=0;
                break;
            }
        }
        if(check_equality==1){
            System.out.println(0);
        }
    }
}
