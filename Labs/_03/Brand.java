package Labs._03;

public class Brand {
    private final String _name;
    private int _foundingYear;
    private Pen[] _pens;
    private int _penNum = 0;

    public Brand(String name, int year) {
        _name = name;
        _foundingYear = year;
        _pens = new Pen[1000];
    }

    public Pen createPen(int maxCapacity, String colour) {
        if (_penNum == 1000) {
            return null;
        }
        Pen newPen = new Pen(maxCapacity, colour, this);
        _pens[_penNum] = newPen;
        _penNum++;
        return newPen;
    }

    public String name() {
        return _name;
    }

    public int foundingYear() {
        return _foundingYear;
    }

    public boolean equals(Brand brand) {
        return _name.equals(brand.name()) && _foundingYear == brand.foundingYear();
    }

}
