// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package com.tegonal.minimalist.arguments.withArg

import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.fluent.en_GB.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Named
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import com.tegonal.minimalist.*
import com.tegonal.minimalist.atrium.*
import java.math.BigInteger
import java.time.LocalDate

class Args5WithArgTest {

	@Test
	fun withArg1() {
		val args = Args.of(
			"string",
			1,
			2L,
			3F,
			4.0,
			representation1 = "rep 1",
			representation2 = "rep 2",
			representation3 = "rep 3",
			representation4 = "rep 4",
			representation5 = "rep 5"
		)
		val argsResult = args.withArg1("another string", "new rep")

		// no changes to args
		expect(args) {
			a1.toEqual("string")
			a2.toEqual(1)
			a3.toEqual(2L)
			a4.toEqual(3F)
			a5.toEqual(4.0)
			representation1.toEqual("rep 1")
			representation2.toEqual("rep 2")
			representation3.toEqual("rep 3")
			representation4.toEqual("rep 4")
			representation5.toEqual("rep 5")
		}

		expect(argsResult) {
			a1.toEqual("another string")
			a2.toEqual(args.a2)
			a3.toEqual(args.a3)
			a4.toEqual(args.a4)
			a5.toEqual(args.a5)
			representation1.toEqual("new rep")
			representation2.toEqual(args.representation2)
			representation3.toEqual(args.representation3)
			representation4.toEqual(args.representation4)
			representation5.toEqual(args.representation5)
		}
	}

	@Test
	fun withArg2() {
		val args = Args.of(
			"string",
			1,
			2L,
			3F,
			4.0,
			representation1 = "rep 1",
			representation2 = "rep 2",
			representation3 = "rep 3",
			representation4 = "rep 4",
			representation5 = "rep 5"
		)
		val argsResult = args.withArg2(2, "new rep")

		// no changes to args
		expect(args) {
			a1.toEqual("string")
			a2.toEqual(1)
			a3.toEqual(2L)
			a4.toEqual(3F)
			a5.toEqual(4.0)
			representation1.toEqual("rep 1")
			representation2.toEqual("rep 2")
			representation3.toEqual("rep 3")
			representation4.toEqual("rep 4")
			representation5.toEqual("rep 5")
		}

		expect(argsResult) {
			a1.toEqual(args.a1)
			a2.toEqual(2)
			a3.toEqual(args.a3)
			a4.toEqual(args.a4)
			a5.toEqual(args.a5)
			representation1.toEqual(args.representation1)
			representation2.toEqual("new rep")
			representation3.toEqual(args.representation3)
			representation4.toEqual(args.representation4)
			representation5.toEqual(args.representation5)
		}
	}

	@Test
	fun withArg3() {
		val args = Args.of(
			"string",
			1,
			2L,
			3F,
			4.0,
			representation1 = "rep 1",
			representation2 = "rep 2",
			representation3 = "rep 3",
			representation4 = "rep 4",
			representation5 = "rep 5"
		)
		val argsResult = args.withArg3(3L, "new rep")

		// no changes to args
		expect(args) {
			a1.toEqual("string")
			a2.toEqual(1)
			a3.toEqual(2L)
			a4.toEqual(3F)
			a5.toEqual(4.0)
			representation1.toEqual("rep 1")
			representation2.toEqual("rep 2")
			representation3.toEqual("rep 3")
			representation4.toEqual("rep 4")
			representation5.toEqual("rep 5")
		}

		expect(argsResult) {
			a1.toEqual(args.a1)
			a2.toEqual(args.a2)
			a3.toEqual(3L)
			a4.toEqual(args.a4)
			a5.toEqual(args.a5)
			representation1.toEqual(args.representation1)
			representation2.toEqual(args.representation2)
			representation3.toEqual("new rep")
			representation4.toEqual(args.representation4)
			representation5.toEqual(args.representation5)
		}
	}

	@Test
	fun withArg4() {
		val args = Args.of(
			"string",
			1,
			2L,
			3F,
			4.0,
			representation1 = "rep 1",
			representation2 = "rep 2",
			representation3 = "rep 3",
			representation4 = "rep 4",
			representation5 = "rep 5"
		)
		val argsResult = args.withArg4(4F, "new rep")

		// no changes to args
		expect(args) {
			a1.toEqual("string")
			a2.toEqual(1)
			a3.toEqual(2L)
			a4.toEqual(3F)
			a5.toEqual(4.0)
			representation1.toEqual("rep 1")
			representation2.toEqual("rep 2")
			representation3.toEqual("rep 3")
			representation4.toEqual("rep 4")
			representation5.toEqual("rep 5")
		}

		expect(argsResult) {
			a1.toEqual(args.a1)
			a2.toEqual(args.a2)
			a3.toEqual(args.a3)
			a4.toEqual(4F)
			a5.toEqual(args.a5)
			representation1.toEqual(args.representation1)
			representation2.toEqual(args.representation2)
			representation3.toEqual(args.representation3)
			representation4.toEqual("new rep")
			representation5.toEqual(args.representation5)
		}
	}

	@Test
	fun withArg5() {
		val args = Args.of(
			"string",
			1,
			2L,
			3F,
			4.0,
			representation1 = "rep 1",
			representation2 = "rep 2",
			representation3 = "rep 3",
			representation4 = "rep 4",
			representation5 = "rep 5"
		)
		val argsResult = args.withArg5(5.0, "new rep")

		// no changes to args
		expect(args) {
			a1.toEqual("string")
			a2.toEqual(1)
			a3.toEqual(2L)
			a4.toEqual(3F)
			a5.toEqual(4.0)
			representation1.toEqual("rep 1")
			representation2.toEqual("rep 2")
			representation3.toEqual("rep 3")
			representation4.toEqual("rep 4")
			representation5.toEqual("rep 5")
		}

		expect(argsResult) {
			a1.toEqual(args.a1)
			a2.toEqual(args.a2)
			a3.toEqual(args.a3)
			a4.toEqual(args.a4)
			a5.toEqual(5.0)
			representation1.toEqual(args.representation1)
			representation2.toEqual(args.representation2)
			representation3.toEqual(args.representation3)
			representation4.toEqual(args.representation4)
			representation5.toEqual("new rep")
		}
	}

}