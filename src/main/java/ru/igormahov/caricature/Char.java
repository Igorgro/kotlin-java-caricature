package ru.igormahov.caricature;

import ru.igormahov.caricature.Initable;

public class Char implements Initable, CharConvertable {
    protected char _char;

    Char(char ch) {
        this._char = ch;
    }

    @Override
    public void init() {}

    @Override
    public char getAsChar() {
        return _char;
    }

    @Override
    public String toString() {
        return (new String()) + this.getAsChar();
    }
}
