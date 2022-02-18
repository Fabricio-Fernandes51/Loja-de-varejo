class Cliente{

    var nomeCliente:String? = null
    get() = if(field.isNullOrEmpty()) "nome do cliente não informado" else field
    set(value) {
        field = if(value.isNullOrEmpty()) null else value
     }

    var idade:Byte? = null
    set(value) {
        if (value!! >= 0) field = value
    }

    var numeroCliente:String? = null
    get() = if(field.isNullOrEmpty()) "número não informado" else field
    set(value) {
        field =if(value.isNullOrEmpty()) null else value
    }

    var genero:String? = null
    get() =if(field.isNullOrEmpty()) "gênero não informado" else field
    set(value) {
        field = if(value.isNullOrEmpty()) null else value
    }


    var matricula:Int? = null
    get() =if(field!! == 10) null else field
    set(value) {
        field =if(value!! == 10) value else null
    }

    constructor(
        nomeCliente: String,
        idade: Byte,
        numeroCliente: String,
        genero: String,
        matricula: Int
    ){
        this.nomeCliente = nomeCliente
        this.idade = idade
        this.numeroCliente = numeroCliente
        this.genero = genero
        this.matricula = matricula
    }

    override fun toString(): String {
        return "o cliente $nomeCliente informou que a sua idade é $idade e o numero da matrícula é $matricula"
    }


}