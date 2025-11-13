public class TransportDemo {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Truck truck = new Truck();

        bus.move();
        bus.carryPassengers(40);

        System.out.println();

        truck.move();
        truck.carryGoods("Construction materials");
    }
}

class Transport {
    void move() {
        System.out.println("Transport is moving.");
    }
}

class Bus extends Transport {
    void carryPassengers(int count) {
        System.out.println("Bus carries " + count + " passengers.");
    }
}

class Truck extends Transport {
    void carryGoods(String goods) {
        System.out.println("Truck carries: " + goods);
    }
}