public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;
    public Student(String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public Student() {
    }
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getAverageMark() {
        return averageMark;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getGroup() {
        return group;
    }
    public String getLastName() {
        return lastName;
    }
    public void getScholarship() {
        if (averageMark == 5) {
            System.out.print(200);
        } else {
            System.out.print(180);
        }
    }
}