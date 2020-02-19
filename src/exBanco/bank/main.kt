package exBanco.bank

var clientes:ArrayList<Cliente> = ArrayList()
var cuentas:ArrayList<Cuenta> = ArrayList()

fun main() {
    var salir = false
    do {
        var a = readLine()
        if (a === "3")
            salir = true
        else if (a === "1")

    } while (!salir)
}

fun newCliente() {
    println("Nombre1")
    var nombre: String? = readLine()
    println("Nombre2")
    nombre+=" "+ readLine()
    println("Nombre3")
    nombre+=" "+ readLine()

    if (nombre == null) {
        nombre = "A"
    }

    var c = Cliente(nombre)
}