package ru.igormahov.caricature

class WordPrinter: AbstractPrinter<Word> {
    private val lPrinter: LetterPrinter

    constructor() {
        val lpFactory: LetterPrinterFactory = LetterPrinterFactory()
        lPrinter = lpFactory.create()
    }

    override fun init() {
        lPrinter.init()
    }

    override fun print(w: Word) {
        for(i in 0 until w.letterCount) {
            lPrinter.print(w.getLetterAt(i))
        }
    }
}