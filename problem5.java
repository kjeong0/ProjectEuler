public class problem5 {
  public static void main (String args[]){
    boolean found = false;
    int i = 20;
    while (!found){
      i++;
      int count = 2;
      while (i%count==0){
        count++;
        if (count == 20){
          found = true;
          System.out.println (i);
        }
      }
    }
  }
}