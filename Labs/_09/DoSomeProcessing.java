package Labs._09;

public class DoSomeProcessing {
    public static int process(int arg1, int arg2) throws InvalidArgumentException {
        return -1;
    }

    public static int[] processPair(int[] args1, int[] args2) throws CannotProcessException {
        if (args1 == null) {
            throw new CannotProcessException("args1 is null");
        } else if (args2 == null) {
            throw new CannotProcessException("args2 is null");
        } else if (args1.length != args2.length) {
            throw new CannotProcessException("Arrays have different sizes.");
        }

        int[] processed = new int[args1.length];
        for (int i = 0; i < args1.length; i++) {
            try {
                processed[i] = process(args1[i], args2[i]);
            } catch (InvalidArgumentException e) {
                processed[i] = -1;
            }
        }

        return processed;
    }
}