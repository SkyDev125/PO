package Labs._02;

public class Tire {
    private float _psi;
    private float _rec_psi;

    // Declaring a value here will be the default for all constructors.
    private boolean _punctured = false;

    // Constructor (without any type for the function), is called last.
    public Tire(float psi, float rec_psi) {
        _psi = psi;
        _rec_psi = rec_psi;
    }

    public float get_psi() {
        return _psi;
    }

    public float get_rec_psi() {
        return _rec_psi;
    }

    public boolean is_empty() {
        return _rec_psi < _psi * 0.8;
    }

    public void set_psi(float psi) {
        if (_punctured)
            return;

        if (psi > this._rec_psi * 1.5) {
            _punctured = true;
            _psi = 0;
        } else {
            _psi = psi;
        }
    }

    public boolean is_punctured() {
        return _punctured;
    }

}