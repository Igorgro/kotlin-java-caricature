package ru.igormahov.caricature

class LetterPrinter: AbstractPrinter<Letter> {
    override fun init() {

    }

    override fun print(l: Letter) {
        print(l.toString());
    }
}