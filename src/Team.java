import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner line_1 = new Scanner(System.in);
        int number_of_problems=line_1.nextInt();
//        System.out.println(number_of_problems);
        int solvable_problems_count=0;
        for(int i=0;i<number_of_problems;i++){
//            Scanner line_i=new Scanner(System.in);
            int Petya,Visya,Tonya;
            Petya=line_1.nextInt();
//            System.out.println(Petya);
            Visya=line_1.nextInt();
//            System.out.println(Visya);
            Tonya=line_1.nextInt();
//            System.out.println(Tonya);
            //System.out.println(Petya+Visya+Tonya);
            int line_sum=Petya+Visya+Tonya;
            if(line_sum>1){
                solvable_problems_count++;
            }
        }
        System.out.println(solvable_problems_count);
    }
}
