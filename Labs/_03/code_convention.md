# Convention 02

```Java

public class ComputeSum {
  // public static ComputeSum _Sum = null;
  private static ComputeSum _sum = null;

  //private int total;
    private int _total;

  public ComputeSum(int t) {
    //total = t;
    _total = t;
  }

  // compute sum of the elements in the vector
  public void vectorSum (int[] myVector) {
    int i = 0;
    //total = 0;
    _total = 0;

    while (i<myVector.length) {
      //total += my_vector[i++];
        _total += myVector[i++];
    }       
  }

  //private int get_Total() {
    public int getTotal() {
    //return total;
    return _total;
  }

  //private void SetTotal(int NewTotal) {
    public void setTotal(int newTotal) {
    //total = NewTotal;
    _total = NewTotal;
  }
}

```
