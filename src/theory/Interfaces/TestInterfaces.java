package theory.Interfaces;

import java.util.ArrayList;

public class TestInterfaces {
    public static void main(String[] args) {
        ArrayList<Fly> flyin = new ArrayList<>();
        flyin.add(new Airplane());
        flyin.add(new Duck());

        ArrayList<Move> moves = new ArrayList<>();
        moves.add(new Duck());
        moves.add(new Dog());
        moves.add(new Car());

        ArrayList<Eat> eats = new ArrayList<>();
        eats.add(new Duck());
        eats.add(new Dog());

        for (Fly fl: flyin) {
            if (fl instanceof Fly) {
               Fly fly1 = fl;
               fly1.fly();
            }
        }
        System.out.println();
        for (Move m: moves) {
            if (m instanceof Move) {
                Move mov = m;
                mov.move();
            }
        }
        System.out.println();
        for (Eat ea: eats) {
            if (ea instanceof Eat) {
                Eat eat = ea;
                eat.eat();
            }
        }
    }
}
