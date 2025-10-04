package theory.tasksClassFive;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    public static boolean fight(Cat otherCat, Cat othreatCat) {
        int countWinOne = 0;
        int countWinTwo = 0;

        if (otherCat.weight > othreatCat.weight) { countWinOne++;}
        else if (otherCat.weight < othreatCat.weight) { countWinTwo++; }
        else if (otherCat.strength > othreatCat.strength) { countWinOne++; }
        else if (otherCat.strength < othreatCat.strength) { countWinTwo++; }

        if (countWinOne < countWinTwo) { return false; }
        else if (countWinOne == countWinTwo) { System.out.println("Силы были равны"); }
        return true;
    }
}
