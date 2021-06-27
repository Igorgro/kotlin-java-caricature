package ru.igormahov.caricature;

import ru.igormahov.caricature.Initable;

public class Sentence implements Initable {
    private Word[] words;

    Sentence(Word[] words) {
        this.words = new Word[words.length];
        for (int i = 0; i < words.length; i++) {
            this.words[i] = words[i];
        }
    }

    @Override
    public void init() {
        for (int i = 0; i < this.words.length; i++) {
            this.words[i].init();
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.words.length; i++) {
            s = s + words[i].toString();
        }
        return s;
    }

    int getWordsCount() {
        return  this.words.length;
    }

    Word getWordAt(int i) {
        return this.words[i];
    }
}
