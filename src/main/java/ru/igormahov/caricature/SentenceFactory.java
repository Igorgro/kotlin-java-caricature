package ru.igormahov.caricature;

public class SentenceFactory implements AbstractInitableValueFactory<Sentence, String> {
    WordFactory wFactory;

    SentenceFactory() {
        wFactory = new WordFactory();
    }

    @Override
    public void init() {
        wFactory.init();
    }

    @Override
    public Sentence create(String s) {
        String[] wordsStrings = s.split(" ");
        WordFactory wFactory = new WordFactory();
        Word[] words = new Word[wordsStrings.length];
        for (int i = 0; i < words.length; i++) {
            words[i] = wFactory.create(wordsStrings[i]);
        }

        return new Sentence(words);
    }
}
