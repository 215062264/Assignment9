package ac.za.cput.Factory;

import ac.za.cput.Domain.LifeOrientation;

public class LifeOrientationFactory {


    public static LifeOrientation getLifeOrientation(String subjectCode, double mark) {
        return new LifeOrientation.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
