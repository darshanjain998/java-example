
class MotorBikeRunner
{
  public static void main(String[] args) {
    MotorBike pulsar = new MotorBike(100);
    MotorBike apache = new MotorBike(200);
    MotorBike hunter = new MotorBike();

    hunter.start();
    System.out.println(hunter.getSpeed());
    pulsar.start();
    apache.start();
    System.out.println(apache.getSpeed());

    pulsar.setSpeed(140);
    apache.setSpeed(130);
    pulsar.increaseSpeed(100);
    System.out.println(pulsar.getSpeed());
    apache.increaseSpeed(100);
    System.out.println(apache.getSpeed());

    pulsar.decreaseSpeed(40);
    apache.decreaseSpeed(400);
    System.out.println(pulsar.getSpeed());
    System.out.println(apache.getSpeed());
    }

}
