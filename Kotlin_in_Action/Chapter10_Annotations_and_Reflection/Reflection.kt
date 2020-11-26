// kClass
class Person(val name: String, val age: Int)
val person = Person("Alice", 29)
val kClass = person.javaClass.kotlin
kClass.memberProperties.forEach{ println(it.name) }

interface KCallable<out R> {
	fun call(vararg args: Any?): R
}

// kFunction
fun foo(x: Int) = println(x)
val kFunction = ::foo
kFunction.call(42)

import kotlin.reflect.KFunction2

fun sum(x: Int, y: Int) = x + y
val kFunction: KFunction2<Int, Int, Int> = ::sum;
println(kFunction.invoke(1, 2) + kFunction.invoke(3, 4))

// KFunction2 表示2个形参

//kProperty
var counter = 0
val kProperty = ::counter
kProperty.setter.call(21)
println(kProperty.get())