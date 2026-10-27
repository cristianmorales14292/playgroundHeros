
package com.cristianerazo.playgroundheros

// Lista independiente de supervillanos.
// Los identificadores del 51 al 70 no se repiten
// con los identificadores de los superhéroes.

val listaVillanos = listOf(
    Nombres(
        id = 51,
        nombre = "Joker",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/370-joker.jpg",
        descripcion = "Joker es un villano de DC Comics y uno de los principales enemigos de Batman en Gotham City.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Combate experto",
            "Uso de toxinas"
        )
    ),
    Nombres(
        id = 52,
        nombre = "Lex Luthor",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/405-lex-luthor.jpg",
        descripcion = "Lex Luthor es un villano de DC Comics que utiliza su inteligencia y tecnología para enfrentarse a Superman.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Armadura tecnológica",
            "Combate experto"
        )
    ),
    Nombres(
        id = 53,
        nombre = "Darkseid",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/204-darkseid.jpg",
        descripcion = "Darkseid es un villano de DC Comics, gobernante de Apokolips y enemigo de la Liga de la Justicia.",
        superPoderes = listOf(
            "Super fuerza",
            "Alta resistencia",
            "Energía o poder especial",
            "Rayos Omega"
        )
    ),
    Nombres(
        id = 54,
        nombre = "Brainiac",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/136-brainiac.jpg",
        descripcion = "Brainiac es un villano de DC Comics que emplea tecnología avanzada para coleccionar ciudades y conocimiento.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Super fuerza",
            "Alta resistencia",
            "Tecnología avanzada"
        )
    ),
    Nombres(
        id = 55,
        nombre = "Doomsday",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/230-doomsday.jpg",
        descripcion = "Doomsday es un villano de DC Comics que se enfrenta a Superman con una enorme fuerza y resistencia.",
        superPoderes = listOf(
            "Super fuerza",
            "Super velocidad",
            "Alta resistencia",
            "Regeneración"
        )
    ),
    Nombres(
        id = 56,
        nombre = "Sinestro",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/601-sinestro.jpg",
        descripcion = "Sinestro es un villano de DC Comics que utiliza el poder del miedo mediante su anillo amarillo.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Energía o poder especial",
            "Vuelo",
            "Construcciones de energía"
        )
    ),
    Nombres(
        id = 57,
        nombre = "Black Manta",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/105-black-manta.jpg",
        descripcion = "Black Manta es un villano de DC Comics y enemigo de Aquaman que utiliza un traje de combate submarino.",
        superPoderes = listOf(
            "Combate experto",
            "Tecnología submarina",
            "Rayos ópticos"
        )
    ),
    Nombres(
        id = 58,
        nombre = "Deathstroke",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/216-deathstroke.jpg",
        descripcion = "Deathstroke es un villano de DC Comics, mercenario y adversario de los Jóvenes Titanes.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Combate experto",
            "Alta resistencia",
            "Regeneración"
        )
    ),
    Nombres(
        id = 59,
        nombre = "Bane",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/60-bane.jpg",
        descripcion = "Bane es un villano de DC Comics que combina estrategia, combate y fuerza para enfrentarse a Batman.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Super fuerza",
            "Combate experto",
            "Alta resistencia"
        )
    ),
    Nombres(
        id = 60,
        nombre = "Scarecrow",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/576-scarecrow.jpg",
        descripcion = "Scarecrow es un villano de DC Comics conocido como el Espantapájaros, que usa toxinas para provocar miedo.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Toxinas del miedo",
            "Manipulación psicológica"
        )
    ),
    Nombres(
        id = 61,
        nombre = "Thanos",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/655-thanos.jpg",
        descripcion = "Thanos es un villano de Marvel Comics que busca las Gemas del Infinito y se enfrenta a los Vengadores.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Super fuerza",
            "Alta resistencia",
            "Energía o poder especial"
        )
    ),
    Nombres(
        id = 62,
        nombre = "Loki",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/414-loki.jpg",
        descripcion = "Loki es un personaje de Marvel Comics que actúa como adversario de Thor mediante magia y engaños.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Energía o poder especial",
            "Ilusiones",
            "Cambio de forma"
        )
    ),
    Nombres(
        id = 63,
        nombre = "Ultron",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/680-ultron.jpg",
        descripcion = "Ultron es un villano de Marvel Comics, una inteligencia artificial que se enfrenta a los Vengadores.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Super fuerza",
            "Alta resistencia",
            "Energía o poder especial"
        )
    ),
    Nombres(
        id = 64,
        nombre = "Magneto",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/423-magneto.jpg",
        descripcion = "Magneto es un personaje de Marvel Comics que controla el magnetismo y ha sido adversario de los X-Men.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Energía o poder especial",
            "Control del magnetismo",
            "Campos de fuerza"
        )
    ),
    Nombres(
        id = 65,
        nombre = "Doctor Doom",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/222-doctor-doom.jpg",
        descripcion = "Doctor Doom es un villano de Marvel Comics, gobernante de Latveria y enemigo de los Cuatro Fantásticos.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Super fuerza",
            "Alta resistencia",
            "Energía o poder especial"
        )
    ),
    Nombres(
        id = 66,
        nombre = "Green Goblin",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/299-green-goblin.jpg",
        descripcion = "Green Goblin es un villano de Marvel Comics conocido como el Duende Verde y enemigo de Spider-Man.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Super fuerza",
            "Combate experto",
            "Armas tecnológicas"
        )
    ),
    Nombres(
        id = 67,
        nombre = "Venom",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/687-venom.jpg",
        descripcion = "Venom es un personaje de Marvel Comics, rival de Spider-Man, que obtiene sus habilidades de un simbionte.",
        superPoderes = listOf(
            "Super fuerza",
            "Alta resistencia",
            "Regeneración",
            "Redes simbióticas"
        )
    ),
    Nombres(
        id = 68,
        nombre = "Red Skull",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/550-red-skull.jpg",
        descripcion = "Red Skull es un villano de Marvel Comics conocido como Cráneo Rojo y enemigo de Captain America.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Combate experto",
            "Estrategia militar"
        )
    ),
    Nombres(
        id = 69,
        nombre = "Kingpin",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/391-kingpin.jpg",
        descripcion = "Kingpin es un villano de Marvel Comics, líder criminal de Nueva York y enemigo de Daredevil y Spider-Man.",
        superPoderes = listOf(
            "Inteligencia superior",
            "Combate experto",
            "Gran fuerza física"
        )
    ),
    Nombres(
        id = 70,
        nombre = "Apocalypse",
        imagenUrl = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/35-apocalypse.jpg",
        descripcion = "Apocalypse es un villano de Marvel Comics, un antiguo mutante que se enfrenta a los X-Men.",
        superPoderes = listOf(
            "Super fuerza",
            "Alta resistencia",
            "Energía o poder especial",
            "Cambio de forma"
        )
    )
)

val listaPersonajes = listaNombres + listaVillanos