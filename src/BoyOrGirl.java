import java.util.Scanner;

public class BoyOrGirl {
    static boolean checkInsideArray(int[] arr,int a){
        boolean isExists=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                isExists=true;
                break;
            }
        }
        return isExists;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String username=scanner.next();
        int[] distinct_numbers=new int[username.length()];
        for(int i=0;i<username.length();i++){
            distinct_numbers[i]=-1;
        }
        for(int i=0;i<username.length();i++){
            if(!checkInsideArray(distinct_numbers, (int) username.charAt(i))){
                distinct_numbers[i]=username.charAt(i);
            }
        }
        int distinct_num_count=0;
        for(int i=0;i<username.length();i++){
            if(distinct_numbers[i]!=-1){
                distinct_num_count++;
            }
        }
        if(distinct_num_count%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }
    }
}
