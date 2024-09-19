package Labs._03;

public class Pen {
    private final float _max_capacity;
    private float _capacity;
    private String _colour;
    private Brand _brand;

    public Pen(float max_capacity, String colour, Brand brand) {
        _max_capacity = max_capacity;
        _colour = colour;
        _brand = brand;
        _capacity = max_capacity;
        System.out.println();
    }

    public void write(String str) {
        int length = str.length();
        if (length > _capacity) {
            return;
        }

        System.out.println(str);
        _capacity -= length;
    }

    public float refill(float amount) {
        float leftover = 0;
        _capacity += amount;
        if (_capacity > _max_capacity) {
            leftover = _capacity - _max_capacity;
            _capacity = _max_capacity;
        }

        return leftover;
    }

    public float refill_colour(float amount, String colour) {
        if (!_colour.equals(colour))
            return -1;

        return refill(amount);
    }

    public String colour() {
        return _colour;
    }

    public float capacity() {
        return _capacity;
    }

    public float max_capacity() {
        return _max_capacity;
    }

    public Brand brand(){
        return _brand;
    }

    public boolean equals(Pen pen) {
        return Float.compare(_capacity, pen.capacity()) == 0 &&
                Float.compare(_max_capacity, pen.max_capacity()) == 0 &&
                _colour.equals(pen.colour()) &&
                _brand.equals(pen.brand());
    }
}

