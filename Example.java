package Arraylist;

import java.util.*;


class Dog implements Comparator<Dog>, Comparable<Dog>
    {
    private String name;
    private int age;
    Dog(){}
        Dog(String n, int a){ name = n; age = a;}
        public String getDogName(){return name;}
        public int getDogAge(){ return age;}           //Overriding the compareTo method
        public int compareTo(Dog d)
        {
        return (d.name).compareTo(this.name);             //change for ascend/descend order
        }
        public int compare(Dog d, Dog d1){               //Overriding the compare method to sort the age
        if(d.age<d1.age)
            return 1;
        else
            return -1;
        }
    }
    public class Example{
        public static void main(String args[]){
            List<Dog>list = new ArrayList<Dog>();       //Takes a list 0 Dog objects
            list.add(new Dog("Shaggy",3));
            list.add(new Dog("Lacy",2));
            list.add(new Dog("Roger", 10));
            list.add(new Dog("Tommy", 4));
            list.add(new Dog("Tammy",1));
            Collections.sort(list);
            for(Dog a:list)
            System.out.print(a.getDogName() + ",");

            Collections.sort(list,new Dog());
            System.out.println(" ");
            for(Dog a:list)
                System.out.print(a.getDogName()+":"+a.getDogAge() +",");
    }
}
