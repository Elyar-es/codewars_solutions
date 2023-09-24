  public class Spiralizor {

        public static int[][] spiralize(int size) {
            
            int d = size%2 == 0 ? size%4 == 0 ? -1 : 0 : 1;
            int[][] array = new int[size][size];
            for (int i=0; i<size/2+d;i++) {
                if (Math.pow(-1,i) > 0) {
                    most_one(array, i);
                } else if (Math.pow(-1,i) < 0) {
                    most_zero(array, i);
                }
            }

            return array;
        }

        public static int[][] most_one (int[][] array, int t) {
            
            int len = array.length;
            for (int i=t; i<len-t; i++) {
                array[t][i] = 1;
            }
            for (int i=t; i<len-t; i++) {
                array[len-t-1][i] = 1;
            }
            for (int i=t; i<len-t; i++) {
                array[i][t] = 1;
            }
            for (int i=t; i<len-t; i++) {
                array[i][len-t-1] = 1;
            }

            array[t+1][t] = 0;
            return array;
        }

        public static int[][] most_zero (int[][] array, int t) {

            array[t+1][t] = 1;
            return array;
        }
        
    }
