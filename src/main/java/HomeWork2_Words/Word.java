package HomeWork2_Words;

public class Word implements Comparable<Word> {
    public String word;


    public Word(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(Word w){
        return this.word.length() - w.word.length();
    }

    @Override
    public String toString() {
        return "Word " + word;
    }
}
