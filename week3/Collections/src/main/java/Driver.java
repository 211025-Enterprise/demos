import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Iterable
        //
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        CustomList<Integer> intList = new CustomList<>(arr);
        CustomList<List<Integer>> intListList = null;



        for(Integer cheese : intList){
            System.out.println(cheese);
        }

        for(List<Integer> integerList: intListList){
            for(Integer num : integerList){

            }
        }

    }
}
