package test.calculadora

fun main() {
    val obj = Class1("Marc")
    obj.setName("Font")

    println(obj.getName())
}

class Class1 (surname:String){
    private lateinit var name: String;

    fun setName(name:String) {
        this.name = name
    }

    fun getName(): String {
        return name
    }

}