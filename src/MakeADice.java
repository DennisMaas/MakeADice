/**
 * Schreibe ein Programm welches eine ganzzahlige
 * Zufallszahl zwischen 1 und 6 berechnet.
 * Wird eine 3 gewürfelt, so soll der Text
 * "Gewonnen, du hast eine 3 gewürfelt." ausgegeben werden.
 * Bei 4, 5 und 6 wird der Text
 * "Du hast eine [gewürfelte Augen] gewürfelt und darfst es noch einmal versuchen." ausgegeben.
 * Bei allen anderen Zahlen soll der Text
 * "Leider verloren, du hast eine [gewürfelte Augen] gewürfelt." ausgegeben werden.
 */

public class MakeADice {

    public static void main(String[] args) {
        int max = 6;
        int min = 1;
        int rollsExpected = 6000;
        int countSixes = 0;
        int numberToGet = 6;
        int range = max - min + 1;
        //Math.random returns a double between 0.0 and <1.0
        for (int i = 0; i < rollsExpected ; i++) {
            int number = (int) (Math.random() * range) + min;
            if (number == 6) countSixes++;
        }
        System.out.println("In " + rollsExpected + " Würfen wurde " + countSixes + " mal die " + numberToGet + " gewürfelt.");

    }
}
