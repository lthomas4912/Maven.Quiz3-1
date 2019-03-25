package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
            String newWord = words[i];
            if (VowelUtils.startsWithVowel(newWord)) {
                newWord += "way";
            } else {
                Integer vowelIndex = VowelUtils.getIndexOfFirstVowel(newWord);

                if (vowelIndex == null) {
                    newWord += "ay";
                } else {
                    String beginning = newWord.substring(0, vowelIndex);
                    String ending = newWord.substring(vowelIndex);
                    newWord = ending + beginning + "ay";
                }
                words[i] = newWord;
            }
        }
            return String.join(" ", words);
    }
}
