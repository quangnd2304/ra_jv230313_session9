import java.util.List;

public class Student1  extends PersonClass{
//    Student1 is a Person --> Inheritance
    private float mark;
    private boolean sex;
    // Student1 has a Address
    private List<Address> listAddress;

    public Student1() {
    }

    public Student1(float mark, boolean sex) {
        this.mark = mark;
        this.sex = sex;
    }

    public Student1(int id, String name, float mark, boolean sex) {
        super(id, name);
        this.mark = mark;
        this.sex = sex;
    }
}
