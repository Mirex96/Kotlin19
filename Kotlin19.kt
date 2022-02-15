//19. Написать функцию, которая на вход принимает массив String и возвращает массив,
//где каждая строка перевернута. (Array<String> -> Array<String>)
fun main() {
    val str = arrayOf("Many", "Canny")
    println(check(str).contentToString())
}

fun check(array: Array<String>): Array<String> {
    for (i in array.indices) {
        array[i] = array[i].reversed()
    }
    return array
}