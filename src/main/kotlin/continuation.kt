package dev.reformator.stacktracedecoroutinator.continuation

import java.lang.invoke.MethodHandle
import java.lang.reflect.Field

internal data class DecoroutinatorContinuationSpec(
    val handle: MethodHandle,
    val labelField: Field,
    val label2LineNumber: Map<Int, Int>,
    val singleLineNumber: Int? = if (label2LineNumber.size == 1) label2LineNumber.values.single() else null
)

@Target(AnnotationTarget.CLASS)
@Retention
internal annotation class DecoroutinatorRuntime
