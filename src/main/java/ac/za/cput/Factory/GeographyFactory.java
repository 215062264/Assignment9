package ac.za.cput.Factory;

import ac.za.cput.Domain.Geography;

public class GeographyFactory {

    public static Geography getGeography(String subjectCode, double mark) {
        return new Geography.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
