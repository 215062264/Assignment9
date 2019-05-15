package ac.za.cput.factory.schoolSubjectsFactory;

import ac.za.cput.domain.schoolSubjects.CivilEngineering;

public class CivilEngineeringFactory {

    public static CivilEngineering getCivilEngineering(String subjectCode, double mark) {
        return new CivilEngineering.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
