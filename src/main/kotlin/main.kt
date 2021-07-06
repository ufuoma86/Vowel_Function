fun main(args: Array<String>) {
    val print = removeVowels("This is my vowels")
    println(print)
}

fun removeVowels(S: String): String {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return S.filter { it !in vowels }
}