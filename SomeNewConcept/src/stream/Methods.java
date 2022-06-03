package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
    public static void main(String[] args) {

        //Filter and Map is used here
        //1)->  filter(predicate) predicates means boolean value function4
        //if true then filter otherwise no filter
        //e->{return true or you can return false}

        String [] cities={"Kashipur","Delhi","Kanupr","Rudrapur","Rurki"};
//        Stream<String> cities1 = Stream.of(cities);
//        List<String> collect = cities1.filter(e -> e.startsWith("R")).collect(Collectors.toList());
//        collect.forEach(city->{
//            System.out.println(city);
//        });

        //or

        List<String> k = Stream.of(cities).filter(e -> e.startsWith("K")).collect(Collectors.toList());
        System.out.println(k);


        //2)->  Map(function)
        //We can perform operation in each element
        //like sqaure of a list and get listof square

        List<Integer> myno=Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> collect = myno.stream().map(square -> square * square).collect(Collectors.toList());
        System.out.println(collect);

    }
}
