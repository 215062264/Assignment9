package ac.za.cput.Domain;

public class English {

    private String subjectCode;
    private double mark;

    private English(){}

    private English(English.Builder builder) {
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

        public English.Builder subjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public English.Builder mark(Double mark) {
            this.mark = mark;
            return this;
        }

        public English build() {
            return new English(this);
        }

    }

    @Override
    public String toString() {
        return "English{" +
                "subjectCode='" + subjectCode + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

}
