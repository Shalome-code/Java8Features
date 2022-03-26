package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIMain {

    public static void main(String[] args){


        List<Integer> list = Arrays.asList(1, 3, 5, 3, 2, 7, 55,90);
        System.out.println(list);

        List newList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);
        List newList2 = list.stream().filter(i->i>50).collect(Collectors.toList());
        System.out.println(newList2);

        //Stream API - process collection/ group of objects
        //1-blank
        Stream<Object> emptyStream = Stream.empty();
        //2- Array, object

        String[] names = {"Shal","dddd", "rrrrr", "bbbbb"};
        Stream.of(names).forEach(i->System.out.println(i));

        IntStream i = Arrays.stream(new int[]{2,1,5,8,4});
        System.out.println(i);
        //3-using builder()
        Stream<Object> s = Stream.builder().build();

        //List, Set

        list.stream().forEach(j->System.out.println(j));


    }
}
