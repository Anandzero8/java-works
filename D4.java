package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Cricketer implements Comparator<Cricketer>, Comparable<Cricketer>
{
    private String name;
    private int Salary;
    Cricketer(){}
    Cricketer(String n, int a){ name = n; Salary = a;}
    public String getCricketerName(){return name;}
    public int getCricketerSalary(){ return Salary;}
    public int compareTo(Cricketer d)
    {
        return (d.name).compareTo(this.name);
    }
    public int compare(Cricketer d, Cricketer d1){
        if(d.Salary<d1.Salary)
            return -1;
        else
            return 1;
    }
}
public class D4{
    public static void main(String args[]){
        List<Cricketer> list = new ArrayList<Cricketer>();
        list.add(new Cricketer("Msd",3000));
        list.add(new Cricketer("virat",2000));
        list.add(new Cricketer("Sachin", 5000));
        Collections.sort(list);
        for(Cricketer a:list)
            System.out.print(a.getCricketerName() + ",");

        Collections.sort(list,new Cricketer());
        System.out.println(" ");
        for(Cricketer a:list)
            System.out.print(a.getCricketerName()+":"+a.getCricketerSalary() +",");
    }
}

