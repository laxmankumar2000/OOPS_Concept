package Java8.StreamAPIT;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,20,30,40,50));


        //Main Method
        //filter -- used to select elements as per predocate passed as argumednt.
        List<Integer> result = al.stream().filter(i->i>15).collect(Collectors.toList());
        System.out.println(result);      //[20, 30, 40, 50]

        //map -- used to returns a stream consosoting of the result oof apply the given function to element
        List<Integer> result2 = al.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println(result2);               //[20, 40, 60, 80, 100]



        // Terminal operatinn
        //count -- count no. of elements
        System.out.println(al.stream().count());

        //foreach -- used to iterator in a list




        al.stream().forEach(err -> System.out.print(err + " "));           //10 20 30 40 50
        System.out.println();

        //use for foreach into map function
        Map<Integer,Integer> mp = new HashMap<>(){{
            put(1,2);
            put(2,3);
        }};
        mp.forEach((err,a) -> {System.out.print("hii " + err+ " " + a +" ");
            System.out.println();
        });                //hii 1 2  hii 2 3

        //min -- find min value in  straem
        //two methods 1 . optional class and touse get method
        //1 use optional class
        Optional<Integer> o = al.stream().min((o1,o2)->o1.compareTo(o2));
        System.out.println("min " +o.get());
        //2 use get method into same
        System.out.println("min " +al.stream().min((o1,o2)->o1.compareTo(o2)).get());

        //max
        System.out.println("max " + al.stream().max((i,j)->i.compareTo(j)).get());


        //anyMatch or allmatch or noneMatach
        //1.allMatch == check all the elements of list if equal tjen return true   take predicate
        List<Integer> listOfNumer = Arrays.asList(23,23);
        System.out.println(listOfNumer.stream().allMatch(i->i==23));      // true

        //2.anyMatch == present one vlue or not
        System.out.println(al.stream().anyMatch(i->i==23));   //false

        //3noneMatch
        System.out.println(al.stream().noneMatch(i->i>20));         //false




    }
}
