public class Generic<E> {
    E value;
    Integer x;


    public Generic(E e){
        this.value = e;
        System.out.println(x); // 0 or null
    }

    public void printType(){
        System.out.println(value.getClass());
    }
}
