import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row_of_one=0,col_of_one=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int num=scanner.nextInt();
                if(num==1){
                    row_of_one=i+1;
                    col_of_one=j+1;
                }
            }
        }
        int row_shift=Math.abs(3-row_of_one);
        int col_shift=Math.abs(3-col_of_one);
        System.out.println(row_shift+col_shift);
    }
}
