import com.sun.deploy.security.SelectableSecurityManager;

public class Bulb {
    private static boolean bulbState = false;
    private static final int MAX_BRIGHTNESS = 6;
    private static final int MIN_BRIGHTNESS = 0;
    private static int brighteness = 6;

    public Bulb() {
    }

    public int getBrighteness() {
        return brighteness;
    }

    public boolean getBulbState() {
        return bulbState;
    }

    public void setBrightness(String bulbsComand) {
        switch (bulbsComand) {
            case "b":
            case "B":
                brightnenessUp();
                System.out.println("Janość żarówki zwiększona " + brighteness);
                break;
            case "d":
            case "D":
                brightnenessDown();
                System.out.println("Jasność żarówki zmniejszona " + brighteness);
                break;
            case "off":
            case "OFF":
                setBulbState(bulbsComand);
                break;
            default:
                System.out.println("Brak takiego polecnia");
                break;
        }
    }

    static void brightnenessUp() {
        if (brighteness >= MAX_BRIGHTNESS) {
            System.out.println("Osiągnięto maksymalną jasność " + brighteness);
        } else {
            brighteness++;
        }
    }

    static void brightnenessDown() {
        if (brighteness <= MIN_BRIGHTNESS) {
            System.out.println("Osiągnięto minimalną jasność " + brighteness);
        } else {
            brighteness--;
        }
    }

    public void setBulbState(String bulbsComand) {
        switch (bulbsComand) {
            case "OFF":
            case "off":
                turnOffBulb();
                System.out.println("Żarówka została wyłączona.");
                break;
            case "ON":
            case "on":
                turnOnBulb();
                System.out.println("Żarówka została włączona.");
                break;
            default:
                System.out.println("Brak takiego polecnia");
                break;
        }

    }

    static void turnOffBulb() {
        bulbState = false;
    }

    static void turnOnBulb() {
        bulbState = true;
    }
}

