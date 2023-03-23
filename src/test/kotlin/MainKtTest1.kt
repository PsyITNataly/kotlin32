import org.junit.Test
import kotlin.test.assertEquals

class MainKtTest1 {

    @Test
    fun commissionMasterCart() {
        val typeCart = "MasterCart"

        val result = commission(typeCart)

        assertEquals(0, result)
    }

    @Test
    fun commissionMaestro() {
        val typeCart = "Maestro"

        val result = commission(typeCart)

        assertEquals(0, result)
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

}