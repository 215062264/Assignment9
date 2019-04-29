package ac.za.cput.Factory;

import ac.za.cput.Domain.Economics;

public class EconomicsFactory {

    public static Economics getEconomics(String subjectCode, double mark) {
        return new Economics.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
