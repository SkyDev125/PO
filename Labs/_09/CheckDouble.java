package Labs._09;

import java.util.*;

public class CheckDouble {
    public ArrayList<Boolean> checkDoubleList(ArrayList<String> floats) throws InvalidArgumentException {
        if (floats == null) {
            throw new InvalidArgumentException("The list is null");
        } else if (floats.isEmpty()) {
            throw new InvalidArgumentException("The list is empty.");
        }

        ArrayList<Boolean> parsed = new ArrayList<Boolean>();
        for (String string : floats) {
            try {
                Double.parseDouble(string);
                parsed.add(true);
            } catch (NumberFormatException e) {
                parsed.add(false);
            }
        }
        return parsed;
    }
}
