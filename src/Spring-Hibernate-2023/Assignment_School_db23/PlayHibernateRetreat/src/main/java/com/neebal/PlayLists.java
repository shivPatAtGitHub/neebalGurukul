package com.neebal;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PlayLists {


    // higher Order Functions
//    private static void forEach(List<Integer> elements, Consumer<Integer> consumer){
//        for(Integer element : elements){
//            consumer.accept(element);
//        }
//    }

    public static void main(String[] args) {

       List<Integer> marks =  Arrays.asList(4,10,7,4,6,2,1,10,8);

        System.out.println("***********even marks*************");
//       for(Integer mark: marks){
//           if (mark % 2 ==0){
//               System.out.println(mark);
//           }
//       }

//            forEach(marks, mark ->{
//                //Lower Order Functions
//                if(mark % 2 ==0){
//                    System.out.println(mark);
//                }
//            });

            //Lambda function
        marks.forEach(mark ->{
            if(mark % 2 ==0){
                System.out.println(mark);
            }
        });

        System.out.println("*******odd marks more than 3*******");
//        for(Integer mark: marks) {
//            if (mark % 2 != 0 && mark > 3) {
//                System.out.println(mark);
//            }
//        }

//        forEach(marks, mark ->{
//            if(mark % 2 !=0  && mark>3){
//                System.out.println(mark);
//            }
//        });

        //Lambda function
        marks.forEach(mark ->{
            if(mark % 2 !=0  && mark>3){
                System.out.println(mark);
            }
        });


    }
}
