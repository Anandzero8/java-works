import java.util.Scanner;

public class Two_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Students name: ");
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String name3 = sc.nextLine();

        System.out.println("Enter Student ID: ");
        int Id1 = sc.nextInt();
        int Id2 = sc.nextInt();
        int Id3 = sc.nextInt();

        System.out.println("Enter Students Mark: ");
        int Mark1 = sc.nextInt();
        int Mark2 = sc.nextInt();
        int Mark3 = sc.nextInt();

        if(Mark1>Mark2 && Mark1>Mark3){
            System.out.println("maximum mark is: " + name1 +" "+ Id1+ " "+ Mark1);
        }
        if (Mark2>Mark1 && Mark2>Mark3){
            System.out.println("Maximum mark is: "+name2+" "+Id2+" "+Mark2);
        }
        else{
            System.out.println("Maximum mark is: "+name3+" - "+Id3+" - "+Mark3);
        }

    }
}
