public class Mob {
    public  static void  main(String[]args){
        Long Mobile = 8825861432L;
        Long sum = 0L;
        while (Mobile>0)
        {
          //  int r = (int) (Mobile%10);
            long r = Mobile%10L; //2
            sum = sum+ r; // 0+2=2,
            Mobile/=10; //
        }
        System.out.println(sum);
    }
}
