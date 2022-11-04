import java.util.Scanner;

public class Bitplusplus {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num_of_statements=scanner.nextInt();
        int value=0;
        for(int i=0;i<num_of_statements;i++){
            String s=scanner.next();
            if(s.charAt(1) == '+'){
                value++;
            }
            else {
                value--;
            }
        }
        System.out.println(value);
    }
}
