package Arraylist;

import javax.print.DocFlavor;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Crick implements Comparator<Crick> {
    String name; int salary;
    Crick(){}
    Crick(String name, int salary){
        this.name=name; this.salary=salary;
    }
    public int compare(Crick c1, Crick c2){
        return c2.salary-c1.salary;
    }
    int getSalary(){return salary;}
    String getName(){return name;}
}
class D5{
    public static void main(String[] args) {
        Crick cr1 = new Crick("Sachin", 40000);
        Crick cr2 = new Crick("Dhoni",60000);
        Crick cr3 = new Crick("Virat",70000);
        Set<Crick> s= new TreeSet(new Crick());
        s.add(cr1);
        s.add(cr2);
        s.add(cr3);

        for(Crick c:s)
            System.out.println(c.getName() + " " + c.getSalary());

    }
}
