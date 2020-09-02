package BuilderDesignPattern;

public class Computer {

    // all final fields, no setters to provide immutability
    private final String cpuModel;  // required
    private final String motherboardModel;  //required
    private final String gpuModel;  //optional
    private final String caseModel; //optional


    private Computer(ComputerBuilder builder){
        this.cpuModel = builder.cpuModel;
        this.motherboardModel = builder.motherboardModel;
        this.gpuModel = builder.gpuModel;
        this.caseModel = builder.caseModel;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public String getMotherboardModel() {
        return motherboardModel;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public String getCaseModel() {
        return caseModel;
    }

    @Override
    public String toString() {
        return "Computer : " +
                "cpuModel=" + cpuModel + '\'' +
                "motherboardModel='" + motherboardModel + '\'' +
                "gpuModel='" + gpuModel + '\'' +
                "caseModel='" + caseModel;
    }

    // nested static builder
    public static class ComputerBuilder{
        private final String cpuModel;
        private final String motherboardModel;
        private String gpuModel;
        private String caseModel;

        public ComputerBuilder(String cpuModel, String motherboardModel) {
            this.cpuModel = cpuModel;
            this.motherboardModel = motherboardModel;
        }

        public ComputerBuilder gpuModel(String gpuModel) {
            this.gpuModel = gpuModel;
            return this;
        }
        public ComputerBuilder caseModel(String caseModel){
            this.caseModel = caseModel;
            return this;
        }

        public Computer build(){
            Computer computer = new Computer(this);
            return computer;
        }
    }
}
