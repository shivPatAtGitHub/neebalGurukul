package FunctionalProgramming;

public class Multithreading {
    public static void main(String[] args)  {

        // main thread
        System.out.println("good morning");

        // thread1
        new Thread(() -> System.out.println("good evening")).start();

        // thread2
        new Thread(() -> System.out.println("good night")).start();

        new Thread(() -> System.out.println("good a")).start();
        new Thread(() -> System.out.println("good b")).start();
        new Thread(() -> System.out.println("good c")).start();
        new Thread(() -> System.out.println("good d")).start();
        new Thread(() -> System.out.println("good e")).start();


    }
}
