// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package com.tegonal.minimalist.arguments.mapArg

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

class Args1MapArgTest {

	@Test
	fun mapArg1() {
		val args = Args.of(
			listOf(1),
			representation1 = Representation("rep 1")
		)
		val argsResult = args.mapArg1 { it.first() }

		// no changes to args
		expect(args) {
			a1.toEqual(listOf(1))
			representation1.toEqual("rep 1")
		}

		expect(argsResult) {
			a1.toEqual(1)
			representation1.toEqual(null)
		}
	}

	@Test
	fun mapArg1WithRepresentation() {
		val args = Args.of(
			listOf(1),
			representation1 = Representation("rep 1")
		)
		val argsResult = args.mapArg1WithRepresentation { arg, repr -> arg.first() to "$repr modified" }

		// no changes to args
		expect(args) {
			a1.toEqual(listOf(1))
			representation1.toEqual("rep 1")
		}

		expect(argsResult) {
			a1.toEqual(1)
			representation1.toEqual("rep 1 modified")
		}
	}

}