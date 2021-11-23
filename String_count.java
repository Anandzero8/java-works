import java.util.Scanner;

public class String_count {
    public static void main(String[] args) {
        String x = "asdfg 12345n @#$%";
        count(x);
    }
    public static void count (String a){
        char[]ch = a.toCharArray();
        int letter = 0;
        int num = 0;
        int space = 0;
        int other = 0;
        for(int i=0;i<a.length();i++){
            if(Character.isLetter(ch[i])){
                letter++;
            }
            else if(Character.isDigit(ch[i])){
                num++;
            }
            else if(Character.isSpaceChar(ch[i])){
                space++;
            }
            else{
                other++;
            }
        }
        System.out.println("letter: "+letter);
        System.out.println("number: "+ num);
        System.out.println("space: "+space);
        System.out.println("other: "+other);
    }
}
