import java.util.ArrayList;
public class Box implements Packable {

    private double maxWeight;
    private ArrayList<Packable> boxContents;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.boxContents = new ArrayList<>();
    }

    public void add(Packable itemToPack) {
        if (this.weight() + itemToPack.weight() <= maxWeight) {

            boxContents.add(itemToPack);

        }

    }
    @Override
    public double weight() {
        double sum = 0;

        for (Packable e : boxContents) {
            sum += e.weight();
        }
        return (double) sum;
    }
    @Override
    public String toString() {
        return "This box contains " + boxContents.size() + " items and in total weighs " + this.weight() + " kg";
    }



}