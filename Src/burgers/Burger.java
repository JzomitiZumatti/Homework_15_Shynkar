package burgers;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String lettuce;
    String mayonnaise;
    int meatCount;

    public Burger(String bun, String meat, String cheese, String lettuce, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;

        System.out.printf("Ingredients for common burger: %s, %s, %s, %s, %s.", bun, meat, cheese, lettuce,
                mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String lettuce) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;

        System.out.printf("Ingredients for diet burger: %s, %s, %s, %s.", bun, meat, cheese, lettuce);
    }

    public Burger(String bun, int meatCount, String meat, String cheese, String lettuce, String mayonnaise) {
        this.bun = bun;
        this.meatCount = meatCount;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;

        if (meatCount == 2) {
            System.out.printf("Ingredients for double meat burger: %s, %d pcs of %s, %s, %s, %s.", bun, meatCount,
                    meat, cheese, lettuce, mayonnaise);
        } else {
            System.out.println("For double meat burger, you need to use 2 pcs of meat.");
        }
    }
}
