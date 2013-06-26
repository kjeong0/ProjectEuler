public class problem3 {
  public static void main (String args[]){
    long num = (long)600851475143.0;
    while (num!=1){
      int count = 2;
      while (num%count!=0){
        count++;
      }
      if (num/count!=1){
        num = num/count;
      } else {
        System.out.println (num);
        num=1;
      }
    }
  }
}