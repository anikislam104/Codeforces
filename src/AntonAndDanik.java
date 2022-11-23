import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number_of_games=scanner.nextInt();
        String seq=scanner.next();
        int a=0,d=0;
        for(int i=0;i<number_of_games;i++){
            if(seq.charAt(i)=='A'){
                a++;
            }
            else {
                d++;
            }
        }
        if(a>d){
            System.out.println("Anton");
        }
        else if(a<d){
            System.out.println("Danik");
        }
        else {
            System.out.println("Friendship");
        }
    }
}
