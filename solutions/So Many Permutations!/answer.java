import java.util.*;

class Permutations {

        public static List<String> singlePermutations(String s) {
            Set<String> ans = new HashSet<>();
            for (int i=0; i<100000; i++) {
                List<String> characters = Arrays.asList(s.split(""));
                Collections.shuffle(characters);
                String afterShuffle = "";
                for (String character : characters) {
                    afterShuffle += character;
                }
                ans.add(afterShuffle);
            }
            return new ArrayList<>(ans);
        }
    }
