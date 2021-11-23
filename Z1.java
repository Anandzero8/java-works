import java.util.HashSet;
import java.util.Set;

public class Z1 {
    public static void main(String[] args) {
        String[] s = {"AABBCC"};
        Set s1 = new HashSet();
        for(int i = 0; i<s.length;i++){
            s1.add(s[i]);
            System.out.println(s1);
        }
    }
}
