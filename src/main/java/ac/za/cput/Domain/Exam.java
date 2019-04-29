package ac.za.cput.Domain;

public class Exam {

    private String examNum, studentNum;
    private double mark;

    private Exam(){}

    private Exam(Exam.Builder builder) {
        this.examNum = builder.examNum;
        this.studentNum = builder.studentNum;
        this.mark = builder.mark;
    }

    public String getExamNum() {
        return examNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public double getExamMark() {
        return mark;
    }


    public static class Builder {

        private String examNum, studentNum;
        private double mark;

        public Exam.Builder examNum(String examNum) {
            this.examNum = examNum;
            return this;
        }

        public Exam.Builder studentNum(String studentNum) {
            this.studentNum = studentNum;
            return this;
        }

        public Exam.Builder mark(double mark) {
            this.mark = mark;
            return this;
        }



        public Exam build() {
            return new Exam(this);
        }

    }

    @Override
    public String toString() {
        return "Exam{" +
                "examNum='" + examNum + '\'' +
                ", studentNum='" + studentNum + '\'' +
                ", Mark='" + mark + '\'' +
                '}';
    }

}
