package com.cristianerazo.playgroundheros.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cristianerazo.playgroundheros.Nombres

@Composable
fun HeroCard(
    hero: Nombres,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Column {

            HeroImage(
                imageUrl = hero.imagenUrl,
                contentDescription = "Imagen de ${hero.nombre}"
            )

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Text(
                    text = hero.nombre,
                    style = MaterialTheme.typography.titleLarge
                )

                Text(
                    text = hero.descripcion,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}