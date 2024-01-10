// -----------------------------------------------------------------------
// automatically generated, don't modify here but in build.gradle.kts
// -----------------------------------------------------------------------
package com.tegonal.minimalist.impl

import com.tegonal.minimalist.*

import org.junit.jupiter.api.Named

/**
 * A simple data class based implementation of an [Args4].
 *
 * !! No backward compatibility guarantees !!
 * Re-use on own risk
 *
 * @since 1.0.0
 */
internal data class DefaultArgs4<A1, A2, A3, A4>(
	override val a1: A1,
	override val a2: A2,
	override val a3: A3,
	override val a4: A4,
	override val representation1: String? = null,
	override val representation2: String? = null,
	override val representation3: String? = null,
	override val representation4: String? = null,
) : Args4<A1, A2, A3, A4> {

	override fun get(): Array<out Any?> = arrayOf(
		representation1?.let { Named.of(representation1, a1) } ?: a1,
		representation2?.let { Named.of(representation2, a2) } ?: a2,
		representation3?.let { Named.of(representation3, a3) } ?: a3,
		representation4?.let { Named.of(representation4, a4) } ?: a4
	)

	override fun withArg1(value: A1, representation: String?): Args4<A1, A2, A3, A4> =
		this.copy(a1 = value, representation1 = representation)

	override fun withArg2(value: A2, representation: String?): Args4<A1, A2, A3, A4> =
		this.copy(a2 = value, representation2 = representation)

	override fun withArg3(value: A3, representation: String?): Args4<A1, A2, A3, A4> =
		this.copy(a3 = value, representation3 = representation)

	override fun withArg4(value: A4, representation: String?): Args4<A1, A2, A3, A4> =
		this.copy(a4 = value, representation4 = representation)


	override fun <A5> append(
		arg1: Args1<A5>
	): Args5<A1, A2, A3, A4, A5> = Args.of(
		a1 = this.a1,
		a2 = this.a2,
		a3 = this.a3,
		a4 = this.a4,
		a5 = arg1.a1,
		representation1 = this.representation1,
		representation2 = this.representation2,
		representation3 = this.representation3,
		representation4 = this.representation4,
		representation5 = arg1.representation1,
	)


	override fun <A5, A6> append(
		arg2: Args2<A5, A6>
	): Args6<A1, A2, A3, A4, A5, A6> = Args.of(
		a1 = this.a1,
		a2 = this.a2,
		a3 = this.a3,
		a4 = this.a4,
		a5 = arg2.a1,
		a6 = arg2.a2,
		representation1 = this.representation1,
		representation2 = this.representation2,
		representation3 = this.representation3,
		representation4 = this.representation4,
		representation5 = arg2.representation1,
		representation6 = arg2.representation2,
	)


	override fun <A5, A6, A7> append(
		arg3: Args3<A5, A6, A7>
	): Args7<A1, A2, A3, A4, A5, A6, A7> = Args.of(
		a1 = this.a1,
		a2 = this.a2,
		a3 = this.a3,
		a4 = this.a4,
		a5 = arg3.a1,
		a6 = arg3.a2,
		a7 = arg3.a3,
		representation1 = this.representation1,
		representation2 = this.representation2,
		representation3 = this.representation3,
		representation4 = this.representation4,
		representation5 = arg3.representation1,
		representation6 = arg3.representation2,
		representation7 = arg3.representation3,
	)


	override fun <A5, A6, A7, A8> append(
		arg4: Args4<A5, A6, A7, A8>
	): Args8<A1, A2, A3, A4, A5, A6, A7, A8> = Args.of(
		a1 = this.a1,
		a2 = this.a2,
		a3 = this.a3,
		a4 = this.a4,
		a5 = arg4.a1,
		a6 = arg4.a2,
		a7 = arg4.a3,
		a8 = arg4.a4,
		representation1 = this.representation1,
		representation2 = this.representation2,
		representation3 = this.representation3,
		representation4 = this.representation4,
		representation5 = arg4.representation1,
		representation6 = arg4.representation2,
		representation7 = arg4.representation3,
		representation8 = arg4.representation4,
	)


	override fun <A5, A6, A7, A8, A9> append(
		arg5: Args5<A5, A6, A7, A8, A9>
	): Args9<A1, A2, A3, A4, A5, A6, A7, A8, A9> = Args.of(
		a1 = this.a1,
		a2 = this.a2,
		a3 = this.a3,
		a4 = this.a4,
		a5 = arg5.a1,
		a6 = arg5.a2,
		a7 = arg5.a3,
		a8 = arg5.a4,
		a9 = arg5.a5,
		representation1 = this.representation1,
		representation2 = this.representation2,
		representation3 = this.representation3,
		representation4 = this.representation4,
		representation5 = arg5.representation1,
		representation6 = arg5.representation2,
		representation7 = arg5.representation3,
		representation8 = arg5.representation4,
		representation9 = arg5.representation5,
	)


	override fun <A5, A6, A7, A8, A9, A10> append(
		arg6: Args6<A5, A6, A7, A8, A9, A10>
	): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10> = Args.of(
		a1 = this.a1,
		a2 = this.a2,
		a3 = this.a3,
		a4 = this.a4,
		a5 = arg6.a1,
		a6 = arg6.a2,
		a7 = arg6.a3,
		a8 = arg6.a4,
		a9 = arg6.a5,
		a10 = arg6.a6,
		representation1 = this.representation1,
		representation2 = this.representation2,
		representation3 = this.representation3,
		representation4 = this.representation4,
		representation5 = arg6.representation1,
		representation6 = arg6.representation2,
		representation7 = arg6.representation3,
		representation8 = arg6.representation4,
		representation9 = arg6.representation5,
		representation10 = arg6.representation6,
	)


	override fun dropArg1() = Args.of(
		a1 = this.a2,
		a2 = this.a3,
		a3 = this.a4,
		representation1 = this.representation2,
		representation2 = this.representation3,
		representation3 = this.representation4
	)

	override fun dropArg2() = Args.of(
		a1 = this.a1,
		a2 = this.a3,
		a3 = this.a4,
		representation1 = this.representation1,
		representation2 = this.representation3,
		representation3 = this.representation4
	)

	override fun dropArg3() = Args.of(
		a1 = this.a1,
		a2 = this.a2,
		a3 = this.a4,
		representation1 = this.representation1,
		representation2 = this.representation2,
		representation3 = this.representation4
	)

	override fun dropArg4() = Args.of(
		a1 = this.a1,
		a2 = this.a2,
		a3 = this.a3,
		representation1 = this.representation1,
		representation2 = this.representation2,
		representation3 = this.representation3
	)

}
