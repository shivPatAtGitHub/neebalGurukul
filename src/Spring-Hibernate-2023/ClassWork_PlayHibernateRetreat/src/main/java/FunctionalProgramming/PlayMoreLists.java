package FunctionalProgramming;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlayMoreLists {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(4,10,7,4,6,2,1,10,8);


//        List<Integer> m1 = new ArrayList<>();
//        marks.forEach(mark -> {
//            if(mark % 2 == 0 && mark > 4) {
//                m1.add(mark);
//            }
//        });


        // Create a new List object
        // Containing all even marks more than 4 from marks List
        // marks --> filtering --> mapping --> sort --> filtering --> new List
        // Stream API

        List<Integer> m1 = marks
                .stream()
                .filter(mark -> mark % 2 == 0 && mark > 4)
                .collect(Collectors.toList());
        System.out.println(m1);



        // create a new List Object containing all elements
        // from marks list but where each element is deducted by 1

        List<Integer> m2 = marks
                .stream()
                .map(mark -> mark - 1)
                .collect(Collectors.toList());
        System.out.println(m2);


        // create a new List object containing all elements
        // add elements less than 5 from marks lists
        // squared up

        List<Integer> m3 = marks
                .stream()
                .filter(mark -> mark % 2 != 0 && mark < 9)
                .map(mark -> mark * mark)
                .collect(Collectors.toList());
        System.out.println(m3);


        List<Integer> marksList2 = Arrays.asList(4,10,7,4,6,2,1,10,8,7, 5,3,1,5);

        List<Integer> m4 = marksList2
                .stream()
                .filter(mark -> mark % 2 != 0 && mark < 9)
                .map(mark -> mark * mark)
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println(m4);



    }

}
