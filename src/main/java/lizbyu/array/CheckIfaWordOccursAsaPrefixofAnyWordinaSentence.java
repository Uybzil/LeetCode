package lizbyu.array;

public class CheckIfaWordOccursAsaPrefixofAnyWordinaSentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }
}
