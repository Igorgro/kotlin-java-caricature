package ru.igormahov.caricature

import ru.igormahov.caricature.Initable

interface AbstractPrinter<T>: Initable {
    fun print(t: T)
}