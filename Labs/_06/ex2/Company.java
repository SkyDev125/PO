package Labs._06.ex2;

import java.util.*;

public class Company {
    HashMap<String, Worker> _workers = new HashMap<String, Worker>();

    public boolean addWorker(Worker worker) {
        if (_workers.containsKey(worker._name)) {
            return false;
        }
        _workers.put(worker._name, worker);
        return true;
    }

    public void wages() {
        for (Worker worker : _workers.values()) {
            System.out.println(worker.toString());
        }
    }

    public ArrayList<Worker> findAbovePay(int wage) {
        ArrayList<Worker> workers = new ArrayList<Worker>();
        for (Worker worker : _workers.values()) {
            if (worker._wage > wage) {
                workers.add(worker);
            }
        }
        return workers;
    }

    public void removeWorkers(String str) {
        for (Worker worker : _workers.values()) {
            if (worker._name.startsWith(str)) {
                _workers.remove(worker._name);
            }
        }
    }

    public List<Worker> workersSortedBySalaryAndName() {
        List<Worker> sortedWorkers = new ArrayList<>(_workers.values());
        Collections.sort(sortedWorkers, Comparator.comparingInt(Worker::wage).thenComparing(Worker::name));
        return sortedWorkers;
    }

}
