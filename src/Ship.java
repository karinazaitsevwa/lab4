public class Ship implements InterfaceShip {
    private final String name;
    private int displacement;
    private int amountOfPassengers;
    private int limit;
    private Location location;
    private final Location startPosition = Location.RUSSIA;
    private static String type = "Sailboat";

    public Ship (String nameFromUser, int displacementFromUser, String placeFromUser, int limitFromUser) {
        this.name = nameFromUser;
        this.displacement = displacementFromUser;
        this.limit = limitFromUser;
    }

    public void move(Location location, int totalWeight) {
        try {
            class SteeringWheel {
                public void right() {
                    System.out.println("Steering wheel to the right!");
                }
                public void left() {
                    System.out.println("Steering Wheel to the left!");
                }
            }

            System.out.println("Ship " + this.name + " is launched");
            if (totalWeight > displacement) {
                throw new ShipOverflowException("The ship sank because it was overcrowded.");
            }
            System.out.println("Course correction...");
            SteeringWheel steeringWheel = new SteeringWheel();
            steeringWheel.left();
            steeringWheel.left();
            steeringWheel.right();
            System.out.println("Ship is swam from " + this.startPosition +  "! Goal: " + location + ".");
            this.location = location;
            class Anemometer {
                public void measureWindSpeed() {
                    double windSpeed = Math.random() * 20;
                    int seaCondition = 4;
                    double speedOfShip = windSpeed / seaCondition;
                    if (speedOfShip > 4) throw new UnlimitedSpeedError("This speed is so big value. The trip will be " +
                            "like a tornado!");
                    else System.out.println("Speed of the ship is normal.");
                    double speed = windSpeed / seaCondition;
                    System.out.println("The ship sailed at a speed of " + speed + " knots per hour");
                }
            }
            Anemometer anemometer = new Anemometer();
            anemometer.measureWindSpeed();
        } catch (ShipOverflowException shipOverflowException) {
            shipOverflowException.printStackTrace(); //посмотреть путь
            shipOverflowException.getMessage();
        } catch (UnlimitedSpeedError unlimitedSpeedError) {
            System.out.println("Check your seat belts! This speed is so big value. The trip will be " +
                    "like a tornado!");
        }
    }

    public void addPassengers(int amount) {
        System.out.println("Landing...");
        System.out.println("Landing...");
        while (amount < limit - amountOfPassengers) {
            amountOfPassengers += 1;
        }
        System.out.println("Passengers are on the board.");
    }

    public void showAmountOfPassengers() {
        System.out.println(amountOfPassengers);
    }
    public static class Model {
        public static String getType() {
            return type;
        }
    }

}

