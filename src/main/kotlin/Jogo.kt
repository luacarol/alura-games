package org.example

class Jogo {
    var titulo = ""
    var capa = ""
    val descricao = "Jogo ..."

    override fun toString(): String {
        return "Meu Jogo:\n" +
                "Titulo: $titulo\n" +
                "Capa: $capa\n" +
                "Descricao: $descricao"
    }
}