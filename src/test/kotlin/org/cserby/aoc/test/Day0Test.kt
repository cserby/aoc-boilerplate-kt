package org.cserby.aoc.test

import org.cserby.aoc.Day0
import kotlin.test.Test
import kotlin.test.assertEquals

class Day0Test {
    @Test
    fun part1example() {
        assertEquals(10, Day0.part1(Utils.readFile("/day0.example.txt")))
    }

    @Test
    fun part2example() {
        assertEquals(24, Day0.part2(Utils.readFile("/day0.example.txt")))
    }
}
