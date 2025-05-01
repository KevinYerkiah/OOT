



public class question2{
    public static class Movie{
        private String title="";
        private String studio="";
        private String rating="";


        //constructor
        public  Movie(String title,String studio,String rating){
            this.title=title;
            this.studio=studio;
            this.rating=rating;            
        }  
        //constructor 2

        public Movie(String title,String studio){
            this.title=title;
            this.studio=studio;
            rating="PG";
        }
        //method getPG
        public static void getPG(Movie []myarr){
            int size= myarr.length;
            Movie[] outputarr;
            int z=0;
            for(int i = 0;i<size;i++){
                if(myarr[i].rating.equals("PG")){
                  System.out.println(myarr[i].title);
                  System.out.println(myarr[i].studio);
                  System.out.println(myarr[i].rating);
                }
            }

        }

    }
        public static void main(String[] args) {
            Movie []movies=
            {
                new Movie("Casino Royale", "Eon Productions", "PG13"),
                new Movie("Finding Nemo", "Pixar", "PG"),
                new Movie("Inception", "Warner Bros.", "PG13"),
                new Movie("Frozen", "Disney"),
                new Movie("Toy Story", "Pixar", "PG")
            };

            System.out.println("movies");
            Movie.getPG(movies);
        }    
}