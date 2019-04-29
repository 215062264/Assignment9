package ac.za.cput.Domain;

public class Results {

    private String studentNum;
    private double mark;

    private Results(){}

    private Results(Results.Builder builder) {
        this.studentNum = builder.studentNum;
        this.mark = builder.mark;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public double getFinalMark() {
        return mark;
    }


    public static class Builder {

        private String studentNum;
        private double mark;

        public Results.Builder studentNum(String studentNum) {
            this.studentNum = studentNum;
            return this;
        }

        public Results.Builder mark(double mark) {
            this.mark = mark;
            return this;
        }



        public Results build() {
            return new Results(this);
        }

    }

    @Override
    public String toString() {
        return "Results{" +
                ", studentNum='" + studentNum + '\'' +
                ", Mark='" + mark + '\'' +
                '}';
    }

}
