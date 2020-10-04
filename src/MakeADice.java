/**
 * Berechne in einer while-Schleife solange eine ganzzahlige Zufallszahl
 * zwischen 1 und 6, bis eine 6 gewürfelt wurde.
 * Gebe auf der Konsole aus, wieviele Versuche hierzu benötigt wurden.
 */

public class MakeADice {

    public static void main(String[] args) {
        int max = 6;
        int min = 1;
        int countTries = 1;
        int numberToGet = 6;
        int range = max - min + 1;
        int number;
        //Math.random returns a double between 0.0 and <1.0
        number = (int) (Math.random() * range) + min;
        while (number != numberToGet) {
            countTries++;
            number = (int) (Math.random() * range) + min;
        }

        System.out.println("Es wurden " + countTries + " Versuche benötigt, um eine " + numberToGet + " zu würfeln.");
    }
}
