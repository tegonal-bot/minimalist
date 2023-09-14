// -----------------------------------------------------------------------
// automatically generated, don't modify here but in build.gradle.kts
// -----------------------------------------------------------------------
package com.tegonal.minimalist.append

import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.fluent.en_GB.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Named
import com.tegonal.minimalist.*
import com.tegonal.minimalist.atrium.*
import java.math.BigInteger
import java.time.LocalDate

class Args4AppendTest {

	@Test
	fun `append Arg1`() {
		val firstArgs = Args.of(
			1,
			2L,
			3F,
			4.0,
			representation1 = "rep 1",
			representation2 = "rep 2",
			representation3 = "rep 3",
			representation4 = "rep 4"
		)
		val secondArgs = Args.of(
			'c',
			representation1 = "rep 5"
		)
		val argsResult = firstArgs.append(secondArgs)
		expect(argsResult) {
			a1.toEqual(firstArgs.a1)
			a2.toEqual(firstArgs.a2)
			a3.toEqual(firstArgs.a3)
			a4.toEqual(firstArgs.a4)
			representation1.toEqual(firstArgs.representation1)
			representation2.toEqual(firstArgs.representation2)
			representation3.toEqual(firstArgs.representation3)
			representation4.toEqual(firstArgs.representation4)
			a5.toEqual(secondArgs.a1)
			representation5.toEqual(secondArgs.representation1)
		}
	}

	@Test
	fun `append Arg2`() {
		val firstArgs = Args.of(
			1,
			2L,
			3F,
			4.0,
			representation1 = "rep 1",
			representation2 = "rep 2",
			representation3 = "rep 3",
			representation4 = "rep 4"
		)
		val secondArgs = Args.of(
			'c',
			"string",
			representation1 = "rep 5",
			representation2 = "rep 6"
		)
		val argsResult = firstArgs.append(secondArgs)
		expect(argsResult) {
			a1.toEqual(firstArgs.a1)
			a2.toEqual(firstArgs.a2)
			a3.toEqual(firstArgs.a3)
			a4.toEqual(firstArgs.a4)
			representation1.toEqual(firstArgs.representation1)
			representation2.toEqual(firstArgs.representation2)
			representation3.toEqual(firstArgs.representation3)
			representation4.toEqual(firstArgs.representation4)
			a5.toEqual(secondArgs.a1)
			a6.toEqual(secondArgs.a2)
			representation5.toEqual(secondArgs.representation1)
			representation6.toEqual(secondArgs.representation2)
		}
	}

	@Test
	fun `append Arg3`() {
		val firstArgs = Args.of(
			1,
			2L,
			3F,
			4.0,
			representation1 = "rep 1",
			representation2 = "rep 2",
			representation3 = "rep 3",
			representation4 = "rep 4"
		)
		val secondArgs = Args.of(
			'c',
			"string",
			LocalDate.now(),
			representation1 = "rep 5",
			representation2 = "rep 6",
			representation3 = "rep 7"
		)
		val argsResult = firstArgs.append(secondArgs)
		expect(argsResult) {
			a1.toEqual(firstArgs.a1)
			a2.toEqual(firstArgs.a2)
			a3.toEqual(firstArgs.a3)
			a4.toEqual(firstArgs.a4)
			representation1.toEqual(firstArgs.representation1)
			representation2.toEqual(firstArgs.representation2)
			representation3.toEqual(firstArgs.representation3)
			representation4.toEqual(firstArgs.representation4)
			a5.toEqual(secondArgs.a1)
			a6.toEqual(secondArgs.a2)
			a7.toEqual(secondArgs.a3)
			representation5.toEqual(secondArgs.representation1)
			representation6.toEqual(secondArgs.representation2)
			representation7.toEqual(secondArgs.representation3)
		}
	}

	@Test
	fun `append Arg4`() {
		val firstArgs = Args.of(
			1,
			2L,
			3F,
			4.0,
			representation1 = "rep 1",
			representation2 = "rep 2",
			representation3 = "rep 3",
			representation4 = "rep 4"
		)
		val secondArgs = Args.of(
			'c',
			"string",
			LocalDate.now(),
			1.toShort(),
			representation1 = "rep 5",
			representation2 = "rep 6",
			representation3 = "rep 7",
			representation4 = "rep 8"
		)
		val argsResult = firstArgs.append(secondArgs)
		expect(argsResult) {
			a1.toEqual(firstArgs.a1)
			a2.toEqual(firstArgs.a2)
			a3.toEqual(firstArgs.a3)
			a4.toEqual(firstArgs.a4)
			representation1.toEqual(firstArgs.representation1)
			representation2.toEqual(firstArgs.representation2)
			representation3.toEqual(firstArgs.representation3)
			representation4.toEqual(firstArgs.representation4)
			a5.toEqual(secondArgs.a1)
			a6.toEqual(secondArgs.a2)
			a7.toEqual(secondArgs.a3)
			a8.toEqual(secondArgs.a4)
			representation5.toEqual(secondArgs.representation1)
			representation6.toEqual(secondArgs.representation2)
			representation7.toEqual(secondArgs.representation3)
			representation8.toEqual(secondArgs.representation4)
		}
	}

	@Test
	fun `append Arg5`() {
		val firstArgs = Args.of(
			1,
			2L,
			3F,
			4.0,
			representation1 = "rep 1",
			representation2 = "rep 2",
			representation3 = "rep 3",
			representation4 = "rep 4"
		)
		val secondArgs = Args.of(
			'c',
			"string",
			LocalDate.now(),
			1.toShort(),
			2.toByte(),
			representation1 = "rep 5",
			representation2 = "rep 6",
			representation3 = "rep 7",
			representation4 = "rep 8",
			representation5 = "rep 9"
		)
		val argsResult = firstArgs.append(secondArgs)
		expect(argsResult) {
			a1.toEqual(firstArgs.a1)
			a2.toEqual(firstArgs.a2)
			a3.toEqual(firstArgs.a3)
			a4.toEqual(firstArgs.a4)
			representation1.toEqual(firstArgs.representation1)
			representation2.toEqual(firstArgs.representation2)
			representation3.toEqual(firstArgs.representation3)
			representation4.toEqual(firstArgs.representation4)
			a5.toEqual(secondArgs.a1)
			a6.toEqual(secondArgs.a2)
			a7.toEqual(secondArgs.a3)
			a8.toEqual(secondArgs.a4)
			a9.toEqual(secondArgs.a5)
			representation5.toEqual(secondArgs.representation1)
			representation6.toEqual(secondArgs.representation2)
			representation7.toEqual(secondArgs.representation3)
			representation8.toEqual(secondArgs.representation4)
			representation9.toEqual(secondArgs.representation5)
		}
	}

	@Test
	fun `append Arg6`() {
		val firstArgs = Args.of(
			1,
			2L,
			3F,
			4.0,
			representation1 = "rep 1",
			representation2 = "rep 2",
			representation3 = "rep 3",
			representation4 = "rep 4"
		)
		val secondArgs = Args.of(
			'c',
			"string",
			LocalDate.now(),
			1.toShort(),
			2.toByte(),
			3.toBigInteger(),
			representation1 = "rep 5",
			representation2 = "rep 6",
			representation3 = "rep 7",
			representation4 = "rep 8",
			representation5 = "rep 9",
			representation6 = "rep 10"
		)
		val argsResult = firstArgs.append(secondArgs)
		expect(argsResult) {
			a1.toEqual(firstArgs.a1)
			a2.toEqual(firstArgs.a2)
			a3.toEqual(firstArgs.a3)
			a4.toEqual(firstArgs.a4)
			representation1.toEqual(firstArgs.representation1)
			representation2.toEqual(firstArgs.representation2)
			representation3.toEqual(firstArgs.representation3)
			representation4.toEqual(firstArgs.representation4)
			a5.toEqual(secondArgs.a1)
			a6.toEqual(secondArgs.a2)
			a7.toEqual(secondArgs.a3)
			a8.toEqual(secondArgs.a4)
			a9.toEqual(secondArgs.a5)
			a10.toEqual(secondArgs.a6)
			representation5.toEqual(secondArgs.representation1)
			representation6.toEqual(secondArgs.representation2)
			representation7.toEqual(secondArgs.representation3)
			representation8.toEqual(secondArgs.representation4)
			representation9.toEqual(secondArgs.representation5)
			representation10.toEqual(secondArgs.representation6)
		}
	}

}