class MotorBike
{
  private int speed;
  MotorBike()
  {
    this(5);
  }
  MotorBike(int speed)
  {
    this.speed = speed;
  }
  public void setSpeed(int speed)
  {
    if(speed>0)
    this.speed = speed;
  }
  public int getSpeed()
  {
    return this.speed;
  }
  void start()
  {
    System.out.println("Bike Started");
  }
  public void increaseSpeed(int howMuch)
  {
    this.speed = this.speed + howMuch;
  }
  public void decreaseSpeed(int howMuch)
  {
    setSpeed(this.speed-howMuch);
  }
}
