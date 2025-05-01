public class question4{

    public static class Player{
        private String firstname = "";
        private String lastname= "";
        private int number=0;

        public Player(String firstname,String lastname,int number){
            this.firstname=firstname;
            this.lastname=lastname;
            this.number=number;


        }
        public Player(){
            this.firstname = "John";
            this.lastname = "Doe";
            this.number = 1;
       }
            //copy constructor
            public Player(Player player1){
            this.firstname = "John";
            this.lastname = "Doe";
            this.number = 1;

        }
        //get methods
        public  String getFname(){
            return firstname;
        }
        public String getLname(){
            return lastname;
        }
        public int getNum(){
            return number;
        }

        public void setFname(String fname){
            this.firstname=fname;
        }
        public void setLname(String lname){
            this.lastname=lname;
        }
        public void setNumber(int num){
            this.number=num;
        }


    }
}