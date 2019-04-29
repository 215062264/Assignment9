package ac.za.cput.Factory;

import ac.za.cput.Domain.Tutorial;
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
