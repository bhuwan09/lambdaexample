package streamPractise;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,6,7,8,9);


//    ---------------------- Using simple Loops -----------------------------

//        for(int i=0; i<6;i++)
//        {
//            System.out.println(nums.get(i));
//        }
//


        // --------------------- Using enhanced loop -----------------------------------

//        for (int n: nums)
//        {
//            System.out.println(n);
//        }


//        --------------------- Using for each loop -------------------------------

        nums.forEach(n -> System.out.println(n));
    }
}
