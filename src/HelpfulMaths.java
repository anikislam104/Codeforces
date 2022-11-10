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
                    numbers[idx]=s1.charAt(i)-48;
                    idx++;
                }
            }

            for(int i=0;i<arr_len;i++){
                int min=4;
                int index=i;
                for(int j=i;j<arr_len;j++){
                    if(numbers[j]<min){
                        min=numbers[j];
                        index=j;
                    }
                }
                int temp=numbers[i];
                numbers[i]=numbers[index];
                numbers[index]=temp;
            }
            for(int i=0;i<arr_len;i++){
                if(i!=arr_len-1){
                    System.out.print(numbers[i]+"+");
                }
                else {
                    System.out.print(numbers[i]);
                }
            }
        }
    }
}
