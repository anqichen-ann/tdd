import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mommifier {

    public String insertMommy(String str) {
        int length = str.length();
        String result = "";
        String vowel = "[aeiou]";
        List<String> list = Arrays.asList(str.split(""));
        List<String> newList = new ArrayList<>(list);
        long vowelLength = newList.stream().filter(s -> s.matches(vowel)).count();
        if (vowelLength > length*0.3) {
            for (int i =0; i < newList.size()-1; i++) {
                if (newList.get(i).matches(vowel) && newList.get(i+1).matches(vowel)) {
                    newList.add(i+1,"mommy");
                }
            }
        }
        for (String str1 : newList) {
            result += str1;
        }
        return result;
    }

}
