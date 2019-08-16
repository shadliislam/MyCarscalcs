import java.util.Arrays;

public class Student {
    String name;
    int id;
    int[] tcMarks = new int[4];
    String address;

    IResultCal resultCalc;

    float avgMark;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, IResultCal resultCalc) {
        this.name = name;
        this.id = id;
        this.resultCalc = resultCalc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getTcMarks() {
        return tcMarks;
    }

    public void setTcMarks(int[] tcMarks) {
        this.tcMarks = tcMarks;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public IResultCal getResultCalc() {
        return resultCalc;
    }

    public void setResultCalc(IResultCal resultCalc) {
        this.resultCalc = resultCalc;
    }
    public float getAvgTcMarks(){
        int topMarks = resultCalc.getSumOfTop3Marks(this.tcMarks);
        this.avgMark = resultCalc.calAvg(topMarks);
        return this.avgMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", tcMarks=" + Arrays.toString(tcMarks) +
                ", avgMark=" + avgMark +
                '}';
    }
}
