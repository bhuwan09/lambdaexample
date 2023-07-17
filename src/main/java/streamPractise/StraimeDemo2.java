package streamPractise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StraimeDemo2 {
    public static void main(String[] args) {

        //Create a List and Filter all even numbers from List


        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 23);     //One way to create list, immutable list

       List<Integer> list2 = new ArrayList<>();             // another way to create list, mutbale list
       list2.add(23);
       list2.add(12);
       list2.add(423);
       list2.add(45);


        List<Integer> list3 = Arrays.asList(23, 432, 343, 34, 3);

        // ----------------------------              without stream               ----------------------
        List<Integer> listEven = new ArrayList<>();
        for(Integer i: list1)
        {
            if(i % 2 == 0)
            {
                listEven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(listEven);




        // --------------------------------------    usiing stream           --------------------------------------

//        Stream<Integer> stream = list1.stream();
//        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(newList);



        //--------------- Writing these 2 lines code on single line  -----------------------------------
        List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);


        List<Integer> newList1 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(newList1);
    }
}
