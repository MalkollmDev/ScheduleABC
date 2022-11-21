package com.malkollm.scheduleabc.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.malkollm.scheduleabc.Screen
import com.malkollm.scheduleabc.components.auth.*

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }
        composable(
            route = Screen.ResetPass.route
        ) {
            ResetPassScreen(navController = navController)
        }
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Schedule.route
        ) {
            ScheduleScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route
        ) {
            DetailScreen()
        }
    }
}