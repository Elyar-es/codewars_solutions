import java.util.Arrays;

public class Kata {

  private static final long[][] SUM = {
      { 9, 189, 2889, 38889, 488889, 5888889, 68888889, 788888889, 8888888889L },
      { 3, 15, 81, 353, 1438, 5536, 20677, 75373, 269980, 953750, 3332258, 11537522, 39647136, 135375244, 459716899, 1553752467 }
  };
  private static final long[][] FIRST_NUM = {
      { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000 },
      { 1, 4, 10, 32, 100, 317, 1000, 3163, 10000, 31623, 100000, 316228, 1000000, 3162278, 10000000, 31622777, 100000000 }
  };
  
  private static int fsdigit(long n, int ixSeq) {
    long maxSum = Arrays.stream(SUM[ixSeq]).filter(value -> value <= n).max().orElse(0);
    int nextDigits = Arrays.binarySearch(SUM[ixSeq], maxSum) + 2;
    long delta = n - maxSum;
    long num = FIRST_NUM[ixSeq][nextDigits - 1] + delta / nextDigits;
    if (ixSeq == 1) {
      num *= num;
    }
    return String.valueOf(num).charAt((int) delta % nextDigits) - '0';
  }
  
  public static int findDigit(int n) {
    int d1 = fsdigit(n, 0);
    int d2 = fsdigit(n, 1);
    int t;
    int sumDigits;
    do {
      n++;
      sumDigits = fsdigit(n, 0) + fsdigit(n, 1);
      t = sumDigits / 10;
    } while (sumDigits > 8 && t == 0);
    return (d1 + d2 + t) % 10;
  }
}
