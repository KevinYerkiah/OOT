



public class question3{
    private static class Matrix{
        private static int num_of_rows=0;
        private static int num_of_column=0;
        private static int [][]myarr;

        //constructor
        public Matrix(int RowNum,int ColNum,int [][] myarr){
            this.num_of_rows=RowNum;
            this.num_of_column=ColNum;
            this.myarr=myarr;

        }
        //method 1:
        public static void getNumRow(){
            System.out.println("Number of rows = "+Matrix.num_of_rows);
        }
        public static void getNumCol(){
            System.err.println("Number of Columns = "+Matrix.num_of_column);
        }
        public static void Setelement(int i,int j,int value){
            Matrix.myarr[i][j]=value;
        }
        public static void addMatrix(Matrix [][]a ,Matrix [][]b){
            if ((a.length == b.length)&&(a[0].length==b[0].length)){
                int row=a.length;
                int col=a[0].length;

                Matrix [][]c= new Matrix [row][col];
                int sum =0;

                System.out.println("Matrix are the same size can be added ");
                //addition part
                for (int i =0; i<row;i++){
                    for(int j =0 ;j< col;j++){
                        c[i][j].myarr[i][j]= a[i][j].myarr[i][j]+ b[i][j].myarr[i][j];

                    }
                }

            }else{
                System.out.println("Matrix cannot be added ");
            }
        }

    }
}