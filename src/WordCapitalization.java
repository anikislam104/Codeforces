import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        if (s.charAt(0)>96){
            int a=s.charAt(0)-32;
            for (int i=0;i<s.length();i++){
                if(i==0){
                    char c=(char)a;
                    System.out.print(c);
                }
                else {
                    System.out.print(s.charAt(i));
                }
            }
        }
        else {
            System.out.println(s);
        }
    }
}
