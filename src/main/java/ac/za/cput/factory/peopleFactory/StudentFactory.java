package ac.za.cput.factory.peopleFactory;

import ac.za.cput.domain.people.Student;
import ac.za.cput.util.Misc;

public class StudentFactory {

    public static Student getStudent(String firstName, String lastName, int age) {
        return new Student.Builder().age(age)
                .studentFirstName(firstName)
                .studentLastName(lastName)
                .studentId(Misc.generateId())
                .build();
    }

}
