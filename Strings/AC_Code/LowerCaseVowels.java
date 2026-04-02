//Count how many times lower case vowels occurred in a String entered by the user
import java.util.Scanner;
public class LowerCaseVowels {
 public static void main(String[] args) {
    String arr = "aeiou";
    Scanner sc = new Scanner(System.in);
    int count = 0;
    String s = sc.nextLine();
    sc.close();
    for (char c : s.toCharArray()) {
        if(arr.indexOf(c)!=-1){
            count++;
        }
    }
    System.out.println(count);
 }   
}
