public class Aspirant extends Student {
    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }
    @Override
    public void getScholarship() {
        if (averageMark == 5) {
            System.out.print(200);
        } else {
            System.out.print(180);
        }
    }
}