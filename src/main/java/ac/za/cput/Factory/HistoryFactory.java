package ac.za.cput.Factory;

import ac.za.cput.Domain.History;

public class HistoryFactory {

    public static History getHistory(String subjectCode, double mark) {
        return new History.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
