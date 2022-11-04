import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,k;
        n=scanner.nextInt();
        k=scanner.nextInt();
        int[] scores=new int[n];
//        System.out.println(n+" "+k);
        int target=0;
        int num_of_winners=0;
        for(int i=0;i<n;i++){
            int score= scanner.nextInt();
//            System.out.println(score);
            scores[i]=score;
            if(i==k-1){
                target=score;
            }
        }
//        System.out.println(scores[0]);
        for(int i=0;i<n;i++){
            if(scores[i]>=target && scores[i]>0){
                num_of_winners++;
            }
        }
        System.out.println(num_of_winners);
    }
}
