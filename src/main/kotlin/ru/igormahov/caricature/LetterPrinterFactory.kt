package ru.igormahov.caricature

class LetterPrinterFactory: AbstractPrinterFactory<Letter> {
    override fun init() {

    }
    override fun create(): LetterPrinter {
        val lPrinter = LetterPrinter()
        lPrinter.init()
        return lPrinter
    }
}