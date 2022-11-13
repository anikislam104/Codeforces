import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int distance=scanner.nextInt();
        int total_steps=distance/5;
        if(distance%5!=0){
            total_steps++;
        }
        System.out.println(total_steps);
    }
}
