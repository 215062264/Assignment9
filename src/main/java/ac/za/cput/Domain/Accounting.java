package ac.za.cput.Domain;

public class Accounting {

    private String subjectCode;
    private double mark;

    private Accounting(){}

    private Accounting(Accounting.Builder builder) {
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

        public Accounting.Builder subjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public Accounting.Builder mark(Double mark) {
            this.mark = mark;
            return this;
        }

        public Accounting build() {
            return new Accounting(this);
        }

    }

    @Override
    public String toString() {
        return "Accounting{" +
                "subjectCode='" + subjectCode + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

}
