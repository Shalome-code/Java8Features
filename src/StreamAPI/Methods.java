package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] agrs){

        //filter(predicate) - predicate(interface) is a boolean valued function

        //map(Function)
        /* When we want to perform an operation on every element*/

        List<String> names = List.of("ABD","DEF","RFFEF","asdf");
        List<String> m = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(m);
        m.stream().forEach(System.out::println);

        List<Integer> numbers = List.of(2,5,7,9,12);
        List<Integer> sqNum = numbers.stream().map(a->a*a).collect(Collectors.toList());
        System.out.println(sqNum);
        numbers.stream().sorted().forEach(System.out::println);
        Integer integer = numbers.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println("Min " +integer);

    }
}
