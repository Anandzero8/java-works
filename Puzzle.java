public class Puzzle {
    public static void main (String[]args){
        int R = 0, C = 0;
        int total = 35;
        int legs = 94;
        int legs_lifted = total * 2;   //70
        int num_of_legs = legs - legs_lifted;   //94-70 = 24
         R = num_of_legs/2;    // 12
         C =total-R;             //35-12= 23
        System.out.println(C+ " " + R);

    }
}
