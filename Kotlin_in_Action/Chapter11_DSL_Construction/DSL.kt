//Internal DSL, SQL
(Country join Customer)
	.slice(Country.name, Count(Customer.id))
	.selectAll()
	.groupBy(Country.name)
	.orderBy(Count(Customer.id), isAsc = false)
	.limit(1)

// HTML
fun createSimpleTable() = createHTML().
	table {
		tr {
			td { +"cell" }
		}
	}

fun createAnotherTable() = createHTML.table {
	val numbers = mapOf(1 to "one", 2 to "two")
	for ((num, string) in numbers) {
		tr {
			td { +"$num" }
			td { +string }
		}
	}
}

/*
<table>
	<tr>
		<td>1</td>
		<td>one</td>
	</tr>
	<tr>
		<td>2</td>
		<td>two</td>
	</tr>
</table>
*/


// lambda
fun buildString (
	builderAction: StringBuilder.() -> Unit
) : String {
	val sb = StringBuilder()
	sb.builderAction()
	return sb.toString()
}

val s = buildString { 
	this.append("Hello, ")
	append("World!")
}

println(s)


//val 带接收者的lambda为参数 和 变量
val appendExcl : StringBuilder.() -> Unit =
		{ this.append("!") }
val stringBuilder = StringBuilder("Hi")
stringBuilder.appendExcl()
println(stringBuilder)



