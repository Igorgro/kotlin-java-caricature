package ru.igormahov.caricature;

public class WordFactory implements AbstractInitableValueFactory<Word, String> {
    @Override
    public void init() {

    }

    @Override
    public Word create(String s) {
        Letter[] letters = new Letter[s.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = new Letter(s.charAt(i));
            letters[i].init();
        }

        return new Word(letters);
    }
}
