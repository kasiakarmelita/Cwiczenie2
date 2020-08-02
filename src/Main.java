import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setLiczba1(scanner.nextInt());
        kalkulator.setLiczba2(scanner.nextInt());

        String znak = scanner.next();
        for (Dzialania value : Dzialania.values()) {
            if (value.getZnak().equals(znak)) {
                kalkulator.setTyp(value);
            }


        }

        System.out.println(kalkulator.obliczenia());


    }
}
