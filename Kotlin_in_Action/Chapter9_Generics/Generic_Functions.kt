fun <T> List<T>.slice(indices: IntRange): List<T>
val letters = ('a'..'z').toList()
println(letters.slice<Char>(0..2))


val authors = listOf("Dmitry", "Svetlana")
val readers = mutableListOf<String>()
fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T>
readers.filter { it !in authors }