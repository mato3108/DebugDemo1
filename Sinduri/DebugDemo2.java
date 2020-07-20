public class DebugDemo2 {

  final static int z = 0;

  public static void main(String[] args) {
      System.out.println(modernMachine(5, 2));
      System.out.println("Infinity is endless!");
  }

  //double or float supports infinity; int doesn't.
  public static float modernMachine(float n, float m) {
      float ix;

      m = z;

      //Dividing by zero
      ix = n / m;
      return ix;
      
  }

  
}