package ac.za.cput.Factory;

import ac.za.cput.Domain.Lecture;

public class LectureFactory {

    public static Lecture getLecture(String professor, int hrs) {
        return new Lecture.Builder()
                .professor(professor)
                .hours(hrs)
                .build();
    }

}
