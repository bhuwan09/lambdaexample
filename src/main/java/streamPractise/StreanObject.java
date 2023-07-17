package streamPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreanObject {
    public static void main(String[] args) {

        String names[] = {"Ram","Shyam", "Hari", "Krishna"};


        // If we have array , object or collection we can create stream
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e ->{
            System.out.println(e);
        });

        //using builder
        Stream<Object> streamBuilder = Stream.builder().build();

        //List , Set
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(2);
        list2.add(1);
        list2.add(34);
        list2.add(3);

        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e-> {
            System.out.println(e);
        });

    }
}
