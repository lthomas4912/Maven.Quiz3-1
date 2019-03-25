package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable<Lab>{
    private String name;
    private LabStatus labStatus;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.name = labName;
    }

    public String getName() {
        return name;
    }

    public LabStatus getLabStatus() {
        return labStatus;
    }

    public void setLabStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    @Override
    public int compareTo(Lab o) {
        return 0;
    }
}
