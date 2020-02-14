package test.calculadora

const val PI = 3.14
var x = 1

fun main() {
    println("Hello world!")
    suma(1,2)
    printSuma(2,2)

    println("xPi = ${xPI()}")
    x++
    println("xPi2 = ${xPI()}")

    /* VARIABLES */
    var a: Int = 10

    /* CONSTANTES */
// Se debe definir el tipo y/o valor
    val b: Int = 2
    val bb = 2
    val bbb: Int
    bbb = 2

    val string = "asdasd"

    for (st in string) {
        println(st)
    }

    for (a2 in 0 until a) {
        print(""+a2 + " - ")
    }
    println()
    for (a2 in 0 until a step 2) {
        print("$a2 - ")
    }
    println()
    for (a2 in 20 downTo a) {
        print("$a2 - ")
    }
    println()

    println(describe("a"))

    /* ARRAY */
    val asc = Array(5) {
            i -> (i * i).toString()
            // i = 0, i = 1, i = 2
    }
    asc.forEach { print("$it - ") }
    println()

    for ((index, value) in asc.withIndex()) {
        println("the element at $index is $value")
    }

    val nums: MutableList<Int> = mutableListOf(1, 2, 3)
    nums.forEach { print("$it - ") }
    println()
    nums.add(3, 4)
    nums.forEach { print("$it - ") }
    println()

    val text = """
        Text
        Long
        ${'$'}9.99
    """.trimIndent()
    println(text)

    // RANGE
    if (a in 9..a+1)
        println("$a está entre 9 y ${a+1}")
    if (a !in 7..9)
        println("$a no está entre 7 y 9")

    for (x in 1..5) {
        print("$x - ")
    }
}

fun suma(a: Int, b: Int): Int {
    return a+b
}

// fun name(): Unit {} Not return value
fun printSuma(a: Int, b: Int) {
    println("$a + $b = ${a+b}")
}

fun xPI(): Double {
    return x * PI
}

// Int? == Return Integer or null
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}

fun describe(obj: Any): String =
    when (obj) {
        1,2        -> "One or two"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }