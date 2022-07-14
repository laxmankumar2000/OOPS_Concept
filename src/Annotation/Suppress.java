package Annotation;
import java.util.*;


public class Suppress {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {


        List al = new ArrayList();
        al.add("as");
        al.add("as");
        al.add("as");
        al.add("as");
        al.add("as");
        al.add(13);

        for(Object s: al)
        {
            System.out.println(s);
        }

    }
}
