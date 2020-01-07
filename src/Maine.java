import java.util.Scanner;

public class Maine {
    public static void main(String[] args) {
        System.out.println("Wybierz co chcesz zrobić z żarówką");
        System.out.println("\"off\" - wyłącz\n\"on\" - włącz");
        Scanner scanner = new Scanner(System.in);
        String onOffState = scanner.nextLine();
        Bulb bulb = new Bulb();
        bulb.setBulbState(onOffState);
        System.out.println("Jasność żarówki wynosi = " + bulb.getBrighteness());

        if (bulb.getBulbState() == true) {
            do {
                System.out.println("Zmień poziom jasności żarówki.");
                System.out.println("\"b\" - rozjaśnij \n\"d\" - przyciemnij");
                String onOffState2 = scanner.nextLine();
                bulb.setBrightness(onOffState2);
            } while (bulb.getBulbState() == true);
        }
    }
}
