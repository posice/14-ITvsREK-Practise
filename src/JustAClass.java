/**
 * Created by aos on 26.04.2017.
 * Updated by aos on 17.02.2021.
 */
public class JustAClass {

    //TODO: Arbeite die Methoden von oben nach unten ab. Teste immer über die Klasse MainProgramm, ob die Methode das gewünschte liefert.
    /**
     * Bestimmt eine zufällige ganze Zahl zwischen 1 und 6 (Grenzen einschließlich).
     * @return
     */
    private int getRandom(){
        int rand = (int)(Math.random()*6) + 1;
        System.out.println("Random: " + rand);
        return rand;
    }


    /**
     * Summiert bis zur Zahl n einschließlich alle ganzen Zahlen auf und
     * gibt die Summe zurück.
     * @param n
     * @return
     */
    public int sumUpIt(int n){
        int result = 0;
        for (int i = 0; i < n; i++){
            result += i;
        }
        return result;
    }

    /**
     * Summiert bis zur Zahl n einschließlich alle ganzen Zahlen auf und
     * gibt die Summe zurück.
     * @param n
     * @return
     */
    public int sumUpRek(int n){
        int result = n;
        if (n > 0){
            result += sumUpRek(n-1);
        }
        return result;
    }

    /**
     * Bestimmt n zufällige Ergebnisse zwischen 1 und 6 (Grenzen einschließlich),
     * summiert diese auf und gibt die Summe zurück.
     * @param n
     * @return
     */
    public int sumUpRandomIt(int n){
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += getRandom();
        }
        return sum;
    }

    /**
     * Bestimmt n zufällige Ergebnisse zwischen 1 und 6 (Grenzen einschließlich),
     * summiert diese auf und gibt die Summe zurück.
     * @param n
     * @return
     */
    public int sumUpRandomRek(int n){
        int sum = 0;
        if (n > 0){
            sumUpRandomRek(n-1);
        }
        sum += getRandom();
        return sum;
    }

    /**
     * Bestimmt n zufällige positive, ganze Zahlen zwischen 1 und 6.
     * Gibt die größte dieser zufälligen Zahlen zurück.
     * @param n
     * @return die größte zufällig Zahl, die im Verlauf der Methode erstellt wurde.
     */
    public int biggestOfRandomIt(int n){
        int biggest = 0;
        for (int i = 0; i < n; i++){
            int number = getRandom();
            if (number > biggest){
                biggest = number;
            }
        }
        return biggest;
    }

    /**
     * Bestimmt n zufällige positive, ganze Zahlen zwischen 1 und 6.
     * Gibt die größte dieser zufälligen Zahlen zurück.
     * @param n
     * @return die größte zufällig Zahl, die im Verlauf der Methode erstellt wurde.
     */
    public int biggestOfRandomRek(int n){
        int last = 0;
        if (n > 0){
            last = biggestOfRandomRek(n-1);
        }
        int number = getRandom();
        if (number < last){
            number = last;
        }
        return number;
    }

    /**
     * Ein Klassiker und den rekursiv zu implementeirenden Methoden ist die Fibonacci-Zahlenfolge: 1, 1, 2, 3, 5, 8, 13, 21, ...
     * Hierbei gilt:
     *    für n = 1 wird 1 zurückgegeben
     *    für n = 2 wird 1 zurückgegeben
     *    für n > 2 wird fib(n-1) + fib(n-2) zurückgegeben.
     * @param n
     * @return die n-te Fibonacci-Zahl
     */
    public int fib(int n){
        for (int i = 0; i < n; i++){
            if (n == 1){
                return 1;
            } else if (n == 2){
                return 2;
            } else {
                return fib(n - 1) + fib(n-2);
            }
        }
    }
}
