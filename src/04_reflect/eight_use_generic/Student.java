package four_reflect.eight_use_generic;

public class Student implements Comparable<Student>{

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return "Student(" + name + ", " + score + ")";
    }


    @Override
    public int compareTo(Student o) {
        if(this.score < o.score){
            return 1;
        } else if (this.score == o.score) {
            return 0;
        }
        return -1;
    }
}
