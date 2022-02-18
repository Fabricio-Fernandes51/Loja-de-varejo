import java.time.LocalDateTime

class Produto {
    var nomeProduto: String? = null
        get() = if (field.isNullOrEmpty()) "Nome do produto não informado" else field
        set(value) {
            if (value.isNullOrEmpty()) null else value
        }

    var codigoProduto: String? = null
        get() = if (field.isNullOrEmpty()) "Codigo não informado" else field
        set(value) {
            if (value?.length == 10) null else value
        }

    var tipoProduto: String? = null
        get() = if (field.isNullOrEmpty()) "Tipo do produto não informado" else field
        set(value) {
            if (value.isNullOrEmpty()) null else value
        }

    var valorProduto: String? = null
        get() = if (field.isNullOrEmpty()) "Valor do produto não informado" else field
        set(value) {
            if (field.isNullOrEmpty()) null else value
        }

    var vencimento: LocalDateTime? = null
        set(value) {
            if (value == null) {
                field = LocalDateTime.now()
            } else {
                field = value
            }
        }

    constructor(
        nomeProduto: String,
        codigoProduto: String,
        tipoProduto: String,
        valorProduto: String,
        vencimento: LocalDateTime,
    ) {
        this.nomeProduto = nomeProduto
        this.codigoProduto = codigoProduto
        this.tipoProduto = tipoProduto
        this.valorProduto = valorProduto
        this.vencimento = vencimento
    }

    override fun toString(): String {
        return "o produto $nomeProduto com o código $codigoProduto tem o valor de $valorProduto e vencimento em $vencimento"
    }

}