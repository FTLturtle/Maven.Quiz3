package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private TreeMap<Lab, LabStatus> map;

    public Student() {
        this(new TreeMap<>());
    }

    public Student(Map<Lab, LabStatus> map) {
        this.map = (TreeMap<Lab, LabStatus>) map;
    }

    public Lab getLab(String labName) {
        for (Lab lab : map.keySet()) {
            if (lab.getName().equals(labName)) {
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) throws UnsupportedOperationException {
        Lab lab = getLab(labName);


        try {
            map.get(lab);
        } catch (NullPointerException n) {
            throw new UnsupportedOperationException();
        }

        map.replace(lab, labStatus);
    }


    public void forkLab(Lab lab) {
        map.put(lab, LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        return map.get(getLab(labName));
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Lab lab : map.keySet()) {
            s.append(String.format("%s > %s\n", lab.getName(), map.get(lab).toString()));
        }
        return s.deleteCharAt(s.length() - 1).toString();
    }
}
