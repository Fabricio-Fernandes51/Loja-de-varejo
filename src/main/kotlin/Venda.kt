import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*

class Venda {

    var tempoEntrega: LocalTime? = null
        set(value) {
            if (value == null) {
                field = LocalTime.now()
            } else {
                field = value
            }
        }

    var horarioCompra: LocalTime? = null
        set(value) {
            if (value === null) {
                field = LocalTime.now()
            } else {
                field = value

            }
        }
    constructor(
        tempoEntrega: LocalTime,
        horarioCompra: LocalTime
    ){
        this.tempoEntrega = tempoEntrega
        this.horarioCompra = horarioCompra
    }

    override fun toString(): String {
        return "o tempo de entrega é $tempoEntrega pois foi comprado no horário $horarioCompra"
    }


}
