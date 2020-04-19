
public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance(){
        int dist = 0;
        dist = (int)(Math.random()*10 - 2);
        return dist;
    }

    public boolean simulate() {
        boolean reachedGoal = false;
        int dist = 0;
        int currentThis = 0;
        for (int i = 0; i < this.maxHops; i++) {
            currentThis = this.hopDistance();
            dist += currentThis;
        }

        if (dist >= this.goalDistance) {
            reachedGoal = true;
        }
        return reachedGoal;
    }

    public double runSimulations(int num) {
        int success = 0;
        boolean reachedGoal = false;
        for (int i = 0; i < num; i ++) {
            reachedGoal = this.simulate();
            if(reachedGoal) success ++;
        }
        return (double)success/num;
    }
}
