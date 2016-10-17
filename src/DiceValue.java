package ITC515_Assignment4

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum DiceValue {

    CROWN, ANCHOR, HEART, DIAMOND, CLUB, SPADE;

    private static Random RANDOM = new Random();

    private static final Map<DiceValue, String> VALUE_REPR_MAP = new HashMap<DiceValue, String>();

    static {
        VALUE_REPR_MAP.put(DiceValue.CROWN, "Crown");
        VALUE_REPR_MAP.put(DiceValue.ANCHOR, "Anchor");
        VALUE_REPR_MAP.put(DiceValue.HEART, "Heart");
        VALUE_REPR_MAP.put(DiceValue.DIAMOND, "Diamond");
        VALUE_REPR_MAP.put(DiceValue.CLUB, "Club");
        VALUE_REPR_MAP.put(DiceValue.SPADE, "Spade");
    }

    public String toString(DiceValue value) {
        return VALUE_REPR_MAP.get(value);
    }

    public static DiceValue getRandom() {
        // TODO: BUG
        // generate a random number ranging from 0 - 6
        int random = RANDOM.nextInt(DiceValue.SPADE.ordinal() + 1);
        // values() returns an array that contains a list of the enumeration constants.
        // return a value of the dice
        return values()[random];
    }

}
