// -----------------------------------------------------------------------
// automatically generated, don't modify here but in build.gradle.kts
// -----------------------------------------------------------------------
package com.tegonal.minimalist.arguments

import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.fluent.en_GB.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Named
import com.tegonal.minimalist.*
import com.tegonal.minimalist.atrium.*
import java.math.BigInteger
import java.time.LocalDate

class Args2ArgumentsTest {

	@Test
	fun `get returns correct array and value wrapped in Name`() {
		val args = Args.of(
			1,
			2L,
			representation1 = "rep 1",
			representation2 = "rep 2"
		)
		expect(args.get().toList()).toContainExactly(
			{
				toBeANamedOf<Int>(args.representation1!!, args.a1)
			},
			{
				toBeANamedOf<Long>(args.representation2!!, args.a2)
			}

		)
	}

}