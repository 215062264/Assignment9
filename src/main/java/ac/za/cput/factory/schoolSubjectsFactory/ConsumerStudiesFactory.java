package ac.za.cput.factory.schoolSubjectsFactory;

import ac.za.cput.domain.schoolSubjects.ConsumerStudies;

public class ConsumerStudiesFactory {

    public static ConsumerStudies getConsumerStudies(String subjectCode, double mark) {
        return new ConsumerStudies.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
