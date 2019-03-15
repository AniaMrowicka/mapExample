package dictionaryPlEn;

public class Post {
    private String polishWord;
    private String englishWord;

    public Post() {
    }

    public Post(String polishWord, String englishWord) {
        this.polishWord = polishWord;
        this.englishWord = englishWord;
    }

    public String getPolishWord() {
        return polishWord;
    }

    public void setPolishWord(String polishWord) {
        this.polishWord = polishWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

}
