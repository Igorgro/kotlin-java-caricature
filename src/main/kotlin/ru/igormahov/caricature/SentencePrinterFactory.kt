package ru.igormahov.caricature

class SentencePrinterFactory: AbstractPrinterFactory<Sentence> {
    override fun init() {

    }
    override fun create(): SentencePrinter {
        val sPrinter = SentencePrinter()
        sPrinter.init()
        return sPrinter
    }
}