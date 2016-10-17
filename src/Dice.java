package ITC515_Assignment4

public class Dice {

    private DiceValue value;

    // constructor to get a random value for the dice
    public Dice() {
        value = DiceValue.getRandom();
    }

    public DiceValue getValue() {
        return value;
    }

    // TODO: BUG
    // fix the bug of dice value does not change
    public DiceValue roll() {
        this.value = DiceValue.getRandom();
        return this.value;
    }

    public String toString() {
        return value.toString();
    }
}
