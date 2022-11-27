package com.example.peliculas


class FilmProvider{
    companion object{
        val film = listOf<Film>(
            Film(
                film = "El señor de los anillos",
                director = "Peter Jackson",
                year = 2001,
                photo = "https://es.web.img3.acsta.net/pictures/22/10/04/16/26/1929878.jpg"
            ),
            Film(
                film = "El padrino",
                director = "Francis Ford Coppola",
                year = 1972,
                photo = "https://es.web.img3.acsta.net/pictures/18/06/12/12/12/0117051.jpg?coixp=49&coiyp=27"
            ),
            Film(
                film = "El Padrino II",
                director = "Francis Ford Coppola",
                year = 1974,
                photo = "https://4.bp.blogspot.com/-N1lJVHeuY4g/VTKhqGGr4dI/AAAAAAAAo10/1lEXuBK-pLo/s1600/CSF3-El_padrino-Parte_2-Poster.jpg"
            ),
            Film(
                film = "El Padrino III",
                director = "Francis Ford Coppola",
                year = 1990,
                photo = "https://www.cityam.com/wp-content/uploads/2020/12/godfather-coda.jpg?w=742"
            ),
            Film(
                film = "El bueno, el feo y el malo",
                director = "Sergio Leone",
                year = 1966,
                photo = "https://www.mubis.es/media/releases/8721/Cl/el-bueno-el-feo-y-el-malo-edicion-especial-blu-ray-l_cover.jpg"
            ),
        )
    }
}