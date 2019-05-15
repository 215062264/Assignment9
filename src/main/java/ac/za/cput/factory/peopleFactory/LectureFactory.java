package ac.za.cput.factory.peopleFactory;

import ac.za.cput.domain.people.Lecture;

public class LectureFactory {

    public static Lecture getLecture(String professor, int hrs) {
        return new Lecture.Builder()
                .professor(professor)
                .hours(hrs)
                .build();
    }

}
