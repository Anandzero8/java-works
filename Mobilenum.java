public class Mobilenum {
    public static void main(String[]args){
        long mob = 8825861432L;
        long num = mob;
        int first = 0;
        int last = (int)(mob%10); //2
        int sum=0;
        while (num>0){
            int r = (int)(num%10);
            num/=10;           //882586143 88258614 8825861 882586 88258 8825 882 88 8 0
            if(num==0)
                first=r;

        }
        sum=first+last;
        System.out.println(sum);
    }
}
