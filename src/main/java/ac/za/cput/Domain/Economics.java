package ac.za.cput.Domain;

public class Economics {

    private String subjectCode;
    private double mark;

    private Economics(){}

    private Economics(Economics.Builder builder) {
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

        public Economics.Builder subjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public Economics.Builder mark(Double mark) {
            this.mark = mark;
            return this;
        }

        public Economics build() {
            return new Economics(this);
        }

    }

    @Override
    public String toString() {
        return "Economics{" +
                "subjectCode='" + subjectCode + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

}
