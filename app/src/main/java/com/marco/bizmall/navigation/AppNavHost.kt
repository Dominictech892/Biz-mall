package com.marco.bizmall.navigation

<<<<<<< HEAD
import android.window.SplashScreen
=======
>>>>>>> a33afe81711b2374c0fb5804d562be5a76dd3c3a
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.marco.bizmall.ui.screens.about.AboutScreen
import com.marco.bizmall.ui.screens.category.CategoryScreen
import com.marco.bizmall.ui.screens.contact.ContactScreen
import com.marco.bizmall.ui.screens.home.HomeScreen
import com.marco.bizmall.ui.screens.item.ItemScreen
<<<<<<< HEAD
import com.marco.bizmall.ui.screens.splash.SplashScreen
=======
>>>>>>> a33afe81711b2374c0fb5804d562be5a76dd3c3a

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
<<<<<<< HEAD
    startDestination: String = ROUT_SPLASH

=======
    startDestination: String = ROUT_HOME
>>>>>>> a33afe81711b2374c0fb5804d562be5a76dd3c3a
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_CATEGORY) {
            CategoryScreen(navController)
        }
<<<<<<< HEAD
        composable(ROUT_SPLASH) {
            SplashScreen(navController)

        }
    }
}










=======

    }
}
>>>>>>> a33afe81711b2374c0fb5804d562be5a76dd3c3a
