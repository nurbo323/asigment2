import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee emp2 = new Employee("George", "Harrison", "Developer", 50000.00);

        Student stu1 = new Student("Ringo", "Starr", 2.5);
        Student stu2 = new Student("Paul", "McCartney", 3.8);

        ArrayList<Payable> payables = new ArrayList<>();
        payables.add(emp1);
        payables.add(emp2);
        payables.add(stu1);
        payables.add(stu2);

        Collections.sort((ArrayList<Person>) (ArrayList<?>) payables);

        printData(payables);
    }

    public static void printData(Iterable<Payable> payables) {
        for (Payable payable : payables) {
            String position = (payable instanceof Employee) ? "Employee" : "Student";
            String output = position + ": " + payable.toString() +
                    " earns " + String.format("%.2f", payable.getPaymentAmount()) + " tenge";
            System.out.println(output);
        }
    }
}
