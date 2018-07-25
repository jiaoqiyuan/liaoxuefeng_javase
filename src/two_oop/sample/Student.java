package two_oop.sample;

public class Student extends Person{
    private int score;

    public Student(String name) {
        super(name);
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String hello() {
        return super.hello() + "!";
    }

    public void run() {
        System.out.println("Student " + getName() + " is running");
    }
}
