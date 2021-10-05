public enum Location implements InterfaceLocation {
    SPAIN,
    RUSSIA,
    FINLAND,
    NEW_ZEALAND,
    USA,
    AUSTRALIA;
    public void printTimetable() {
        System.out.println(java.util.Arrays.asList(Location.values()));
    }

}
