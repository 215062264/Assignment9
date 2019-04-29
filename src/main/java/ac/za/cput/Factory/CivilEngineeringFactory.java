package ac.za.cput.Factory;

import ac.za.cput.Domain.CivilEngineering;

public class CivilEngineeringFactory {

    public static CivilEngineering getCivilEngineering(String subjectCode, double mark) {
        return new CivilEngineering.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
