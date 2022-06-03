package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StramExample {
    public static void main(String[] args) {

        List<Integer>numberList1=new ArrayList<>();
        numberList1.add(10);
        numberList1.add(21);
        numberList1.add(30);
        numberList1.add(41);
        numberList1.add(50);
        numberList1.add(61);

        numberList1.forEach(i->{
            System.out.println(i);
        });


//Now i have to find a list contain odd number

        List<Integer>evenList=new ArrayList<>();

        numberList1.forEach(i->{
            if(i%2==0){
                evenList.add(i);
            }

        });
System.out.println("Your Even List");
        evenList.forEach(j->{
            System.out.println(j);
        });

//This can be easily done by stream api no lengthy process require
        Stream<Integer> stream=numberList1.stream();

        //predicate means boolean value function
        List<Integer>myList=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(myList);

        System.out.println("can apply for loop as");
        for (Integer i:myList){
            System.out.println(i);
        }
    }
}
