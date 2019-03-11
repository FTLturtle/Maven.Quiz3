package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 10/12/2018.
 */
public enum LabStatus {
    PENDING(""), COMPLETED(""), INCOMPLETE("");

    String name;
    LabStatus(String name) {
        this.name = name;
    }
}
