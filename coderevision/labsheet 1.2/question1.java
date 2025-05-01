public class question1{
    public static class Holiday{
        private String name="";
        private int day=0;
        private String month="";

        //constructor for implementation of the class holiday
        public  Holiday(int day,String month,String name) {
            this.name=name;
            this.day=day;
            this.month=month;
        }
        //method implementation
        public static boolean isSameMonth(String month1,String month2){
            if(month1.equals(month2)){
                return true;
            }else {
                return false;
            }
        }
        public static Double avgDate(Holiday[]myarr){
            double avg;
            int size= myarr.length;
            int sum=0;
            for(int i = 0; i< size;i++){
                sum = sum + myarr[i].day;
            }
            avg = (sum /size);
            return avg;

        }
    }


    public static void main(String[] args) {
        Holiday day1= new Holiday(4,"July","Independence day");
        System.out.println("Day 1 = "+day1.day+" "+day1.month+" "+day1.name);


    }
}