public class Student extends Person{
    public Student() {
    }

    public Student(int id, String name, int age, String address) {
        super(id, name, age, address);
    }

    @Override
    public void talk() {
        System.out.println("Student talk");
    }

    @Override
    public void study() {
        System.out.println("Student study");
    }

    @Override
    public int add(int number1, int number2) {
        return number1+number2;
    }

    public String toString(){
        return "Phương thức toString đã bị ghi đè";
    }


}
