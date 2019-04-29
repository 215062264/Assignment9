package ac.za.cput.Domain;

public class BusinessStudies {

    private String subjectCode;
    private double mark;

    private BusinessStudies(){}

    private BusinessStudies(BusinessStudies.Builder builder) {
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

        public BusinessStudies.Builder subjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public BusinessStudies.Builder mark(Double mark) {
            this.mark = mark;
            return this;
        }

        public BusinessStudies build() {
            return new BusinessStudies(this);
        }

    }

    @Override
    public String toString() {
        return "Business Studies{" +
                "subjectCode='" + subjectCode + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

}
