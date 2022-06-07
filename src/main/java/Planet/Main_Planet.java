package Planet;

public class Main_Planet {
    private static Planet pl;
    public static void main(String[] args, Planet planet) {
        Planet p = Planet.valueOf("MERCURY");

        System.out.println(p.name);

        for (Planet pl : Planet.values()) {
            System.out.println(pl.name + pl.radius);
        }
    }
}

