package Labs._06.ex3;

public class Pencil {
    String _brand;
    String _colour;

    public Pencil(String brand, String colour) {
        _brand = brand;
        _colour = colour;
    }

    public String brand() {
        return _brand;
    }

    public String colour() {
        return _colour;
    }

    public boolean equals(Pencil pencil) {
        return _brand == pencil.brand() && _colour == pencil.colour();
    }
}
