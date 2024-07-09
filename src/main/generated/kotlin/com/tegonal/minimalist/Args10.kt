// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package com.tegonal.minimalist

/**
 * Represents an [Args] with 10 arguments.
 *
 * @since 1.0.0
 */
interface Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10>: Args {
	/**
	 * The value of argument 1.
	 *
	 * @since 1.0.0
	 */
	val a1: A1
	/**
	 * The value of argument 2.
	 *
	 * @since 1.0.0
	 */
	val a2: A2
	/**
	 * The value of argument 3.
	 *
	 * @since 1.0.0
	 */
	val a3: A3
	/**
	 * The value of argument 4.
	 *
	 * @since 1.0.0
	 */
	val a4: A4
	/**
	 * The value of argument 5.
	 *
	 * @since 1.0.0
	 */
	val a5: A5
	/**
	 * The value of argument 6.
	 *
	 * @since 1.0.0
	 */
	val a6: A6
	/**
	 * The value of argument 7.
	 *
	 * @since 1.0.0
	 */
	val a7: A7
	/**
	 * The value of argument 8.
	 *
	 * @since 1.0.0
	 */
	val a8: A8
	/**
	 * The value of argument 9.
	 *
	 * @since 1.0.0
	 */
	val a9: A9
	/**
	 * The value of argument 10.
	 *
	 * @since 1.0.0
	 */
	val a10: A10

	/**
	 * The representation of argument 1.
	 *
	 * @since 1.0.0
	 */
	val representation1: String?
	/**
	 * The representation of argument 2.
	 *
	 * @since 1.0.0
	 */
	val representation2: String?
	/**
	 * The representation of argument 3.
	 *
	 * @since 1.0.0
	 */
	val representation3: String?
	/**
	 * The representation of argument 4.
	 *
	 * @since 1.0.0
	 */
	val representation4: String?
	/**
	 * The representation of argument 5.
	 *
	 * @since 1.0.0
	 */
	val representation5: String?
	/**
	 * The representation of argument 6.
	 *
	 * @since 1.0.0
	 */
	val representation6: String?
	/**
	 * The representation of argument 7.
	 *
	 * @since 1.0.0
	 */
	val representation7: String?
	/**
	 * The representation of argument 8.
	 *
	 * @since 1.0.0
	 */
	val representation8: String?
	/**
	 * The representation of argument 9.
	 *
	 * @since 1.0.0
	 */
	val representation9: String?
	/**
	 * The representation of argument 10.
	 *
	 * @since 1.0.0
	 */
	val representation10: String?

	/**
	 * Creates a new [Args10] by coping `this` [Args10] but replaces
	 * the argument 1 ([Args10.a1]) with the given [value] (and its representation with the given [representation]).
	 *
	 * @param value The new value to use for argument 1.
	 * @param representation The new representation to use for the argument 1 where `null`
	 *   means let the algorithm determine a representation.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 1.0.0
	 */
	fun withArg1(value: A1, representation: String? = null): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a1] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a1] to a new value.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A1New> mapArg1(transform: (A1) -> A1New): Args10<A1New, A2, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a1] and its [representation1] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a1] and [representation1].
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A1New> mapArg1WithRepresentation(transform: (A1, String?) -> Pair<A1New, String?>): Args10<A1New, A2, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Creates a new [Args10] by coping `this` [Args10] but replaces
	 * the argument 2 ([Args10.a2]) with the given [value] (and its representation with the given [representation]).
	 *
	 * @param value The new value to use for argument 2.
	 * @param representation The new representation to use for the argument 2 where `null`
	 *   means let the algorithm determine a representation.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 1.0.0
	 */
	fun withArg2(value: A2, representation: String? = null): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a2] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a2] to a new value.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A2New> mapArg2(transform: (A2) -> A2New): Args10<A1, A2New, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a2] and its [representation2] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a2] and [representation2].
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A2New> mapArg2WithRepresentation(transform: (A2, String?) -> Pair<A2New, String?>): Args10<A1, A2New, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Creates a new [Args10] by coping `this` [Args10] but replaces
	 * the argument 3 ([Args10.a3]) with the given [value] (and its representation with the given [representation]).
	 *
	 * @param value The new value to use for argument 3.
	 * @param representation The new representation to use for the argument 3 where `null`
	 *   means let the algorithm determine a representation.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 1.0.0
	 */
	fun withArg3(value: A3, representation: String? = null): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a3] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a3] to a new value.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A3New> mapArg3(transform: (A3) -> A3New): Args10<A1, A2, A3New, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a3] and its [representation3] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a3] and [representation3].
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A3New> mapArg3WithRepresentation(transform: (A3, String?) -> Pair<A3New, String?>): Args10<A1, A2, A3New, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Creates a new [Args10] by coping `this` [Args10] but replaces
	 * the argument 4 ([Args10.a4]) with the given [value] (and its representation with the given [representation]).
	 *
	 * @param value The new value to use for argument 4.
	 * @param representation The new representation to use for the argument 4 where `null`
	 *   means let the algorithm determine a representation.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 1.0.0
	 */
	fun withArg4(value: A4, representation: String? = null): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a4] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a4] to a new value.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A4New> mapArg4(transform: (A4) -> A4New): Args10<A1, A2, A3, A4New, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a4] and its [representation4] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a4] and [representation4].
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A4New> mapArg4WithRepresentation(transform: (A4, String?) -> Pair<A4New, String?>): Args10<A1, A2, A3, A4New, A5, A6, A7, A8, A9, A10>

	/**
	 * Creates a new [Args10] by coping `this` [Args10] but replaces
	 * the argument 5 ([Args10.a5]) with the given [value] (and its representation with the given [representation]).
	 *
	 * @param value The new value to use for argument 5.
	 * @param representation The new representation to use for the argument 5 where `null`
	 *   means let the algorithm determine a representation.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 1.0.0
	 */
	fun withArg5(value: A5, representation: String? = null): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a5] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a5] to a new value.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A5New> mapArg5(transform: (A5) -> A5New): Args10<A1, A2, A3, A4, A5New, A6, A7, A8, A9, A10>

	/**
	 * Maps [a5] and its [representation5] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a5] and [representation5].
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A5New> mapArg5WithRepresentation(transform: (A5, String?) -> Pair<A5New, String?>): Args10<A1, A2, A3, A4, A5New, A6, A7, A8, A9, A10>

	/**
	 * Creates a new [Args10] by coping `this` [Args10] but replaces
	 * the argument 6 ([Args10.a6]) with the given [value] (and its representation with the given [representation]).
	 *
	 * @param value The new value to use for argument 6.
	 * @param representation The new representation to use for the argument 6 where `null`
	 *   means let the algorithm determine a representation.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 1.0.0
	 */
	fun withArg6(value: A6, representation: String? = null): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a6] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a6] to a new value.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A6New> mapArg6(transform: (A6) -> A6New): Args10<A1, A2, A3, A4, A5, A6New, A7, A8, A9, A10>

	/**
	 * Maps [a6] and its [representation6] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a6] and [representation6].
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A6New> mapArg6WithRepresentation(transform: (A6, String?) -> Pair<A6New, String?>): Args10<A1, A2, A3, A4, A5, A6New, A7, A8, A9, A10>

	/**
	 * Creates a new [Args10] by coping `this` [Args10] but replaces
	 * the argument 7 ([Args10.a7]) with the given [value] (and its representation with the given [representation]).
	 *
	 * @param value The new value to use for argument 7.
	 * @param representation The new representation to use for the argument 7 where `null`
	 *   means let the algorithm determine a representation.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 1.0.0
	 */
	fun withArg7(value: A7, representation: String? = null): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a7] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a7] to a new value.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A7New> mapArg7(transform: (A7) -> A7New): Args10<A1, A2, A3, A4, A5, A6, A7New, A8, A9, A10>

	/**
	 * Maps [a7] and its [representation7] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a7] and [representation7].
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A7New> mapArg7WithRepresentation(transform: (A7, String?) -> Pair<A7New, String?>): Args10<A1, A2, A3, A4, A5, A6, A7New, A8, A9, A10>

	/**
	 * Creates a new [Args10] by coping `this` [Args10] but replaces
	 * the argument 8 ([Args10.a8]) with the given [value] (and its representation with the given [representation]).
	 *
	 * @param value The new value to use for argument 8.
	 * @param representation The new representation to use for the argument 8 where `null`
	 *   means let the algorithm determine a representation.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 1.0.0
	 */
	fun withArg8(value: A8, representation: String? = null): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a8] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a8] to a new value.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A8New> mapArg8(transform: (A8) -> A8New): Args10<A1, A2, A3, A4, A5, A6, A7, A8New, A9, A10>

	/**
	 * Maps [a8] and its [representation8] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a8] and [representation8].
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A8New> mapArg8WithRepresentation(transform: (A8, String?) -> Pair<A8New, String?>): Args10<A1, A2, A3, A4, A5, A6, A7, A8New, A9, A10>

	/**
	 * Creates a new [Args10] by coping `this` [Args10] but replaces
	 * the argument 9 ([Args10.a9]) with the given [value] (and its representation with the given [representation]).
	 *
	 * @param value The new value to use for argument 9.
	 * @param representation The new representation to use for the argument 9 where `null`
	 *   means let the algorithm determine a representation.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 1.0.0
	 */
	fun withArg9(value: A9, representation: String? = null): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a9] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a9] to a new value.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A9New> mapArg9(transform: (A9) -> A9New): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9New, A10>

	/**
	 * Maps [a9] and its [representation9] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a9] and [representation9].
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A9New> mapArg9WithRepresentation(transform: (A9, String?) -> Pair<A9New, String?>): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9New, A10>

	/**
	 * Creates a new [Args10] by coping `this` [Args10] but replaces
	 * the argument 10 ([Args10.a10]) with the given [value] (and its representation with the given [representation]).
	 *
	 * @param value The new value to use for argument 10.
	 * @param representation The new representation to use for the argument 10 where `null`
	 *   means let the algorithm determine a representation.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 1.0.0
	 */
	fun withArg10(value: A10, representation: String? = null): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Maps [a10] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a10] to a new value.
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A10New> mapArg10(transform: (A10) -> A10New): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10New>

	/**
	 * Maps [a10] and its [representation10] of this [Args10] with the given [transform] function resulting in a new [Args10].
	 *
	 * @param transform The function which maps [a10] and [representation10].
	 *
	 * @return The newly created [Args10].
	 *
	 * @since 2.0.0
	 */
	fun <A10New> mapArg10WithRepresentation(transform: (A10, String?) -> Pair<A10New, String?>): Args10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10New>


	/**
	 * Creates a new [Args9] by copying `this` [Args10] but dropping its argument 1 ([Args10.a1]).
	 *
	 * @return The newly created [Args9].
	 *
	 * @since 1.0.0
	 */
	fun dropArg1(): Args9<A2, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Creates a new [Args9] by copying `this` [Args10] but dropping its argument 2 ([Args10.a2]).
	 *
	 * @return The newly created [Args9].
	 *
	 * @since 1.0.0
	 */
	fun dropArg2(): Args9<A1, A3, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Creates a new [Args9] by copying `this` [Args10] but dropping its argument 3 ([Args10.a3]).
	 *
	 * @return The newly created [Args9].
	 *
	 * @since 1.0.0
	 */
	fun dropArg3(): Args9<A1, A2, A4, A5, A6, A7, A8, A9, A10>

	/**
	 * Creates a new [Args9] by copying `this` [Args10] but dropping its argument 4 ([Args10.a4]).
	 *
	 * @return The newly created [Args9].
	 *
	 * @since 1.0.0
	 */
	fun dropArg4(): Args9<A1, A2, A3, A5, A6, A7, A8, A9, A10>

	/**
	 * Creates a new [Args9] by copying `this` [Args10] but dropping its argument 5 ([Args10.a5]).
	 *
	 * @return The newly created [Args9].
	 *
	 * @since 1.0.0
	 */
	fun dropArg5(): Args9<A1, A2, A3, A4, A6, A7, A8, A9, A10>

	/**
	 * Creates a new [Args9] by copying `this` [Args10] but dropping its argument 6 ([Args10.a6]).
	 *
	 * @return The newly created [Args9].
	 *
	 * @since 1.0.0
	 */
	fun dropArg6(): Args9<A1, A2, A3, A4, A5, A7, A8, A9, A10>

	/**
	 * Creates a new [Args9] by copying `this` [Args10] but dropping its argument 7 ([Args10.a7]).
	 *
	 * @return The newly created [Args9].
	 *
	 * @since 1.0.0
	 */
	fun dropArg7(): Args9<A1, A2, A3, A4, A5, A6, A8, A9, A10>

	/**
	 * Creates a new [Args9] by copying `this` [Args10] but dropping its argument 8 ([Args10.a8]).
	 *
	 * @return The newly created [Args9].
	 *
	 * @since 1.0.0
	 */
	fun dropArg8(): Args9<A1, A2, A3, A4, A5, A6, A7, A9, A10>

	/**
	 * Creates a new [Args9] by copying `this` [Args10] but dropping its argument 9 ([Args10.a9]).
	 *
	 * @return The newly created [Args9].
	 *
	 * @since 1.0.0
	 */
	fun dropArg9(): Args9<A1, A2, A3, A4, A5, A6, A7, A8, A10>

	/**
	 * Creates a new [Args9] by copying `this` [Args10] but dropping its argument 10 ([Args10.a10]).
	 *
	 * @return The newly created [Args9].
	 *
	 * @since 1.0.0
	 */
	fun dropArg10(): Args9<A1, A2, A3, A4, A5, A6, A7, A8, A9>

}
