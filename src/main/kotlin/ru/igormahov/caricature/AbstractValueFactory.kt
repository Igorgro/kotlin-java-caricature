package ru.igormahov.caricature

import ru.igormahov.caricature.Initable

interface AbstractValueFactory<R, T>: Initable {
    fun create(t: T): R
}