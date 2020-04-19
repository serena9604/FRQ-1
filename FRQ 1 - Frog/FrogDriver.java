
public class FrogDriver
{
    public static void main(String args[]) {
        FrogSimulation f = new FrogSimulation(20, 10);
        System.out.println("f.simulate(): " + f.simulate());
        System.out.println("f.runSimulations(): " + f.runSimulations(400));
    }
}
