package com.cristianerazo.playgroundheros.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cristianerazo.playgroundheros.listaNombres
import com.cristianerazo.playgroundheros.listaVillanos

@Composable
fun HeroListScreen(
    onHeroClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    // Guarda la categoría seleccionada.
    var categoria by rememberSaveable {
        mutableIntStateOf(0)
    }

    // Conserva la posición de desplazamiento de cada lista.
    val estadoHeroes = rememberLazyListState()
    val estadoVillanos = rememberLazyListState()

    // Selecciona la lista que se mostrará.
    val personajes = if (categoria == 0) {
        listaNombres
    } else {
        listaVillanos
    }

    val estadoActual = if (categoria == 0) {
        estadoHeroes
    } else {
        estadoVillanos
    }

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // Título de la aplicación.
        Text(
            text = "Playground Heroes",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 16.dp,
                    vertical = 20.dp
                )
        )

        // Subtítulo.
        Text(
            text = "Descubre a tus superhéroes y supervillanos favoritos",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp,
                bottom = 12.dp
            )
        )

        // Pestañas de las categorías.
        PrimaryTabRow(
            selectedTabIndex = categoria
        ) {
            Tab(
                selected = categoria == 0,
                onClick = {
                    categoria = 0
                },
                text = {
                    Text("Superhéroes")
                }
            )

            Tab(
                selected = categoria == 1,
                onClick = {
                    categoria = 1
                },
                text = {
                    Text("Supervillanos")
                }
            )
        }

        // Lista de personajes de la categoría seleccionada.
        LazyColumn(
            state = estadoActual,
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(
                items = personajes,
                key = { personaje -> personaje.id }
            ) { personaje ->
                HeroCard(
                    hero = personaje,
                    onClick = {
                        onHeroClick(personaje.id)
                    }
                )
            }
        }
    }
}