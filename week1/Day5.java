import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*

 */

/**
 * @author Brandon
 */
public class Day5 {
    public static void main(String[] args) throws IOException {
        Generic<Integer> generic = new Generic<>(10);
        // Autoboxing -> automatically convert a primitive to its wrapper equivalent
        Integer x2 = 10;
        int x = x2; // Unboxing -> automatically convert a wrapper

        x = generic.value;


        // O() big O notation
        // Time Complexity
        // Space Complexity


        generic.printType();
//        List<String> list;
//        List<Integer> list2;
//
//
//        BufferedReader reader = null;
//        try {
//            reader = getBufferedReader("C:\\Users\\Brandon\\Documents\\dev\\batch_repos\\10-25-2021\\demos\\week1\\test.txt");
//            StringBuilder builder = new StringBuilder();
//            String line;
//
//            while((line = reader.readLine()) != null){
//                builder.append(line)
//                        .append("\n");
//            }
//            System.out.println(builder.toString());
//            throw new CustomException("message");
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (CustomException e) {
//            e.printStackTrace();
//        } finally {
//            reader.close();
//        }

//        Scanner scanner = new Scanner(System.in);

//        while(true) {
//            try {
//                scanner.nextInt(); // input mismatch
//                int x = Integer.parseInt(choice); // number format <-
//                // a -> some exception
//            } catch(RuntimeException | IllegalArgumentException e) {
//                //
//            } catch(Exception e) {
//                //
//            }
//            finally
//            {
//                System.out.println("Finally we got here");
//            }
//        }
//        try{
//             // runtime exception -- div by 0
////             // are we going to catch it?
//            throw new ArithmeticException();
//
//        } catch(ArithmeticException e){
//            System.out.println("You can't do that arithmetically.");
//            e.printStackTrace();
//        } catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Hey man, you went out of bounds. That's illegal");
//        }

//        System.out.println("Woo we made it");
    }

    public static BufferedReader getBufferedReader(String path) throws FileNotFoundException {
        //throw new FileNotFoundException();
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        return new BufferedReader(fileReader);
    }
}
