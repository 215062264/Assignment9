package ac.za.cput.Factory;

import ac.za.cput.Domain.Mathematics;

public class MathematicsFactory {

    public static Mathematics getMath(String subjectCode, double mark) {
        return new Mathematics.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
