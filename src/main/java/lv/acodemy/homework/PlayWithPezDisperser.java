package lv.acodemy.homework;

public class PlayWithPezDisperser {

    public static void main(String[] args) {

        PezDispenser mermaid = new PezDispenser("Ariel", "red", "TheLittleMermaid");
        System.out.println(mermaid.getName());
        System.out.println(mermaid.getColour());
        System.out.println(mermaid.getModelName());

        System.out.println(mermaid);

        mermaid.eat();
        System.out.println(mermaid.getCurrentCandy());

        mermaid.eat();
        mermaid.eat();
        mermaid.eat();
        System.out.println(mermaid.getCurrentCandy());

        mermaid.fill();
        System.out.println(mermaid.getCurrentCandy());

        mermaid.eat();
        mermaid.eat();
        mermaid.eat();
        mermaid.eat();
        mermaid.eat();
        System.out.println(mermaid.getCurrentCandy());

        mermaid.fill(2);
        System.out.println(mermaid.getCurrentCandy());

        mermaid.eat(9);
    }

}
