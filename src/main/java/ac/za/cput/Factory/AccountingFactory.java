package ac.za.cput.Factory;

import ac.za.cput.Domain.Accounting;

public class AccountingFactory {

    public static Accounting getAccounting(String subjectCode, double mark) {
        return new Accounting.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
