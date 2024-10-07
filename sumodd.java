public class sumodd {
    public static void main(String[] args) {
        int sumeven=0;
        int sumodd=0;
       
       for(int i=1;i<=10;i++){
        System.out.println(i);
        if(i%2==0){
            sumeven+=i;
        }else if(i%2!=0){
            sumodd+=i;
        }
       }
       System.out.println("The even number sum is "+sumeven); 
       System.out.println("The odd number sum is "+sumodd);
    }
}
