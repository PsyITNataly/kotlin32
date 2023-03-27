import org.junit.Test
import java.awt.font.MultipleMaster
import kotlin.test.assertEquals

class MainKtTest1 {

    @Test
    fun commissionMasterCart() {
        val typeCart = "MasterCart"

        val result = commission(typeCart)

        assertEquals(-100, result)
    }



    @Test
    fun commissionMaestro() {
        val typeCart = "Maestro"

        val result = commission(typeCart)

        assertEquals(-100, result)
    }

    @Test
    fun commissionVisa() {
        val typeCart = "Visa"

        val result = commission(typeCart)

        assertEquals(35, result)
    }

    @Test
    fun commissionMir() {
        val typeCart = "Мир"

        val result = commission(typeCart)

        assertEquals(35, result)
    }

    @Test
    fun commissionVKPay() {
        val typeCart = "VKPay"

        val result = commission(typeCart)

        assertEquals(0, result)
    }

    @Test
    fun commission() {
        val typeCart = ""

        val result = commission(typeCart)

        assertEquals(0, result)
    }

    @Test
    fun MasterMaestro0() {
        val transfer = 301
        val previos = 0

        val result = MasterMaestro(transfer, previos)

        assertEquals(0, result)
    }
    @Test
    fun MasterMaestro300() {
        val transfer = 299
        val previos = 0

        val result = MasterMaestro(transfer, previos)

        assertEquals(-300, result)
    }

    @Test
    fun MasterMaestro75000() {
        val transfer = 75_500
        val previos = 0

        val result = MasterMaestro(transfer, previos)

        assertEquals(473, result)
    }

    @Test
    fun MasterMaestro150000() {
        val transfer = 150_500
        val previos = 0

        val result = MasterMaestro(transfer, previos)

        assertEquals(-100, result)
    }

    @Test
    fun MasterMaestro600000() {
        val transfer = 600_500
        val previos = 0

        val result = MasterMaestro(transfer, previos)

        assertEquals(-200, result)
    }

    @Test
    fun VisaMir36() {
        val transfer = 1000
        val previos = 0

        val result = VisaMir(transfer, previos)

        assertEquals(35, result)
    }

    @Test
    fun VisaMir34() {
        val transfer = 10000
        val previos = 0

        val result = VisaMir(transfer, previos)

        assertEquals(75, result)
    }

    @Test
    fun VisaMir150000() {
        val transfer = 150_500
        val previos = 0

        val result = VisaMir(transfer, previos)

        assertEquals(-100, result)
    }

    @Test
    fun VisaMir600000() {
        val transfer = 600_500
        val previos = 0

        val result = VisaMir(transfer, previos)

        assertEquals(-200, result)
    }

    @Test
    fun VKPay40000() {
        val transfer = 40_500
        val previos = 0

        val result = VKPay(transfer, previos)

        assertEquals(-200, result)
    }

    @Test
    fun VKPay15001() {
        val transfer = 15_500
        val previos = 0

        val result = VKPay(transfer, previos)

        assertEquals(-100, result)
    }

    @Test
    fun VKPay15000() {
        val transfer = 14_500
        val previos = 0

        val result = VKPay(transfer, previos)

        assertEquals(0, result)
    }

}