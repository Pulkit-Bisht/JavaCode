package stream;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //stream api collection ko process aur group of object ko process krne k liye use hoti h

        //Stream ke object bnne ke tarike


//        Create empty stream object

        Stream< Integer> emptyStream =Stream.empty();

        emptyStream.forEach(e->{
            System.out.println(e);
        });


        //array,object stream creation
        String name[]={"Pushkar","Riya","Mukesh"};

        Stream<String> stream1=Stream.of(name);

//        System.out.println(stream1);
        stream1.forEach(names->{
            System.out.println(names);
        });


        //3 methods create object of stream

        Stream<Object> streamBuilder=Stream.builder().build();


        //
        IntStream stream = Arrays.stream(new int[]{1, 4, 6, 7, 0});

//        5 List,set

        List<Integer> integers = Arrays.asList(1, 3, 8, 0, 6, 3);
        Stream<Integer> integerStream = integers.stream();
        integers.forEach(num->{
            System.out.println(num);
        });
    }
}
