import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int M=scanner.nextInt();
        int N=scanner.nextInt();
//        System.out.println(M+" "+N);
        int area=M*N;
        int maxDomino=Math.floorDiv(area,2);
        System.out.println(maxDomino);
    }
}
