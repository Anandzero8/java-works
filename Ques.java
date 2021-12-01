package Interface;

interface data{
    public void load();
}
abstract class Info{
    public abstract void load();
}
class Employee extends Info implements data{
    public void load(){

        System.out.println("Loading");
    }
}
    class Ques {
        public static void main(String[] args) {
            Employee e = new Employee();
            e.load();
        }
    }

