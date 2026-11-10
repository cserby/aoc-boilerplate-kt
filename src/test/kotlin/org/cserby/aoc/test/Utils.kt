package org.cserby.aoc.test

object Utils {
    fun readFile(resourcePath: String): String =
        requireNotNull(javaClass.getResource(resourcePath)) { "Missing resource $resourcePath" }
            .readText()
            .trim()
}
