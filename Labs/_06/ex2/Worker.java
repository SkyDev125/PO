package Labs._06.ex2;

public class Worker {
    String _name;
    int _wage;

    public Worker(String name, int wage) {
        _name = name;
        _wage = wage;
    }

    public boolean equals(Worker worker) {
        return _name.equals(worker._name);
    }

    public String name() {
        return _name;
    }

    public int wage() {
        return _wage;
    }

    @Override
    public String toString() {
        return "name: " + _name + " wage: " + Integer.toString(_wage);
    }
}
