public class ResultCalc implements IResultCal{
    public ResultCalc() {
    }
    public int getSumOfTop3Marks(int[] marks){
        int low=999;
        int sum=0;
        for(int i=0;i<marks.length;i++){
            if(marks[i]<low){
                low=marks[i];
            }
            sum = sum +marks[i];
        }
        System.out.println("Low: "+low);
        return sum -low;
    }
    public float calAvg(int totalMarks){
        return  totalMarks/3;
    }
}
