public class Recursion {


    public static void main(String[] args) {
        // varargs, any number of arguments from 0 - infinity
        System.out.println(factorial(10));
        System.out.println(args[0]);
    }

    public static int sum(int k){//2 // 1 // 0

        if(k > 0){
            int temp = k + sum(k - 1);
            System.out.println(temp);
            return temp;
        }
        return 0;
    }

    public static int factorial(int k){//2 // 1 // 0

        if(k > 0){
            int temp = k * factorial(k - 1);
            System.out.println(temp);
            return temp;
        }
        return 1;
    }
}
