import java.math.BigInteger;
import java.util.Objects;

    public class Equation {

        public static BigInteger differentiate(String equation, long x) {
            String[] eqs = equation.split("(?=-)|\\+");
            BigInteger ex = BigInteger.valueOf(x);
            BigInteger ans;
            ans = BigInteger.ZERO;
            long ant = 0;
            for (int i=0; i<eqs.length; i++) {
              
                BigInteger f1;
                f1 = BigInteger.ZERO;
                long f2 = 0;
              
                if (eqs[i].contains("x")){
                  
                    if (eqs[i].split("x").length == 2){
                      
                        if (eqs[i].charAt(0) == 'x') {
                            f1 = BigInteger.ONE;
                        } else if (eqs[i].charAt(0) == '-' && eqs[i].charAt(1) == 'x'){
                            f1 = BigInteger.valueOf(-1);
                        } else {
                            f1 = BigInteger.valueOf(Long.parseLong(eqs[i].split("x")[0]));
                        }
                      
                    } else if (eqs[i].split("x").length == 1){
                      
                        if (eqs[i].contains("^")){
                            f1 = BigInteger.ONE;
                        } else {
                            f1 = BigInteger.valueOf(Long.parseLong(eqs[i].split("x")[0].equals("-") ? "-1" : eqs[i].split("x")[0]));
                        }
                      
                    }
                  
                    if (eqs[i].contains("^")){
                        f2 = Long.parseLong(eqs[i].split("\\^")[1]);
                    } else {
                        f2 = 1;
                    }
                  
                }
              
                ans = ans.add(f1.multiply(BigInteger.valueOf(f2).multiply(ex.pow((int) (f2-1<0?0:f2-1)))));
            }
          
            return ans;
        }
        
    }
