public class DebugDemo1
{
  public static void main(String args[])
  {
      double bill1 = 45.00;
      double bill2 = 35.00;
      System.out.println("Tips: ");
      calculateip(bill2);
      calculateTip(bill1);

  }
  public void calculateTip(double bill)
  {
      final double rate = 2; // Consider these are percentage
      double tip;
      tip = money * rate;
      System.out.println("Tip: " + tip);
  }
}