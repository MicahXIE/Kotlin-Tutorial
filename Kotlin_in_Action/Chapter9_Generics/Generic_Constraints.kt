// upper bound
fun <T : Number> List<T>.sum() : T
println(listOf(1, 2, 3).sum())

// type constraints
fun <T: Comparable<T>> max(first: T, second: T): T {
	return if (first > second) first else second
}
println(max("kotlin", "java"))


fun printSum(c: Collection<*>) {
	val intList = c as? List<Int>
			?: throw IllegalArgumentException("List is expected")
	println(intList.sum())
}
printSum(listOf(1, 2, 3))

fun printSum(c: Collection<Int>) {
	if (c is List<Int>) {
		println(c.sum())
	}
}
printSum(listOf(1, 2, 3))