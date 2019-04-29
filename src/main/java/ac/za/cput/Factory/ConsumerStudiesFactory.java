package ac.za.cput.Factory;

import ac.za.cput.Domain.ConsumerStudies;

public class ConsumerStudiesFactory {

    public static ConsumerStudies getConsumerStudies(String subjectCode, double mark) {
        return new ConsumerStudies.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
