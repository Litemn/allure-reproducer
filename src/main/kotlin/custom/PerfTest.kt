package custom

import io.qameta.allure.LabelAnnotation
import java.lang.annotation.Inherited

@Inherited
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.TYPE, AnnotationTarget.FUNCTION, AnnotationTarget.CLASS)
@LabelAnnotation(name = "layer", value = "Perf tests")
annotation class PerfTest()
