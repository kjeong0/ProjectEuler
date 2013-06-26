public class problem6 {
  public static void main (String args[]){
    int a = 0;
    int b = 0;
    for (int i = 0;i<=100;i++){
      a+=Math.pow(i,2);
    }
    for (int i = 0;i<=100;i++){
      b+=i;
    }
    b = (int)Math.pow(b,2);
    System.out.println (b-a);
  }
}