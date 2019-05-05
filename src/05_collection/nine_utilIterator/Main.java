package five_collection.nine_utilIterator;

public class Main {
    public static void main(String[] args) {
        ReadOnlyList<String> list = new ReadOnlyList<>("Apple", "peer", "oringe");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
