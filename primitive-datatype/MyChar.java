public class MyChar
{
  private char ch;
  MyChar()
  {
  }
  MyChar(char ch)
  {
    this.ch = ch;
  }
  public void setChar(char ch)
  {
    this.ch = ch;
  }
  public char getChar()
  {
    return this.ch;
  }
  public boolean isVowel()
  {

    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
        ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    {
      return true;
    }
    return false;
  }
  public boolean isNumber()
  {
    if(ch>='0'&&ch<='9')
    {
      return true;
    }
    return false;
  }
  public boolean isAlphabet()
  {
    if((ch>='a'&&ch<='z') ||(ch>='A'&&ch<='Z') )
    {
      return true;
    }
    return false;
  }
  public void printLowerCaseAlphabet()
  {
    for(char c = 'a';c<='z';c++)
    {
      System.out.println(c);
    }
  }
  public void printUpperCaseAlphabet()
  {
    for(char c = 'A';c<='Z';c++)
    {
      System.out.println(c);
    }
  }
}
