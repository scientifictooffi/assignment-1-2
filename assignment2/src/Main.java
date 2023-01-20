
import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vehicles.Cars;
import com.company.vehicles.Lorry;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Recursion recursion = new Recursion();
            recursion.printNumbers(1,8);
            Student STUDENT = new Aspirant("Sal", "Kar", "007", 4.0);
            Student[] students = new Student[3];
            students[0] = new Student("Jack", "Loren", "008", 3.3);
            students[1] = new Student("Sam", "God", "009", 4.3);
            students[2] = new Aspirant("Chris", "Eva", "101", 5.0);
            for(int i=0;i<3;i++){
                students[i].getScholarship();        }
            STUDENT.getScholarship();}
 }