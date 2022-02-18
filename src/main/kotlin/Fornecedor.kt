class Fornecedor {
    var nomeFornecedor: String? = null
        get() = if (field.isNullOrEmpty()) "nome do fornecedor não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var enderecoFornecedor: String? = null
        get() = if (field.isNullOrEmpty()) "endereço do fornecedor não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var telefoneFornecedor: String? = null
        get() = if (field.isNullOrEmpty()) "telefone não informado" else field
        set(value) {
            field = if (value?.length == 11) null else value
        }

    var email: String? = null
        get() = if (field.isNullOrEmpty()) "email não informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }

    var cnpj: String? = null
        get() = if (field.isNullOrEmpty()) "CNPJ não informado" else field
        set(value) {
            field = if (value?.length == 14) null else value
        }

    constructor(
        nomeFornecedor: String,
        enderecoFornecedor: String,
        telefoneFornecedor: String,
        email: String,
        cnpj: String
    ) {
        this.nomeFornecedor = nomeFornecedor
        this.enderecoFornecedor = enderecoFornecedor
        this.telefoneFornecedor = telefoneFornecedor
        this.email = email
        this.cnpj = cnpj

    }

    override fun toString(): String {
        return "o fornecedor $nomeFornecedor informou que o endereço é na $enderecoFornecedor e o cnpj é $cnpj"
    }


}