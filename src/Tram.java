import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int stops=scanner.nextInt();
        int current_passenger=0;
        int max_capacity=0;
        for(int i=0;i<stops;i++){
            int exit=scanner.nextInt();
            int arrival=scanner.nextInt();
            current_passenger=current_passenger-exit+arrival;
            if(max_capacity<current_passenger){
                max_capacity=current_passenger;
            }
        }
        System.out.println(max_capacity);
    }
}
