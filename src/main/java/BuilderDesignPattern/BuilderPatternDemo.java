package BuilderDesignPattern;

public class BuilderPatternDemo {

    public static void tryOutBuilderPattern(){
        Computer computer = new Computer.ComputerBuilder("random CPU", "random motherboard")
                .caseModel("expensive case")
                .gpuModel("random gpu model")
                .build();

        System.out.println(computer.toString());


        Computer computer1 = new Computer.ComputerBuilder("expensive cpu", "cheap motherboard")
                //no gpu
                .caseModel("Most popular case")
                .build();
        System.out.println(computer1.toString());
    }
}
