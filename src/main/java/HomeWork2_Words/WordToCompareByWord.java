package HomeWork2_Words;

public class WordToCompareByWord implements Comparable<WordToCompareByWord> {
    public String word;


    public WordToCompareByWord(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(WordToCompareByWord w){
        return this.word.hashCode() - w.word.hashCode();

    }



    @Override
    public String toString() {
        return word;
    }
}
