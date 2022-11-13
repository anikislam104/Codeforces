import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.next();
        int uppercase_count=0,lowercase_count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)<91){
                uppercase_count++;
            }
            else {
                lowercase_count++;
            }
        }
//      System.out.println(lowercase_count);
        int[] new_word=new int[word.length()];
        if(uppercase_count>lowercase_count){
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)>90){
                    new_word[i]=word.charAt(i)-32;
                }
                else{
                    new_word[i]=word.charAt(i);
                }
            }
        }
        else{
            for (int i=0;i<word.length();i++){
                if(word.charAt(i)<91){
                    new_word[i]=word.charAt(i)+32;
                }
                else {
                    new_word[i]=word.charAt(i);
                }
            }
        }
        for (int i=0;i<word.length();i++){
            System.out.print((char) new_word[i]);
        }
    }
}
