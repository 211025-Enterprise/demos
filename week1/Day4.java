public class Day2{ 
    public static void main(String[] args) {
        int[] intArr = {1,2,3};
        // [0], [1], [2]

        int[][] twoDArr = {
                {1,2,3}, //i = 0
                {4}, // i = 1
                {7,8,9} // i = 2
        };

        int[][][] threeDArr ={
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                },
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                },
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                }
        };

        // [1][2][0][1]
        int[][][][] fourDArr = {
                {
                        {
                                {1,2,3},
                                {4,5,6},
                                {7,8,9}
                        },
                        {
                                {1,2,3},
                                {4,5,6},
                                {7,8,9}
                        },
                        {
                                {1,2,3},
                                {4,5,6},
                                {7,8,9}
                        }
                },
                {
                        {
                                {1,2,3},
                                {4,5,6},
                                {7,8,9}
                        },
                        {
                                {1,2,3},
                                {4,5,6},
                                {7,8,9}
                        },
                        {
                                {1,100,3},
                                {4,5,6},
                                {7,8,9}
                        }
                },
                {
                        {
                                {1,2,3},
                                {4,5,6},
                                {7,8,9}
                        },
                        {
                                {1,2,3},
                                {4,5,6},
                                {7,8,9}
                        },
                        {
                                {1,2,3},
                                {4,5,6},
                                {7,8,9}
                        }
                }
        };
        System.out.println(fourDArr[1][2][0][1]);
        System.out.println(fourDArr.length);



        // [0][0], [0][1], [0][2]
        // [1][0], [1][1], [1][2]
        // [2][0], [2][1], [2][2]

        // Iteratives
//        int x = 0;
//        while(x < 5){
//            System.out.println(x++);
//        }
//        // x is 5
//        do{
//            System.out.println(x++);
//        } while(x < 5);

        // for(initialization;condition;increment)

//        for(int y = 0; y <= 5; y++){
//            //continue will move on to the next iteration of the loop
//            //break will break out of the current loop
//        }

        int input = 10;
        //System.out.println(contains(input, twoDArr));
//        printArr(threeDArr);
        System.out.println(arrSum(twoDArr));
    }

    public static String contains(int input, int[][] twoDArr){
        for(int i = 0; i < twoDArr.length; i++){
            for(int j = 0; j < twoDArr.length; j++){
                if(twoDArr[i][j] == input){
                    return "Found at [" + i + "][" + j + "]";
                }
            }
        }
        return "Not in this array";
    }

    public static int arrSum(int[][] twoDArr){
        int sum = 0;
        for(int i = 0; i < twoDArr.length; i++){
            for(int j = 0; j < twoDArr[i].length; j++){
                sum += twoDArr[i][j];
            }
        }
        return sum;
    }

    static void printArr(int[][][] threeDArr){
        for(int i = 0; i < threeDArr.length; i++){
            for(int j = 0; j < threeDArr[i].length; j++){
                for(int k = 0; k < threeDArr[i][j].length; k++){
                    System.out.print(threeDArr[i][j][k]);
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }

    public void hello(){
        System.out.println("Hello");
    }
}
