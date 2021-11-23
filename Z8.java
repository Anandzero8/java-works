import java.util.*;

public class Z8 {
    public static void main(String[] args) {
        Set<String> s = new TreeSet(); //new C();
        String name;
        Scanner sc= new Scanner(System.in);
       for(int i = 0; i<5; i++){
            name = sc.nextLine();
            s.add(name);
            System.out.println(s);
        }
    }
}
/*class C implements Comparator<String>{
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}*/