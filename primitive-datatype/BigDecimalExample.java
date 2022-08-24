import java.math.*;
public class BigDecimalExample
{
  public static void main(String[] args) {
    BigDecimal  n1 = new BigDecimal("36.432432");
    BigDecimal n2 = new BigDecimal("76.4232");
    double d = n1.doubleValue();
    System.out.println(d);
    int i = 100;


//operation on BigDecimal
    BigDecimal n3 = n1.add(n2);
    n3 = n3.add(new BigDecimal(i));
    System.out.println(n3);
  }
}
