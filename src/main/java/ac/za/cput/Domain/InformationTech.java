package ac.za.cput.Domain;

public class InformationTech {

    private String subjectCode;
    private double mark;

    private InformationTech(){}

    private InformationTech(InformationTech.Builder builder) {
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

        public InformationTech.Builder subjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public InformationTech.Builder mark(Double mark) {
            this.mark = mark;
            return this;
        }

        public InformationTech build() {
            return new InformationTech(this);
        }

    }

    @Override
    public String toString() {
        return "Information Technology{" +
                "subjectCode='" + subjectCode + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

}
