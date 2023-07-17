package streamPractise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9, 4, 5, 7, 8);
//        Stream<Integer> data = nums.stream();
//       Stream<Integer> mappedData = data.map(n -> n*2);
//        mappedData.forEach(n-> System.out.println(n ));


//      nums.stream()
//              .filter(n -> n%2==1)
//              .sorted()
//              .map(n->n*2)
//              .forEach(n -> System.out.println(n));   // We wrote the above two lines statement on a single line




//         ---------------------- we can write like this if we don't use lambda expression for filer -----------------------------------

//        Predicate<Integer> predi = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {
////                if(n%2==1)
////                    return true;
////                else
////                    return false;
//                // --------------------------------- or ---------------------------------
//
//                return n%2 ==1;  // this line itself provides true and false
//            }




//      ------------------------------- Converting it to anonymous class style -----------------------------------------------

        Predicate<Integer> predi = (n) ->  n % 2 == 1;  // omiting return type ,{}, and data type

        nums.stream()
                .filter(predi)
                .sorted()
                .map(n->n*2)
                .forEach(n -> System.out.println(n));


    }
}
