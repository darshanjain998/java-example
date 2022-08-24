import java.math.*;
public class SimpleInterestCalculator
{
  private BigDecimal principal;
  private BigDecimal interest;
  SimpleInterestCalculator(String principal,String interest)
  {
    this.principal = new BigDecimal(principal);
    this.interest = new BigDecimal(interest);
  }
  public BigDecimal calculateTotalValue(int year)
  {
    this.principal = this.principal.add(this.principal.multiply(this.interest.multiply(new BigDecimal(year))).divide(new BigDecimal(100)));
    return principal;
  }
}
