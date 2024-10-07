public class subtract {
    public static void main(String[] args) {
        System.out.println("The First matix is:");
        int row=3;
        int col=3;
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+ " ");
         
            }
            System.out.println( );
        }
        System.out.println("The second matris is :");
        int brr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(brr[i][j]+ " ");
         
            }
            System.out.println( );
        }
        System.out.println("The subtract is :");
        int res[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               res[i][j]=arr[i][j]-brr[i][j];
               System.out.print(res[i][j]+" ");
    }
    System.out.println();
        }
    }
}
