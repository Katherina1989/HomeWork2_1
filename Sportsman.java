package homework21;

public class Sportsman {
    private String name;
    private int energy;
    private double speed;
    private double totalTime;
    private boolean out;

    public Sportsman(String name, int energy, double speed) {
        this.name = name;
        this.energy = energy;
        this.speed = speed;
    }

    public void go(Let let) {
        if (!out && let.getLevel() <= energy) {
            energy -=let.getLevel();
            totalTime += let.getLength() / speed;
        } else {
            out = true;
        }
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public double getSpeed() {
        return speed;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public boolean isOut() {
        return out;
    }
}
