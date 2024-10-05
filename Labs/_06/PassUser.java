package Labs._06;

public class PassUser extends User {
    private int _totalTrips;

    public PassUser(String name) {
        super(name);
    }

    @Override
    public void validate() {
        setPass(true);
        System.out.println("Válido até ao final do mês corrente.");
    }

    @Override
    public boolean newTrip(int station) {
        boolean success = super.newTrip(station);
        if (success) {
            _totalTrips++;
        }
        return success;
    }

    public int totalTrips() {
        return _totalTrips;
    }
}
