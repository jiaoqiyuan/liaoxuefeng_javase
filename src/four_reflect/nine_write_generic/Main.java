package four_reflect.nine_write_generic;

public class Main {
    public static void main(String[] args) {
//        Pair<Integer> p = new Pair<>(1, 3);
        Pair<Integer> p = Pair.create(1, 3);
        Integer first = p.getFirst();
        Integer last = p.getLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(p.getClass() == Pair.class);
    }

}
