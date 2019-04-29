package ac.za.cput.Factory;

import ac.za.cput.Domain.Exam;

public class ExamFactory {

    public static Exam getExam(String examNum, String studentNum, double mark) {
        return new Exam.Builder()
                .examNum(examNum)
                .studentNum(studentNum)
                .mark(mark)
                .build();
    }

}
