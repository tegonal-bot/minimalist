// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package com.tegonal.minimalist.arguments.annotation

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

class Args3ArgumentsTest {

	@Test
	fun `get returns correct array and value not wrapped in Named if representation not specified`() {
		val args = Args.of(
			1,
			2L,
			3F
		)
		expect(args.get().toList()).toContainExactly(
			args.a1,
			args.a2,
			args.a3
		)
	}
	@Test
	fun `get returns correct array and value wrapped in Named if representation specified`() {
		val args = Args.of(
			1,
			2L,
			3F,
			representation1 = Representation("rep 1"),
			representation2 = "rep 2",
			representation3 = "rep 3"
		)
		expect(args.get().toList()).toContainExactly(
			{
				toBeANamedOf<Int>(args.representation1!!, args.a1)
			},
			{
				toBeANamedOf<Long>(args.representation2!!, args.a2)
			},
			{
				toBeANamedOf<Float>(args.representation3!!, args.a3)
			}
		)
	}

	@Test
	fun `using null as representation does not wrap it into Named`() {
		val args = Args.of(
			1,
			2L,
			3F,
			representation1 = null ,
			representation2 = null ,
			representation3 = null 
		)
		expect(args.get().toList()).toContainExactly(
			args.a1,
			args.a2,
			args.a3
		)
	}

	@ParameterizedTest
	@MethodSource("args")
	fun `can use Args3 in MethodSource`(
		a1: Int,
		a2: Long,
		a3: Float
	) {
		expect(a1).toEqual(1)
		expect(a2).toEqual(2L)
		expect(a3).toEqual(3F)
	}

	companion object {
		@JvmStatic
		fun args() = listOf(Args.of(1, 2L, 3F))
	}
}