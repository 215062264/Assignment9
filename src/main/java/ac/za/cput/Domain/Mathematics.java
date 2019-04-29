package ac.za.cput.Domain;

public class Mathematics {

    private String subjectCode;
    private double mark;

    private Mathematics(){}

    private Mathematics(Mathematics.Builder builder) {
        this.subjectCode = builder.subjectCode;
        this.mark = builder.mark;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public Double getMark() {
        return mark;
    }


    public static class Builder{

        private String subjectCode;
        private double mark;

        public Mathematics.Builder subjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public Mathematics.Builder mark(Double mark) {
            this.mark = mark;
            return this;
        }

        public Mathematics build() {
            return new Mathematics(this);
        }

    }

    @Override
    public String toString() {
        return "Mathematics{" +
                "subjectCode='" + subjectCode + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }


}
