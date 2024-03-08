package com.ichi2.anki.jacocoInstrumentKt

interface FinishListener {
    fun dumpIntermediateCoverage(filePath: String): Unit
}
