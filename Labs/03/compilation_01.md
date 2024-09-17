# Compilation 01

```java

public class Sum {
  public static Sum _s = null; // Should be private
  
  private int _total;

  public Sum(int t) {
    total = t;  // Compilation Error total doesnt exist, should be _total.
  }

 public void computeVectorSum(int[] v) {
    int i;
    _total = 0;

    while (i < v.length) { // Comparison with undefined i.
      _total += v[i++]; // Incrementing undefined i. vector possibly out of range.
    }
       
    return _total;
  }

  private int getTotal() { //should be public. If wanted to be used outside of the class.
    return _total;
  }
}

public class Main {

  public static void main(String[] args) {
    int i;
    int[] v = new int[args.length];
 
    Sum sum = new Sum(); //missing argument for constructor.
    
    for (i = 0; i < args.length; i++) {
      v[i] = Integer.parseInt(args[i]);
    }

    Sum._s = sum;
    Sum.computeVectorSum(v);
    System.out.println(sum.getTotal()); // getTotal is private wont work.
  }
}
```
