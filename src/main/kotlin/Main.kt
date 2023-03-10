fun main() {

    val result = (commission("Visa", 1000_000, 0));
    println(result);

}
fun commission(typeCart: String, transfer: Int, previos: Int): Int {
    return when {
        typeCart == "MasterCart" -> MasterMaestro(1000, 0)
        typeCart == "Maestro" -> MasterMaestro(1000,0)
        typeCart == "Visa" -> VisaMir(1000)
        typeCart == "Мир" -> VisaMir(1000)
        else -> 0
    }
}
fun MasterMaestro(transfer: Int, previos: Int): Int {
    return when {
        transfer + previos > 75_000 -> transfer * 6 / 1000 + 20
        else -> 0
    }
}
fun VisaMir(transfer: Int): Int {
    return when {
        transfer * 75 / 10000 > 35 -> transfer * 75 / 10000
        else -> 35
    }
}