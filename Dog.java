public class Dog {
    public static void main(String[]args)
    {
        Dog.sound();                           // d=object, sound = method,    (static)
        Dog d = new Dog();                          //(non static)
        d.sleep();
    }
   static void sound()                            // static method(we need NOT object to call)
    {
        System.out.println("Barking");
    }
     void sleep() {                            // non static method( we need object to call)
         System.out.println("sleeping");
     }
}
