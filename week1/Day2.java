public class Day2 {
    public static void main(String[] args) {
        stringConcat();
    }

    public static void stringConcat(){
        String s1 = "1"; // "1"
        String s2 = s1.concat("2"); // 1 + 2 = 12
        s2.concat("3"); // 12 + 3 = 123
        System.out.println(s2); // what prints

        String x = "x";
        x = x + 7; // x7
        StringBuilder p = new StringBuilder("Hello "); // faster, but it's not threadsafe
        StringBuffer b = new StringBuffer("Hello "); // slower, however it is threadsafe
        String [] strings = {"there ", "from ", "string ", "builder."};


        for (int i = 0; i < strings.length; i++){
            b.append(strings[i]);
        }

        String result = b.toString();

        System.out.println(result);
        // type coercion
        String y = "y"; // y
        String z = x + y; // x7y
        // 3
    }
}
       
      