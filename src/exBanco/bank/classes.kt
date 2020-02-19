package exBanco.bank

import kotlin.collections.ArrayList

class Cliente(private var nombre: String) {
    private lateinit var id:String
    private var cuenta:ArrayList<Cuenta> = ArrayList()
}

class Cuenta(c: Cliente) {
    private var cliente:ArrayList<Cliente> = ArrayList()

    init {
        cliente.add(c)
    }
}