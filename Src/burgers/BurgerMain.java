package burgers;

public class BurgerMain {
    public static void main(String[] args) {

        Burger commonBurger = new Burger("bun", "meat", "cheese", "lettuce",
                "mayonnaise");
        System.out.println();
        Burger dietBurger = new Burger("bun", "meat", "cheese", "lettuce");
        System.out.println();
        Burger doubleMeatBurger = new Burger("bun", 2, "meat", "cheese",
                "lettuce", "mayonnaise");
    }
}
