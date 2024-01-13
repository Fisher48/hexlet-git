public class MainClass {
  static int check(int [] a, int C) {
    int x = -1;
    for(int i = 0; i < a.length; i++)
      if(a[i] == C){
        x = i;
        break;
      }
      return x;
  }  
  public static void main(String[] args) {
    int[] a = {1,5,8,4,9};
    int C = 8;
    System.out.print(check(a, C));
  }
}