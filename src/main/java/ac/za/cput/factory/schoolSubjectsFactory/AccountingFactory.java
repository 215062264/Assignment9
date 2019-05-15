package ac.za.cput.factory.schoolSubjectsFactory;

import ac.za.cput.domain.schoolSubjects.Accounting;

public class AccountingFactory {

    public static Accounting getAccounting(String subjectCode, double mark) {
        return new Accounting.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
