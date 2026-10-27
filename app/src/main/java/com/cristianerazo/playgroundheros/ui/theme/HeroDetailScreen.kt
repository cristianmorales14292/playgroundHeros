package com.cristianerazo.playgroundheros.ui.theme


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cristianerazo.playgroundheros.Nombres
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.material3.AssistChip

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Alignment

import com.cristianerazo.playgroundheros.listaVillanos

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun HeroDetailScreen(
    hero: Nombres,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        item {
            Button(
                onClick = onBackClick,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("← Volver a la lista")
            }
        }


        // Encabezado destacado del héroe
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    // Avatar circular con la inicial
                    Box(
                        modifier = Modifier
                            .size(64.dp)
                            .background(
                                color = MaterialTheme.colorScheme.primary,
                                shape = CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = hero.nombre.take(1).uppercase(),
                            style = MaterialTheme.typography.headlineMedium,
                            color = MaterialTheme.colorScheme.onPrimary
                        )
                    }

                    // Identificador y nombre
                    Column {
                        Text(
                            text = if (listaVillanos.any { it.id == hero.id }) {
                                "Villano #${hero.id}"
                            } else {
                                "Héroe #${hero.id}"
                            },
                            style = MaterialTheme.typography.labelLarge,
                            color = MaterialTheme.colorScheme.onPrimaryContainer
                        )

                        Text(
                            text = hero.nombre,
                            style = MaterialTheme.typography.headlineMedium,
                            color = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                    }
                }
            }
        }




        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                )
            ) {
                HeroImage(
                    imageUrl = hero.imagenUrl,
                    contentDescription = "Imagen de ${hero.nombre}"
                )
            }
        }

        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant
                )
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "Sobre este héroe",
                        style = MaterialTheme.typography.titleLarge
                    )

                    Text(
                        text = hero.descripcion,
                        style = MaterialTheme.typography.bodyLarge
                    )

                    Text(
                        text = "Perfil del héroe",
                        style = MaterialTheme.typography.titleMedium
                    )

                    Text(
                        text = heroProfile(hero.superPoderes),
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.primary
                    )

                }
            }
        }

        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 3.dp
                )
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(
                        text = "Estadísticas del héroe",
                        style = MaterialTheme.typography.titleLarge
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text = "Identificador",
                                style = MaterialTheme.typography.labelMedium
                            )
                            Text(
                                text = "#${hero.id}",
                                style = MaterialTheme.typography.titleMedium
                            )
                        }

                        Column {
                            Text(
                                text = "Habilidades",
                                style = MaterialTheme.typography.labelMedium
                            )
                            Text(
                                text = "${hero.superPoderes.size}",
                                style = MaterialTheme.typography.titleMedium
                            )
                        }
                    }

                    Text(
                        text = "Perfil: ${heroProfile(hero.superPoderes)}",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.primary


                    )
                    Text(
                        text = "Nivel: ${heroLevel(hero.superPoderes)}",
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(top = 4.dp)
                    )


                }
            }
        }


// Título de la sección de superpoderes
        item {
            Text(
                text = "Superpoderes",
                style = MaterialTheme.typography.headlineSmall
            )
        }





        // Resumen táctico del héroe
        item {
            val perfil = heroProfile(hero.superPoderes)

            val resumen = when (perfil) {
                "Estratega" ->
                    "Este héroe destaca por su inteligencia y sus habilidades de combate. " +
                            "Puede analizar situaciones y planificar estrategias."

                "Cosmico" ->
                    "Este héroe cuenta con habilidades relacionadas con la energía, " +
                            "lo que puede darle una ventaja en situaciones especiales."

                "Velocista" ->
                    "Este héroe destaca por su velocidad, una capacidad útil " +
                            "para desplazarse rápidamente y reaccionar ante diferentes situaciones."

                else ->
                    "Este héroe se caracteriza por su fuerza, resistencia " +
                            "u otras habilidades que le permiten afrontar distintos desafíos."
            }

            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer
                )
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Resumen táctico",
                        style = MaterialTheme.typography.titleLarge,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    )

                    Text(
                        text = "Perfil: $perfil",
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.padding(top = 8.dp),
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    )

                    Text(
                        text = resumen,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(top = 8.dp),
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                }
            }
        }










// Superpoderes presentados como chips
        item {
            FlowRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                hero.superPoderes.forEach { poder ->
                    AssistChip(
                        onClick = {},
                        label = {
                            Text(text = poder)
                        },
                        leadingIcon = {
                            Text(text = "⚡")
                        }
                    )
                }
            }
        }



        item {
            Button(
                onClick = onBackClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Text("Volver a los superhéroes")
            }
        }
    }
}


private fun heroProfile(superPoderes: List<String>): String = when {
    superPoderes.any {
        it.contains("Inteligencia", ignoreCase = true)
    } &&
            superPoderes.any {
                it.contains("Combate", ignoreCase = true)
            } -> "Estratega"

    superPoderes.any {
        it.contains("Energia", ignoreCase = true)
    } -> "Cósmico"

    superPoderes.any {
        it.contains("velocidad", ignoreCase = true)
    } -> "Velocista"

    else -> "Titán"
}

private fun heroLevel(superPoderes: List<String>): String = when {
    superPoderes.size >= 4 -> "Alto"
    superPoderes.size >= 2 -> "Medio"
    else -> "Básico"
}



