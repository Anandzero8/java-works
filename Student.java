package Interface;

interface Anna {
    void placement();
}
class Wipro implements Anna{
    public void placement(){
        System.out.println("Interview on 12");
    }
}
class Inf implements Anna{
    public void placement(){
        System.out.println("interview on 15");
    }
}
class Student{
    public static void main(String[]args){
        Anna A = new Wipro();         //Wipro W = new Wipro();
        Anna B = new Inf();          //Info I = new Info();
        A.placement();                // W.placement();
        B.placement();                // I.placement();
    }
}