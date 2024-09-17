# Compilation 02

```java

public class Main {

  public static void main(String[] args) {
    int i;
    int[] v = new int[args.length];
 
    Sum sum = new Sum();
    
    for (i = 0; i < args.length; i++) {
      v[i] = Integer.parseInt(args[i]);
    }

    Sum._s = sum;
    Sum.computeVectorSum(v);
    System.out.println(sum.getTotal());
  }
}
```
