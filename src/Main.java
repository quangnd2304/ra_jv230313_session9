public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.add(5,7);
        System.out.println(student1.toString());
        IShop shop = new IShop() {
            @Override
            public void hello() {

            }

            @Override
            public void inputData() {

            }

            @Override
            public void displayData() {

            }
        };
    }
}