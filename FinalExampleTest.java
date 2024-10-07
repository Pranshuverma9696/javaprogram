public class FinalExampleTest{
    final int age=18;
    void display(){
        System.out.println(age);
        //age=5; 
    }
   

public static void main(String[]args){
     FinalExampleTest obj=new FinalExampleTest();
     obj.display();
}
}