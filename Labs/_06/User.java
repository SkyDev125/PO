package Labs._06;

public class User {
    private final String _name;
    private Metro _metro;
    private boolean _tempPass;

    public User(String name) {
        _name = name;
    }

    public void askInfo() {
        System.out.println("Como vou para o IST?");
    }

    public void validate() {
        setPass(true);
        System.out.println("Titulo de transporte validado!");
    }

    public boolean newTrip(int station) {
        if (!_tempPass || _metro == null) {
            return false;
        }

        _metro.newTrip(station);
        return true;
    }

    public String name() {
        return _name;
    }

    public void addMetro(Metro metro) {
        _metro = metro;
    }

    protected void setPass(boolean validation) {
        _tempPass = validation;
    }
}
