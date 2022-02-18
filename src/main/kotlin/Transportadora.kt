import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*

class Transportadora {
    var nomeTransportadora: String? = null
        get() = if (field.isNullOrEmpty()) "Nome da transportadora não inserido" else field
        set(value) {
            if (value.isNullOrEmpty()) null else value
        }

    var endereco: String? = null
        get() = if (field.isNullOrEmpty()) "Nome do endereço não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var horarioFuncionamento: LocalTime? = null
        set(value) {
            if (value == null) {
                field = LocalTime.now()
            } else {
                field = value
            }
        }


    var numeroDeEntregadores: String? = null
        get() = if (field.isNullOrEmpty()) "Números de entregadores não informado" else field
        set(value) {
            field = if (value?.length == 3) null else value
        }

    constructor(
        nomeTransportadora: String,
        endereco: String,
        horarioFuncionamento: LocalTime,
        numeroDeEntregadores: String
    ){
        this.nomeTransportadora = nomeTransportadora
        this.endereco = endereco
        this.horarioFuncionamento = horarioFuncionamento
        this.numeroDeEntregadores = numeroDeEntregadores
    }

    override fun toString(): String {
        return "a transportadora $nomeTransportadora informou que horário de entrega é apenas até $horarioFuncionamento por conta de ter apenas $numeroDeEntregadores entregadores"
    }

}

