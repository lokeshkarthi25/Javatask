class sample{
    sample(int x){
            if(x>0){
                if(x%2==0){
                    System.out.println(x+"is postive and even");
                }
                else{
                    System.out.println(x+"is postive and odd");

                }
            }
            else if(x<0){
                System.out.println(x+"is negative ");
            }
            else{
                System.out.println("Zero");
            }
    }
}
public class demo{
    public static void main(String args[]){
        new sample(7);
    }
}