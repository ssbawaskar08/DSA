// take ex of the input string aaabbcccdd we can compress it and write as a3b2c3d2.
import java.util.Scanner;
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String s1 = "";
        for(int i=0;i<s.length();i++){
            Integer c = 1;
            while(i<s.length()-1 &&s.charAt(i)==s.charAt(i+1)){
                c++;
                i++;
            }
            s1+=s.charAt(i);
            if(c>1){
                s1+=c.toString();
            }
        }
        System.out.println(s1);
    }
}