package test.calculadora

fun main() {
    val obj = Planeta("Planet1")

    println("" + obj.getId() + obj.getNombre() + obj.getTotales())

    val obj2 = Planeta("Planet2")
    val obj22 = Planeta("Planet22").Caract()

    println("" + obj2.getId() + obj2.getNombre() + obj2.getTotales() + obj22.getDensidad() + obj22.getNombre())
}


private var totales:Int = 0
class Planeta(nom:String) {
    private var nombre = nom
    private var id:Int = sumTotales()

    private fun sumTotales(): Int {
        totales+=1
        return totales
    }

    inner class Caract() {
        private var densidad:Double = 0.0
        private var masa:Long = 0

        fun getNombre(): String {
            return nombre
        }

        fun getDensidad(): Double? {
            return densidad
        }
    }

    fun getNombre(): String {
        return nombre
    }

    fun getTotales(): Int? {
        return totales
    }

    fun getId(): Int? {
        return id
    }
}