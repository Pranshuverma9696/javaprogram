public class multification {
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int arr[][]={{1,0,0},{0,1,0},{0,0,1}};
        int brr[][]={{1,0,0},{0,1,0},{0,0,1}};
    
    int res[][]=new int[row][col];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            res[i][j]=0;
            for(int k=0;k<col;k++){
                res[i][j]+=arr[i][k]*brr[k][j];
            }
        }
           
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){

 System.out.print(res[i][j]+" ");
}
System.out.println();
    }
}
}