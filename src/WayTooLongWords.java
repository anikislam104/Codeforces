import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner line=new Scanner(System.in);
        int num_of_words=line.nextInt();

        for(int i=0;i<num_of_words;i++){
            String s=line.next();
//            System.out.println(s);
            if(s.length()<11){
                System.out.println(s);
            }
            else {
                System.out.print(s.charAt(0));
                System.out.print(s.length()-2);
                System.out.println(s.charAt(s.length()-1));
            }
        }
    }
}
