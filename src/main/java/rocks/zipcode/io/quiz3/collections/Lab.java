package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable<Lab>{
    private String labName;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {
        return labName;
    }

    @Override
    public int compareTo(Lab o) {
        return this.getName().compareTo(o.getName());
    }
}
