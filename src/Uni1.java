public class Uni1 {
    public static void main(String[] args) {
        /*
        Student sajedul = new Student("Sajedul", 29);
        Student shadli = new Student("Shadli", 1);
        Student xyz = new Student("XYZ", 2);
         */
        IResultCal resultCalc = new ResultCalc();
        Student sajedul = new Student("Sajedul", 29,resultCalc);
        Student shadli = new Student("Shadli", 1,resultCalc);
        Student xyz = new Student("XYZ", 2,resultCalc);
        int[] marks1= {10,20,30,25};
        int[] marks2= {35,20,30,25};

        sajedul.setTcMarks(marks1);
        shadli.setTcMarks(marks2);
        xyz.setTcMarks(marks1);

        IResultCal resultCalcM2 = new ResultCalcM2(5);
        IResultCal resultCalcM3 = new ResultCalcM2(15);

        sajedul.setResultCalc(resultCalcM2);
        xyz.setResultCalc(resultCalcM3);

        System.out.println(sajedul.getAvgTcMarks());
        System.out.println(shadli.getAvgTcMarks());
        System.out.println(xyz.getAvgTcMarks());

        System.out.println(sajedul);
        System.out.println(shadli);
        System.out.println(xyz);
    }
}
