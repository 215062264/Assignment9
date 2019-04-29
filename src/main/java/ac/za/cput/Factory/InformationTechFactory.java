package ac.za.cput.Factory;

import ac.za.cput.Domain.InformationTech;

public class InformationTechFactory {

    public static InformationTech getInfoTech(String subjectCode, double mark) {
        return new InformationTech.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
