package com.albsilva.kotlinfeatures.stdlib

data class Album(val title: String, val year: Int, val ranking: Int, val tracks: List<Track> = listOf())
data class Track(val title: String, val durationInSecounds: Int)

val albums = listOf(Album("The Dark Side of the Moon", 1973, 2,
        listOf(Track("Speak to Me", 90),
                Track("Breathe", 163),
                Track("On he Run", 216),
                Track("Time", 421),
                Track("The Great Gig in the sky", 276),
                Track("Money", 382),
                Track("Us and Them", 462),
                Track("Any Color You Like", 205),
                Track("Brain Damage", 228),
                Track("Eclipse", 123)
        )),
        Album("The Wall", 1979, 3),
        Album("Wish You Were Here", 1975, 1),
        Album("Animals", 1977, 2),
        Album("The Piper at the Gates of Dawn", 1967, 6),
        Album("The Final Cut", 1983, 1),
        Album("Meddle", 1971, 3),
        Album("Atom Heart Mother", 1970, 1),
        Album("Ummagumma", 1969, 5),
        Album("A Sauceful of Secrets", 1968, 9),
        Album("More", 1969, 9))

fun main(args: Array<String>) {
//    for (album in albums) {
//        if (album.ranking == 1) {
//            println(album.title)
//        }
//    }
    // albums.filter { it.ranking == 1 }.forEach { album -> println(album.title) }
    // [a, b ,c] f(x) = f(a), f(b), f(c)
    val titles = albums.filter { it.ranking == 1 }.map { it.title }
    titles.forEach { println(it) }

}