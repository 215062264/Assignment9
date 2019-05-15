package ac.za.cput.factory.peopleFactory;

import ac.za.cput.domain.people.Educator;

public class EducatorFactory {

    public static Educator getEducator(String firstName, String lastName,String educatorId, int age) {
        return new Educator.Builder().age(age)
                .educatorFirstName(firstName)
                .educatorLastName(lastName)
                .educatorId(educatorId)
                .build();
    }

}
