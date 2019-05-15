package ac.za.cput.factory.peopleFactory;

import ac.za.cput.domain.people.Tutorial;
import ac.za.cput.util.Misc;

public class TutorialFactory {

    public static Tutorial getTutorial(String firstName, String lastName) {
        return new Tutorial.Builder()
                .tutorFirstName(firstName)
                .tutorLastName(lastName)
                .tutorId(Misc.generateId())
                .build();
    }

}
