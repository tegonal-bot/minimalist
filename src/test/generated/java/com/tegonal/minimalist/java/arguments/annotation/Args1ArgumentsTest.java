// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts => generateTestJava
// --------------------------------------------------------------------------------------------------------------------
package com.tegonal.minimalist.java.arguments.annotation;

import ch.tutteli.atrium.api.fluent.en_GB.*;
import ch.tutteli.atrium.creating.Expect;
import com.tegonal.minimalist.*;
import com.tegonal.minimalist.atrium.*;
import com.tegonal.minimalist.java.*;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

import static ch.tutteli.atrium.api.fluent.en_GB.AnyExpectationsKt.*;
import static ch.tutteli.atrium.api.fluent.en_GB.ArraySubjectChangersKt.*;
import static ch.tutteli.atrium.api.fluent.en_GB.IterableExpectationsKt.*;
import static ch.tutteli.atrium.api.verbs.ExpectKt.expect;
import static com.tegonal.minimalist.atrium.Args1ExpectationsKt.*;
import static com.tegonal.minimalist.atrium.Args2ExpectationsKt.*;
import static com.tegonal.minimalist.atrium.Args3ExpectationsKt.*;
import static com.tegonal.minimalist.atrium.Args4ExpectationsKt.*;
import static com.tegonal.minimalist.atrium.Args5ExpectationsKt.*;
import static com.tegonal.minimalist.atrium.Args6ExpectationsKt.*;
import static com.tegonal.minimalist.atrium.Args7ExpectationsKt.*;
import static com.tegonal.minimalist.atrium.Args8ExpectationsKt.*;
import static com.tegonal.minimalist.atrium.Args9ExpectationsKt.*;
import static com.tegonal.minimalist.atrium.Args10ExpectationsKt.*;

public class Args1ArgumentsTest {

	@Test
	public void get_returns_correct_array_and_value_not_wrapped_in_Named_if_representation_not_specified() {
		var args = Args.of(
			1
		);
		new Pipe<>(expect(args.get()))
			.pipe((it) -> asList(it))
			.pipe(it -> IterableExpectationsKt.toContainExactly(
				it,
				args.getA1(),
				new Object[0],
				o -> Unit.INSTANCE
			));
	}

	@Test
	public void get_returns_correct_array_and_value_wrapped_in_Named_if_representation_specified() {
		var args = Args.of(
			1,
			new Representation("rep 1")
		);
		new Pipe<>(expect(args.get()))
			.pipe((it) -> asList(it))
			.pipe(it -> IterableExpectationsKt.toContainExactly(it,
				e -> {
					Class<Named<Integer>> clazz = (Class) Named.class;
					AnyExpectationsKt.toBeAnInstanceOf(e, kotlin.jvm.JvmClassMappingKt.getKotlinClass(clazz)).transformAndAppend(eNamed -> {
						NamedExpectationsKt.name(eNamed, eString -> {
							AnyExpectationsKt.toEqual(eString, args.getRepresentation1());
							return Unit.INSTANCE;
						});
						NamedExpectationsKt.payload(eNamed, eVal -> {
							AnyExpectationsKt.toEqual(eVal, args.getA1());
							return Unit.INSTANCE;
						});
						return Unit.INSTANCE;
					});
					return Unit.INSTANCE;
				},
				new Function1[0],
 				o -> Unit.INSTANCE
			));
	}

	@Test
	public void using_null_as_representation_does_not_wrap_it_into_Named() {
		var args = Args.of(
			1,
			(Representation) null
		);
		new Pipe<>(expect(args.get()))
			.pipe(it -> asList(it))
			.pipe(it -> IterableExpectationsKt.toContainExactly(
				it,
				args.getA1(),
				new Object[0],
				o -> Unit.INSTANCE
			));
	}

	@ParameterizedTest
	@MethodSource("args")
	public void can_use_Args1_in_MethodSource(
		Integer a1
	) {
		new Pipe<>(expect(a1)).pipe(it -> toEqual(it, 1));
	}

	static List<Args> args() {
		return List.of(Args.of(1));
	}
}