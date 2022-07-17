package Java8.Java8Program;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class programs {
    public static void main(String[] args) {

        //1. Given a list of integers, find out all the even numbers exist in the list using Stream functions?

        List<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,3,78,15,10));

        List<Integer> result = al.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(result);
        al.stream().filter(i->i%2==0).forEach(System.out::print);
        System.out.println();


        //Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        al.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
        System.out.println();



        //Q3 How to find duplicate elements in a given integers list in java using Stream functions?
        Set<Integer> st = new HashSet<>();
        al.stream().filter(e->!st.add(e)).forEach(System.out::println);
        System.out.println();

        //Q4 Given the list of integers, find the first element of the list using Stream functions?
        al.stream().findFirst().ifPresent(System.out::println);
        System.out.println();

        //Given a list of integers, find the total number of elements present in the list using Stream functions?
        long length = al.stream().count();
        System.out.println("count  "+al.stream().count());

        //Q6.Given a list of integers, find the maximum value element present in it using Stream functions?

        System.out.println("max val " +al.stream().max((i,j)->i.compareTo(j)).get());


        //Q7 Given a String, find the first non-repeated character in it using Stream functions?

        String input = "Java Hungry Blog Alive is Awesome";

        Character result1 = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result1);


        //Q8 Given a String, find the first repeated character in it using Stream functions?

        Character result3 = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result3);

        //Q9 Given a list of integers, sort all the values present in it using Stream functions?

        al.stream().sorted();
        al.stream().forEach(System.out::print);
        System.out.println();

        //Q10 Given a list of integers, sort all the values present in it in descending order using Stream functions?
        al.stream().sorted((o1,o2)->o2.compareTo(o1)).forEach(System.out::print);
        System.out.println();
        al.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);

    }
}
