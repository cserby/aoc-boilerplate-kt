package org.cserby.aoc

object Day0 {
    private fun parse(input: String): List<Int> = input.lines().map(String::toInt)

    fun part1(input: String): Int = parse(input).sum()

    fun part2(input: String): Int = parse(input).fold(1, Int::times)
}
