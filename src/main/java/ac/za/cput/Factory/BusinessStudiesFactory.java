package ac.za.cput.Factory;

import ac.za.cput.Domain.BusinessStudies;

public class BusinessStudiesFactory {


    public static BusinessStudies getBusinessStudies(String subjectCode, double mark) {
        return new BusinessStudies.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
