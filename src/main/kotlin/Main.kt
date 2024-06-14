package org.example

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers


fun main() {
    val client: HttpClient = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=612"))
        .build()

    val response = client
        .send(request, BodyHandlers.ofString())

    val json = response.body()

    val meuJogo = Jogo()
    meuJogo.titulo = "LEGO Batman"
    meuJogo.capa = "https:\\/\\/cdn.fanatical.com\\/production\\/product\\/400x225\\/105f34ca-7757-47ad-953e-7df7f016741e.jpeg"

    println(meuJogo)
}