package four_reflect.eleven_generic_reflection;

public class Pair<T> {

    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setLast(T last) {
        this.last = last;
    }

    public String toString() {
        return "Pair(" + first + ", " + last + ")";
    }

    public static <K> Pair<K> create(K first, K last) {
        return new Pair<>(first, last);
    }
}
