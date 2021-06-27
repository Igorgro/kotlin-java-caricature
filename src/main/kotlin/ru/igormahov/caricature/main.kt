package ru.igormahov.caricature

fun main() {
    val sFactory = SentenceFactory()
    sFactory.init()

    val s = sFactory.create("Hello world")

    val spFactory = SentencePrinterFactory()
    spFactory.init();
    val sPrinter = spFactory.create()

    sPrinter.print(s)
}
