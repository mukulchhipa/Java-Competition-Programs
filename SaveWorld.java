import java.util.*;
/*
public class SaveWorld {
    static char characterCount(String inp) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = inp.toCharArray();
        List<Character> out = new ArrayList<>();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        int maxValue= Collections.max(charCountMap.values());
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if(entry.getValue()==maxValue){
                out.add(entry.getKey());
            }
        }
        Collections.sort(out);
        return out.get(0);
        }

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int input1 = sc.nextInt();
            List<String> input2 = new ArrayList<>();
            for (int i = 0; i < input1; i++) {
                input2.add(sc.next());
            }

            for (int i = 0; i < input1; i++) {
                System.out.println(characterCount(input2.get(i)));
            }
            sc.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
