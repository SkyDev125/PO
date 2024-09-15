package Labs._02;

import java.util.ArrayList;

/*
 * Um carro tem sempre uma marca, quilometragem, velocidade máxima e quatro pneus. Quando o carro é criado a sua quilometragem é igual 0 e é necessário indicar a marca, a velocidade máxima e os pneus do novo carro. O carro deve ficar sempre com a marca indicada. É possível saber a quilometragem do carro, a sua marca e se algum dos seus pneus está vazio. A marca é representada simplesmente por uma cadeia de caracteres. É possível também alterar o valor da quilometragem do carro. Um carro pode estar em movimento ou parado. Se estiver em movimento, então terá uma dada velocidade. Um carro pode ainda estar travado, Se o carro estiver travado, então não se movimentará. Um carro quando é criado está sempre travado. É possível travar ou destravar um carro. É ainda possível alterar a velocidade do carro desde que o carro não esteja travado. Não é possível ultrapassar a velocidade máxima do carro.
 */

public class Car {
    private String _brand;
    private float _kilometrage = 0;
    private float _max_speed;
    private float _speed;
    private Tire[] _tires;
    private boolean _is_breaking = true;

    public Car(String brand, float max_speed, ArrayList<Tire> tires) {
        _brand = brand;
        _max_speed = max_speed;
        _tires = new Tire[4];
    }

    public float kilometrage() {
        return _kilometrage;
    }

    public String brand() {
        return _brand;
    }

    public ArrayList<Tire> empty_tires() {
        ArrayList<Tire> empty_tires = new ArrayList<>();
        for (Tire tire : _tires) {
            if (tire.is_empty())
                empty_tires.add(tire);
        }
        return empty_tires;
    }

    public void set_kilometrage(float kilometrage) {
        _kilometrage = kilometrage;
    }

    public void set_speed(float speed) {
        if (_is_breaking || speed > _max_speed)
            return;

        _speed = speed;
    }

    public float speed() {
        return _speed;
    }

    public void set_breaking(boolean breaking) {
        if (breaking) {
            _speed = 0;
        }
        _is_breaking = breaking;
    }
}