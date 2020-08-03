import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mommifier {

    public String convert(String str) {
        int length = str.length();
        String result = "";
        String vowel = "[aeiou]";
        String insertString = "mommy";
        List<String> splitList = Arrays.asList(str.split(""));
        List<String> newSplitList = new ArrayList<>(splitList);
        long vowelLength = newSplitList.stream().filter(s -> s.matches(vowel)).count();
        if (vowelLength > length*0.3) {
            for (int i =0; i < newSplitList.size()-1; i++) {
                if (newSplitList.get(i).matches(vowel) && newSplitList.get(i+1).matches(vowel)) {
                    newSplitList.add(i+1,insertString);
                }
            }
        }
        for (String str1 : newSplitList) {
            result += str1;
        }
        return result;
    }

}
