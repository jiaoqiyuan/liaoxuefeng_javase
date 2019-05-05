package two_oop.enum_practice;

public class Main {
    public static void main(String[] args) {
        for (Weekday day : Weekday.values()) {
            System.out.println(day.name());
        }

        Weekday fri = Weekday.FRI;
        // enum -> String
        System.out.println("FRI.name() = " + fri.name());
        //定义时的序号
        System.out.println("FRI.ordinal() = " + fri.ordinal());
        // String -> enum
        System.out.println(Weekday.valueOf("FRI").name());
        System.out.println(fri.toChinese());
        // 不存在的name
        //Weekday.valueOf("AD");
    }
}
