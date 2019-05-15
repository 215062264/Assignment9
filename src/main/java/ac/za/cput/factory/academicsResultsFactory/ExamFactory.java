package ac.za.cput.factory.academicsResultsFactory;

import ac.za.cput.domain.academicResults.Exam;

public class ExamFactory {

    public static Exam getExam(String examNum, String studentNum, double mark) {
        return new Exam.Builder()
                .examNum(examNum)
                .studentNum(studentNum)
                .mark(mark)
                .build();
    }

}
