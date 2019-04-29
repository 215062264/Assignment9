package ac.za.cput.Domain;

public class Geography {

    private String subjectCode;
    private double mark;

    private Geography(){}

    private Geography(Geography.Builder builder) {
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

        public Geography.Builder subjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public Geography.Builder mark(Double mark) {
            this.mark = mark;
            return this;
        }

        public Geography build() {
            return new Geography(this);
        }

    }

    @Override
    public String toString() {
        return "Geography{" +
                "subjectCode='" + subjectCode + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

}
