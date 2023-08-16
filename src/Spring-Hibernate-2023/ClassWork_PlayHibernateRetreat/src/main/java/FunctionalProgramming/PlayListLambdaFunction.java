package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class PlayListLambdaFunction {


    //Higher Order function
//    public static void forEach(List<Integer> elements, Consumer<Integer> consumer) {
//        for(Integer element: elements) {
//            consumer.accept(element);
//        }
//    }

    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(4,10,7,4,6,2,1,10,8);

        System.out.println("********************** Even marks **********************");
//        for(Integer mark : marks) {
//            if(mark % 2 == 0) {
//                System.out.println(mark);
//            }
//        }

        // using anonymous class
//        forEach(marks, new Consumer<Integer>() {
//                    @Override
//                    public void accept(Integer mark) {
//                        if(mark % 2 == 0) {
//                            System.out.println(mark);
//                        }
//                    }
//                });


        // using Lambda Function / Expression
//        forEach(marks, mark -> {
//            // lower order function
//            if(mark % 2 == 0) {
//                System.out.println(mark);
//            }
//        });

        marks.forEach(mark -> {
            if(mark % 2 == 0) {
                System.out.println(mark);
            }
        });


                System.out.println("**************** Odd marks more than 3 *****************");
//        for(Integer mark : marks) {
//            if(mark % 2 != 0 && mark > 3) {
//                System.out.println(mark);
//            }
//        }

        // using anonymous class
//        forEach(marks, new Consumer<Integer>() {
//            @Override
//            public void accept(Integer mark) {
//                if(mark % 2 != 0 && mark > 3) {
//                    System.out.println(mark);
//                }
//            }
//        });


        //using Lambda Function / Expression
//        forEach(marks, mark -> {
            // lower order function
//            if(mark % 2 != 0 && mark > 3) {
//                System.out.println(mark);
//            }
//        });

        marks.forEach(mark-> {
            if(mark % 2 != 0 && mark > 3) {
                System.out.println(mark);
            }
        });


    }
}
