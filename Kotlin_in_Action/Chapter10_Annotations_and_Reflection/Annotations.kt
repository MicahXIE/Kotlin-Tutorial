class HasTempFolder {
	@get:Rule		// getter annotations
	val folder = TemporaryFolder()

	@Test
	fun testUsingTempFolder() {
		val createdFile = folder.newFile("myfile.txt")
		val createdFolder = folder.newFolder("subfolder")
	}
}

// JKid serialize(), deserialize(), @JsonName, @JsonExclude
data class Person(val name: String, val age: Int)
val person = Person("Alice", 29)
println(serialize(person))
val json = """{"name": "Alice", "age": 29}"""
println(deserialize<Person>(json))

data class Person(
	@JsonName("alias") val firstName: String,
	@JsonExclude val age: Int? = null
)

// annotation class JsonName(val name: String)