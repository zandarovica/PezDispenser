package lv.acodemy.homework;

public class PezDispenser {

    private String name;
    private String colour;
    private String modelName;
    private final int MAX_CANDY = 12;
    private int currentCandy;

    public PezDispenser(String name, String colour, String modelName) {
        this.name = name;
        this.colour = colour;
        this.modelName = modelName;
        this.currentCandy = MAX_CANDY;
    }

    public PezDispenser() {
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getModelName() {
        return modelName;
    }

    public int getCurrentCandy() {
        return currentCandy;
    }

    @Override
    public String toString() {
        return "PezDispenser{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }

    //Eat
    public void eat() {
        if (getCurrentCandy() <= 0) {
            System.out.println("Not enough candy to eat it! Please fell me!");
        } else {
            System.out.println("Eat");
            currentCandy--;
        }
    }


    public void eat(int candyCount) {
        if (candyCount > MAX_CANDY) {
            System.out.println("Dispenser is empty");
        } else {
            if (currentCandy - candyCount < 0) {
                System.out.println("Can't eat!");
            } else {
                currentCandy = currentCandy - candyCount;
            }
        }
    }

    //fill
    public void fill() {
        currentCandy = MAX_CANDY;
        System.out.println("Dispenser is full!");
    }


    public void fill(int candyCount) {
        if (candyCount > MAX_CANDY) {
            System.out.println("Dispenser is full, no more place");
        } else {
            if (currentCandy + candyCount > MAX_CANDY) {
                System.out.println("Can't fill");
            } else {
                currentCandy = currentCandy + candyCount;
            }
        }
    }


}

