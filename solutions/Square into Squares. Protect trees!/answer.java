public class Decompose {

  public String decompose(long n) {
    long ns = (long)Math.pow(n, 2);
    return ev(ns, n);
  }

  public String ev(long ns, long n) {
    if (n<5) {                            //Because numbers lower than 5 would return null
      return null;
    }
    return dc(ns, n) == null ? ev(ns, n-1) :  dc(ns, n);
  }

  public String dc(long ns, long n) {
    for (long x=n-1; x>0; x--) {
      
      if (ns > Math.pow(x, 2)) {
          ns -= Math.pow(x, 2);
          if (dc(ns, x) != null) {
            return dc(ns, x) + " " + x;
          }                
      } else if(ns == Math.pow(x, 2)) {
        return x+"";
      }
      
    }
    return null;
  }

}
