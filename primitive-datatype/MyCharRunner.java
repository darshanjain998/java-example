public class MyCharRunner
{
  public static void main(String[] args) {
    MyChar ch = new MyChar('c');
    System.out.println(ch.isVowel());
    System.out.println(ch.isNumber());
    System.out.println(ch.isAlphabet());
    ch.printLowerCaseAlphabet();
    ch.printUpperCaseAlphabet();
  }
}
