package ac.za.cput.Domain;

public class Registration {

    private String regNum, status;

    private Registration(){}

    private Registration(Registration.Builder builder) {
        this.regNum = builder.regNum;
        this.status = builder.status;
    }

    public String getRegNum() {
        return regNum;
    }

    public String getStatuse() {
        return status;
    }

    public static class Builder{

        private String regNum, status;

        public Registration.Builder regNum(String regNum) {
            this.regNum = regNum;
            return this;
        }

        public Registration.Builder status(String status) {
            this.status = status;
            return this;
        }

        public Registration build() {
            return new Registration(this);
        }

    }

    @Override
    public String toString() {
        return "Registration{" +
                "regNum='" + regNum + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
