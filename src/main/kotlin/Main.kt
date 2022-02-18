import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*

fun main(args: Array<String>) {

    val Transportadora = Transportadora(
        nomeTransportadora = "Transporte",
        endereco = "ilha de pascoa",
        horarioFuncionamento = LocalTime.of(12,30),
        numeroDeEntregadores = "3"
    )

    val Cliente = Cliente(
        nomeCliente = "Fabricio",
        idade = 18,
        numeroCliente = "123456789",
        genero = "masculino",
        matricula = 1234567891
    )

    val Venda = Venda(
        tempoEntrega = LocalTime.of(10,30),
        horarioCompra = LocalTime.of(12,30),
    )

    val Produto = Produto(
        nomeProduto = "Bolacha recheada",
        codigoProduto = "1234567891",
        tipoProduto = "comida",
        valorProduto = "2,00",
        vencimento = LocalDateTime.of(2022,5,21,0,0)
    )

    val Fornecedor = Fornecedor(
        nomeFornecedor = "Claudio",
        enderecoFornecedor = "Pais das Maravilhas",
        telefoneFornecedor = "12345678912",
        email = "transporte.fr@gmail.com",
        cnpj = "10.310.915/0001-55"
    )

    val Vendedor = Vendedor(
        nomeVendedor = "Ana Costa",
        enderecoVendedor = "Villajer",
        telefoneVendedor = "123456789",
        idade = 21,
        email = "costana.dp@gmail.com",
        genero = "fem",
        cpf = "065.456.998-10",
        cargaHoraria = LocalTime.of(6,0)
    )

}









