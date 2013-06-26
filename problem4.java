public class problem4 {
  public static void main (String args[]){
    int largest=0;
    for (int i=100;i<1000;i++){
      for (int x =100;x<1000;x++){
        String s =(i*x)+"";
        if (s.equals(reverse(s))){
          if (i*x>largest){
            largest = i*x;
          }
        }
      }
    }
    System.out.println (largest);
  }
  public static String reverse (String s){
    String builder = "";
    for (int i = 0;i<s.length();i++){
      builder += s.charAt(s.length()-i-1);
    }
    return builder;
  }
}