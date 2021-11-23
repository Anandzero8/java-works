public class Home {
    public static void main(String[]args){    //object should be created in main
        Home home1 = new Home();
        Home home2 = new Home();
        Home home3 = new Home();
        Home home4 = new Home();
        Home home5 = new Home();

        home1.area(500);
        home2.area(600);
        home3.area(700);
        home4.area(1500);
        home5.doubleflats(500,1000);
    }
    public void area(int sqft)   // area is function name //this method is non static method. without object we cannot call method
    {
        if(sqft>=1000)
        System.out.println(sqft + " sqft price is " + sqft*40);
        else
            System.out.println(sqft + " sqft price is  " + sqft*50);
    }

    public void doubleflats(int single, int doubles){
        int price = (single*50) + doubles *40;
        System.out.println("doubleflat price is " + price);
    }
}
