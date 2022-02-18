import java.time.LocalTime
import kotlin.time.milliseconds

class Vendedor {
    var nomeVendedor: String? = null
        get() = if (field.isNullOrEmpty()) "Nome do vendendor não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var enderecoVendedor: String? = null
        get() = if (field.isNullOrEmpty()) "Endereço não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else field
        }

    var telefoneVendedor: String? = null
        get() = if (field.isNullOrEmpty()) "Número do vendedor não inforamdo" else field
        set(value) {
            field = if (value?.length == 11) null else value
        }
    var idade:Byte? = null
        set(value) {
            if (value!! >= 0) field = value
        }
    var email: String? = null
        get() = if (field.isNullOrEmpty()) "E-mail não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var genero: String? = null
        get() = if (field.isNullOrEmpty()) "Gênero não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var cpf: String? = null
        get() = if (field.isNullOrEmpty()) "cpf não informado" else field
        set(value) {
            field = if (value?.length == 11) null else value
        }

    var cargaHoraria: LocalTime? = null
        set(value) {
            if (value === null) {
                field = LocalTime.now()
            } else {
                field = value

            }
        }

    constructor(
        nomeVendedor: String,
        enderecoVendedor: String,
        telefoneVendedor: String,
        idade: Byte,
        email: String,
        genero: String,
        cpf: String,
        cargaHoraria: LocalTime
    ) {
        this.nomeVendedor = nomeVendedor
        this.enderecoVendedor = enderecoVendedor
        this.telefoneVendedor = telefoneVendedor
        this.idade = idade
        this.email = email
        this.genero = genero
        this.cpf = cpf
        this.cargaHoraria = cargaHoraria

    }

    override fun toString(): String {
        return "o vendedor $nomeVendedor informou pelo telefone $telefoneVendedor que sua idade é $idade, seu email é $email e seu cpf é $cpf"

    }

}