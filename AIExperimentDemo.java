public class AIExperimentDemo {

    static void addEpoch(AIExperiment experiment) {

        experiment.completedEpochs =
                experiment.completedEpochs + 5;
    }

    public static void main(String[] args) {

        AIExperiment experiment1 = new AIExperiment();

         experiment1.experimentName = "Image Classification";
         experiment1.completedEpochs = 10;
         experiment1.targetEpochs = 50;

        AIExperiment experiment2 = new AIExperiment();

         experiment2.experimentName= "Object Detection";
        experiment2.completedEpochs = 20;
        experiment2.targetEpochs= 60;

        System.out.println("INITIAL STATE");

         System.out.println(experiment1.status());
        System.out.println(experiment2.status());

        experiment1.runEpochs(10);

        experiment1.runEpochs(5, 3);

         experiment2.runEpochs(15);

         System.out.println("\nAFTER METHOD CALLS");

        System.out.println(experiment1.status());
         System.out.println(experiment2.status());

         System.out.println("\nREMAINING EPOCHS");

          System.out.println(experiment1.experimentName
                + ": " + experiment1.remainingEpochs());

        System.out.println(experiment2.experimentName
                + ": " + experiment2.remainingEpochs());

        System.out.println("\nPASS-BY-VALUE EXPERIMENT");

         System.out.println("Before helper method: "
                + experiment2.completedEpochs);

        addEpoch(experiment2);

        System.out.println("After helper method: "
                +  experiment2.completedEpochs);

        System.out.println("\nINDEPENDENT OBJECTS");

        System.out.println("Experiment 1 completed epochs: "
                + experiment1.completedEpochs);

        System.out.println("Experiment 2 completed epochs: "
                + experiment2.completedEpochs);
    }
}