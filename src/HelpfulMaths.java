import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        int len=s1.length();
        if(len==1){
            System.out.println(s1);
        }
        else {
            int[] numbers=new int[(len+1)/2];
            int arr_len=(len+1)/2;
            int idx=0;
            for(int i=0;i<len;i++){
                if(s1.charAt(i)!='+'){
                    numbers[idx]=s1.charAt(i);
                    idx++;
                }
            }
            for(int i=0;i<arr_len;i++){
                int min=4;
                int index=i;
                for(int j=i;j<arr_len;j++){

                }
            }
        }
    }
}
