/**
 * Created by aos on 26.04.2017.
 * Redefindes by aos on 17.02.2021.
 */
public class MainProgram {

    public static void main(String[] args){
        JustAClass jc = new JustAClass();

        System.out.println("Summe der ersten 10 ganzen Zahlen-Iterativ: "+ jc.sumUpIt(11000));
        System.out.println("Summe der ersten 10 ganzen Zahlen-Rekursiv: "+ jc.sumUpRek(8999));
    }
}
