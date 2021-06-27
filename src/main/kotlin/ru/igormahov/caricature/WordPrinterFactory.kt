package ru.igormahov.caricature

class WordPrinterFactory: AbstractPrinterFactory<Word> {
    override fun init() {

    }
    override fun create(): WordPrinter {
        val wPrinter = WordPrinter()
        wPrinter.init()
        return wPrinter
    }
}