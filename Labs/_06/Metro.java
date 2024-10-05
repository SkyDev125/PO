package Labs._06;

public class Metro{
    private int _totalTrips;
    private int _stations[];

    public Metro(){
        _stations = new int[10];
    }

    public int totalTrips(){
        return _totalTrips;
    } 

    public void newTrip(int station){
        _stations[station]++;
    }
    
    public int stationTrips(int station){
        return _stations[station];
    }
}