package Labs._07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Supermarket {
    private ArrayList<Compra> _compras;
    private int _comprasLimit;

    public Supermarket(int limit) {
        _comprasLimit = limit;
        _compras = new ArrayList<Compra>();
    }

    public boolean addCompra(Compra compra) {
        if (_compras.size() == _comprasLimit) {
            return false;
        }

        _compras.add(compra);
        return true;
    }

    public List<Compra> findComprasAbove(int value) {
        ArrayList<Compra> compras = new ArrayList<Compra>();

        for (Compra compra : _compras) {
            if (compra.value() > value) {
                compras.add(compra);
            }
        }

        return Collections.unmodifiableList(compras);
    }

    public void removeClient(String name){
        Iterator<Compra> compraIter = _compras.iterator();
        
        while(compraIter.hasNext()){
            Compra compra = compraIter.next();
            if(compra.name() == name){
                compraIter.remove();
            }
        }
    }

}
