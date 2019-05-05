package nine_Regex.six_Search;

public class Replace {
    public static void main(String[] args) {
        String s = "The   quick brown fox   jumps over   the lazy dog.";
        String r = s.replaceAll("\\s+", " ");
        System.out.println(r);
        String r2 = r.replaceAll("(\\w+)", "<b>$1</b>");
        System.out.println(r2);
    }
}
