public class problem2 {
  public static void main (String args []){
    int first = 1;
    int second = 1;
    int temp;
    int count = 0;
    
    while (second < 4000000){
      temp = second;
      second = first+second;
      first = temp;
      if (first%2==0){
        count+=first;
      }
    }
    System.out.println(count);
  }
}
    