package ru.igormahov.caricature

class SentencePrinter: AbstractPrinter<Sentence> {
    private val wPrinter: WordPrinter

    constructor() {
        val wpFactory = WordPrinterFactory()
        wPrinter = wpFactory.create()
    }

    override fun init() {
        wPrinter.init()
    }

    override fun print(s: Sentence) {
        for (i in 0 until s.wordsCount) {
            wPrinter.print(s.getWordAt(i))
            if (i < s.wordsCount-1) print(' ')
        }
    }
}