package com.cassiolucianodasilva.list_movies_coroutines.ui.main

class MainRepository {

    //Retornar uma lista de filmes,  chamada assíncrona usando Thread java
    fun getFilmes(callback: (filmes: List<Filme>) -> Unit) {
        Thread(Runnable {
            Thread.sleep(3000)
            callback.invoke(
                listOf(
                    Filme(
                        1,
                        "Bright",
                        "Bright é um filme norte americano de crime," +
                                " ação e fantasia de 2017 dirigido por David Ayer e escrito por Max Landis. O filme mostra Will Smith como um policial de Los Angeles que se junta com " +
                                "um policial Orc em um mundo de criaturas humanas e míticas.",
                        "Ação/Fantasia "
                    ),
                    Filme(
                        2,
                        "Veronica",
                        "Jovem tenta, sem sucesso, entrar em contato com seu pai falecido. Depois de jogar Ouija com seus amigos," +
                                " ela passa a ser assediada por terríveis presenças sobrenaturais que ameaçam toda sua família.",
                        "Terror/Drama"
                    )
                )
            )
        }).start()
    }


}