import java.math.*;
public class SimpleInterestCalculatorRunner
{
  public static void main(String[] args) {
    SimpleInterestCalculator cal = new SimpleInterestCalculator("4500.00","7.5");
    BigDecimal total = cal.calculateTotalValue(5);
    System.out.println(total);
  }
}
