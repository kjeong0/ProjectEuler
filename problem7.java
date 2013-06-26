public class problem7 {
  public static void main (String args[]){
    //upper limit n is guessed because #yolo
    boolean soe [] = new boolean [10000000];
    int count = 1;
    int current = 2;
    for (int i = 0;i<10000000;i++){
      soe[i]=true;
    }
    while (count!=10001){
      for (int i = current;i<10000000;i+=current){
        soe[i]=false;
      }
      count ++;
      while (!soe[current]){
        current++;
      }
    }
    System.out.println (current);
  }
}