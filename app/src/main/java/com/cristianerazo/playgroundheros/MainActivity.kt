
package com.cristianerazo.playgroundheros


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.cristianerazo.playgroundheros.ui.theme.HeroDetailScreen
import com.cristianerazo.playgroundheros.ui.theme.HeroListScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "home"
                    ) {

                        composable("home") {

                            HeroListScreen(
                                onHeroClick = { heroId ->
                                    navController.navigate("detail/$heroId")
                                }
                            )
                        }

                        composable(
                            route = "detail/{heroId}",
                            arguments = listOf(
                                navArgument("heroId") {
                                    type = NavType.IntType
                                }
                            )
                        ) { backStackEntry ->

                            val heroId = backStackEntry.arguments
                                ?.getInt("heroId")

                            val hero = listaPersonajes.find { it.id == heroId }

                            if (hero != null) {
                                HeroDetailScreen(
                                    hero = hero,
                                    onBackClick = {
                                        navController.popBackStack()
                                    }
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
