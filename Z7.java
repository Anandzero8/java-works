public class Z7 {
    public static void main(String[] args) {
        char ch,ch1;
        for(int i = 0; i <26;i++){
            ch = (char)('A'+i);
            ch1 = (char)('a'+ i);
            System.out.print(ch + " ");
            System.out.print(ch1 + " ");

            byte[] aplha = new byte[]{65,66,67};
            String s = new String(aplha);
            System.out.print(s);
        }
    }
}
