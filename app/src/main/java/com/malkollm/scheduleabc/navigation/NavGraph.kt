package com.malkollm.scheduleabc.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.malkollm.scheduleabc.Screen
import com.malkollm.scheduleabc.components.auth.DetailScreen
import com.malkollm.scheduleabc.components.auth.HomeScreen
import com.malkollm.scheduleabc.components.auth.LoginScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route
        ) {
            DetailScreen()
        }
    }
}