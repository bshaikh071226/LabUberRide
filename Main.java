
class UberRide {
    String riderName;
    double totalCost;

    //constructor accepting rider names
    UberRide(String name) {
        riderName = name;
        totalCost = 0;
    }

    void addRide(double cost) {
        totalCost = totalCost + cost;
        System.out.println(riderName + " added a ride of $" + cost);
    }

    void printTotal() {
        System.out.println(riderName + "'s total cost: $" + totalCost);
    }
}

public class Main {
    public static void main(String[] args) {
        UberRide ride = new UberRide( "Alex");
        ride.addRide(15);
        ride.addRide(20);
        ride.printTotal();

    }
}