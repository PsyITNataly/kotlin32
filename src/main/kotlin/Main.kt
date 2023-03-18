fun main() {

    val result = (commission("Maestro"));
    println(result);

}

fun commission(typeCart: String): Int {
    return when {
        typeCart == "MasterCart" || typeCart == "Maestro" -> MasterMaestro(80_000, 50_000)
        typeCart == "Visa" || typeCart == "Мир" -> VisaMir(2_000, 0)
        typeCart == "VKPay" -> VKPay(36_000, 5_000)
        else -> 0
    }
}

fun MasterMaestro(transfer: Int, previos: Int): Int {
    return when {
        transfer + previos > 600_000 -> -200
        transfer + previos > 150_000 -> -100
        transfer > 75_000 -> transfer * 6 / 1000 + 20

        else -> 0
    }
}

fun VisaMir(transfer: Int, previos: Int): Int {
    return when {
        transfer + previos > 600_000 -> -200
        transfer + previos > 150_000 -> -100
        transfer * 75 / 10000 > 35 -> transfer * 75 / 10000
        else -> 35
    }
}

fun VKPay(transfer: Int, previos: Int): Int {
    return when {
        transfer + previos in 15001..39999 -> -100
        transfer + previos > 40_000 -> -200
        else -> 0
    }
}
