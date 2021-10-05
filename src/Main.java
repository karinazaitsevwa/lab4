public class Main {

    public static void main(String[] args) {

	    Ship ship = new Ship("Plavuchiy medved", 60000, "water",
                20);
        Piglet fatPiglet = new Piglet("male","Pig",15,70,2);
        Piglet piglet = new Piglet("male","Vasya",6,45,2);
        Winnie pooh = new Winnie("male","Pooh", 22, 190);

        MonitoringSystem generalModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Monitoring of general indicators has started!");
            }
        };

        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Bug Tracking Monitoring has started!");
            }
        };

        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Security monitoring has started!");
            }
        };

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
        System.out.println("Ship is ready to voyage!");
        ship.addPassengers(3);
        ship.move(Location.SPAIN, fatPiglet.weight + piglet.weight + pooh.weight);
        pooh.toDangleLegs(ship);

    }
}
