package Labs._06.ex3;

import java.util.*;

public class Case {
    int _capacity;
    ArrayList<Pencil> _pencils = new ArrayList<Pencil>();

    public Case(int capacity) {
        _capacity = capacity;
    }

    public void addPencil(String brand, String colour) {
        _pencils.add(new Pencil(brand, colour));
    }

    public List<Pencil> findPencils(Pencil pencil) {
        ArrayList<Pencil> pencils = new ArrayList<Pencil>();
        for (Pencil currentPencil : _pencils) {
            if (currentPencil.equals(pencil)) {
                pencils.add(currentPencil);
            }
        }
        return pencils;
    }

    
}
