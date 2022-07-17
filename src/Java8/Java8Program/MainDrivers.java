package Java8.Java8Program;

/*
you have some employee in employee class. in this class attruitbes have name and age and salary of tehe employee
 then u habe to update salary of employee that have age gretaer then 25 years.
 */

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDrivers {
    public static void main(String[] args) {

        List<Employee> al = new ArrayList<Employee>();

        Employee e1 = new Employee("abc" , 21,10000);
        Employee e2 = new Employee("pqr" , 26,12000);
        Employee e3 = new Employee("cde" , 28,15000);
        Employee e4 = new Employee("fgh" , 21,17000);
        Employee e5 = new Employee("xyz" , 21,18000);

        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);

        System.out.println("original Salary");
        System.out.println(al);


        List<Employee> result = al.stream().map(e->
        {
            if (e.getAge()>25)
                e.setSalary(e.getSalary()*1.10);

            return e;
        }).collect(Collectors.toList());
        System.out.println("Incremented salary");
        System.out.println(al);




    }
}
