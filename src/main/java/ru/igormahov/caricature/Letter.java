package ru.igormahov.caricature;

public class Letter extends Char {
    Letter(char ch) {
        super(ch);
    }

    @Override
    public void init() {
        super.init();
        // Check if character is letter
        if (!((65 <=  this._char && this._char <= 90) || (97 <= this._char && this._char <= 122))) this._char = 'a';
    }
}
