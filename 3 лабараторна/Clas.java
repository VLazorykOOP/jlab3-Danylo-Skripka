// Суперклас Ship (корабель)
class Ship {
    private String name;
    private int length;
    private int maxSpeed;

    public Ship(String name, int length, int maxSpeed) {
        this.name = name;
        this.length = length;
        this.maxSpeed = maxSpeed;
    }

    public void show() {
        System.out.println("Ship: " + name + ", Length: " + length + " meters, Max Speed: " + maxSpeed + " knots");
    }
}

// Підклас Steamship (пароплав)
class Steamship extends Ship {
    private int steamPower;

    public Steamship(String name, int length, int maxSpeed, int steamPower) {
        super(name, length, maxSpeed);
        this.steamPower = steamPower;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Steam Power: " + steamPower + " horsepower");
    }
}

// Підклас SailingShip (вітрильник)
class SailingShip extends Ship {
    private int mastCount;

    public SailingShip(String name, int length, int maxSpeed, int mastCount) {
        super(name, length, maxSpeed);
        this.mastCount = mastCount;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Mast Count: " + mastCount);
    }
}

// Підклас Corvette (корвет)
class Corvette extends Ship {
    private int missileCount;

    public Corvette(String name, int length, int maxSpeed, int missileCount) {
        super(name, length, maxSpeed);
        this.missileCount = missileCount;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Missile Count: " + missileCount);
    }
}

// Головний клас для демонстрації
public class Main {
    public static void main(String[] args) {
        Ship[] fleet = new Ship[4];

        fleet[0] = new Ship("Generic Ship", 100, 20);
        fleet[1] = new Steamship("Steamship One", 150, 15, 5000);
        fleet[2] = new SailingShip("Sailing Ship Two", 120, 18, 3);
        fleet[3] = new Corvette("Corvette Three", 80, 30, 10);

        for (Ship ship : fleet) {
            ship.show();
            System.out.println("----------------------------");
        }
    }
}
