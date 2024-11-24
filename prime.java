public class prime{
  public static void main(String args[]){
    boolean isprime=true;
    int n=55;
    for (int i=2;i<n/2;i++){
      if(isprime/i==0)
      {
        isprime=false;
    }
    }
      if(isprime){
        System.out.println("prime");
      else{
        System.out.println("not prime");
      }
    }
