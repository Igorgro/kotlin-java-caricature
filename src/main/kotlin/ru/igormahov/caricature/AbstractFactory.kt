package ru.igormahov.caricature

import ru.igormahov.caricature.Initable

interface AbstractFactory<T>: Initable {
    fun create(): T
}