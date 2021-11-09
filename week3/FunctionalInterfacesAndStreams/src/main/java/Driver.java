import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {
    public static void main(String[] args) {

        int[] list = {1, 4, 7, 32, 26, 4, 10};
        int[] arr = {1,2,3,4,5,6,7,8};

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8); // factory method

        // functional interface is an interface with only one method to override, called the functional method

        Comparator<Integer> compare = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // if negative return -1
                if(o1 < o2) return -1;
                // if equal return 0
                if(o1.equals(o2)) return 0;
                // if positive return 1
                return 1;
            }
        };

        Comparator<Integer> compareWithLambda = (o1, o2) -> {
            // if negative return -1
            if(o1 < o2) return -1;
            // if equal return 0
            if(o1.equals(o2)) return 0;
            // if positive return 1
            return 1;
        };

        System.out.println("Unsorted: " + intList);
        intList.sort(compareWithLambda);
        System.out.println("Sorted asc: " + intList);
        intList.sort((num1, num2) -> compareWithLambda.compare(num2, num1));
        System.out.println("Sorted desc: " + intList);

        // Intermediate operations - an operation that can occur in the middle of stream execution that returns another stream
        System.out.println("Sorted desc distinct" + intList.stream().distinct().collect(Collectors.toList()));

        Predicate<Integer> lessThan10 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 10;
            }
        };

        System.out.println("filter less than 10: " + intList.stream().filter(lessThan10).collect(Collectors.toList()));

        System.out.println("filter greater than 10: " + intList.stream().filter((x) -> x >= 10).collect(Collectors.toList()));

        Function<Integer, Float> intToFloat = new Function<Integer, Float>() {
            @Override
            public Float apply(Integer integer) {
                return new Float(integer);
            }
        };

        System.out.println("distinct floats < 10: " + intList.stream().distinct().filter(lessThan10).map(intToFloat).collect(Collectors.toList()));

        // Terminal operations - an operation that terminates a stream execution and either returns a value, or performs an action

        System.out.println("Count of ints: " + intList.stream().filter(lessThan10).count());


        BinaryOperator<Integer> factorial = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer * integer2;
            }
        };
        System.out.println("Reduce to factorial of 8: " + intList.stream().filter(num -> num <= 7).reduce(factorial).get()); // 8! = 40320
        // Optionals -> optionals are a value wrapper to prevent against null pointer exceptions

        intList.stream().forEach(System.out::print); // method reference to System.out.println
        intList.stream().forEach(num -> System.out.println(num)); // longhand
        //                          for each value -> System.out.print

        // lamba expression | () -> { } | is a short hand implementation of a functional interface

        A a = new A();
        A a2 = new A();

        Arrays.asList(a,a2).stream().forEach(A::printSomething);


    }


    static class A{


        public static void printSomething(A a){
            System.out.println(a);
        }
    }
}
