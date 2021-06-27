package ru.igormahov.caricature;

import ru.igormahov.caricature.Initable;

public class Word implements Initable {
    private Letter[] letters;

    Word(Letter[] letters) {
        this.letters = new Letter[letters.length];
        for (int i = 0; i < letters.length; i++) {
            this.letters[i] = letters[i];
        }
    }

    @Override
    public void init() {
        for (Letter letter : letters) {
            letter.init();
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Letter letter : this.letters) {
            s.append(letter.getAsChar());
        }
        return s.toString();
    }

    int getLetterCount() {
        return this.letters.length;
    }

    Letter getLetterAt(int i) {
        return this.letters[i];
    }
}
