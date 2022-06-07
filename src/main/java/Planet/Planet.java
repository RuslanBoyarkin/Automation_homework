package Planet;

public enum Planet {
    MERCURY("Mercury", null, null, 2439, 1, 0, 11),
    VENUS("Venus", MERCURY,null, 6052,2,1,12),
    EARTH("Earth", VENUS, null, 6378, 3, 2, 13),
    MARS("Mars", EARTH, null, 3488, 4, 3, 14),
    JUPITER("Jupiter", MARS, null, 7130, 5, 4, 15),
    URANUS("Uranus", JUPITER, null, 2650, 6, 5, 16),
    NEPTUNE("Neptune", URANUS, null, 2475, 7, 6, 17);

    String name;
    Planet prev;
    Planet next;
    int radius;
    int planetNumber;
    int planetDistance;
    int sunDistance;

    Planet(String name, Planet prev, Planet next, int radius, int planetNumber, int planetDistance, int sunDistance) {
        this.name = name;
        this.prev = prev;
        this.next = null;
        this.radius = radius;
        this.planetNumber = planetNumber;
        this.planetDistance = planetDistance;
        this.sunDistance = sunDistance;

        prev.next = this;

    }
}
