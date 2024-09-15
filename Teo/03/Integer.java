public class Integer {
    private int _value;
    private static int _counter;

    public Integer(int v) {
        _value = v;
        inc_count();
    }

    public int inc() {
        return _value++;
    }

    public int value() {
        return _value;
    }

    public void inc_count() {
        Integer._counter++;
    }
}