import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int total_stones=scanner.nextInt();
        String stones=scanner.next();
//        System.out.println(stones);
//        System.out.println(total_stones);
        int curr_idx=0;
        int removable_stone_count=0;
        int is_first_instance=1;
        char previous_color='W';
        for(int i=0;i<total_stones;i++){
            if(stones.charAt(i)==previous_color){
                is_first_instance=0;
            }
            else {
                is_first_instance=1;
            }
            if(is_first_instance==1){
                previous_color=stones.charAt(i);
            }
            else {
                removable_stone_count++;
            }
        }
        System.out.println(removable_stone_count);
    }
}
