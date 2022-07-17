package Java8.OptionalClass;

import java.util.Optional;

/*
Optional Class
In Java 8, the “java.util” package included an optional class. The public final class “Optional” is used to handle NullPointerException in a Java program. You may give other code or values to execute using Optional. Thus, optional reduces the number of null checks required to avoid a nullPointerException.

You may use the Optional class to prevent the application from crashing and terminating unexpectedly. The Optional class has methods for checking the existence of a value for a given variable.

The following program demonstrates the use of the Optional class.

import java.util.Optional;
public class Main{

   public static void main(String[] args) {
        String[] str = new String[10];
        Optional<String>checkNull =
                       Optional.ofNullable(str[5]);
        if (checkNull.isPresent()) {
            String word = str[5].toLowerCase();
            System.out.print(str);
         } else
           System.out.println("string is null");
    }
}
Output:
String is null

To verify whether the string is null in this application, we utilize the Optional class’s “ofNullable” attribute.
If it is, the user receives the relevant message.
 */
public class optional {
    public static void main(String[] args) {
        String[] str = new String[10];
        Optional<String> checkNull =
                Optional.ofNullable(str[5]);
        if (checkNull.isPresent()) {
            String word = str[5].toLowerCase();
            System.out.print(str);
        } else
            System.out.println("string is null");
    }

}
