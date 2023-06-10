package com.ifkusyoba.compose_app.navigation

sealed class Screen(val route: String){
    object SplashScreen: Screen("splash_screen")
    object Dashboard: Screen("dashboard")
    object HitungScreen: Screen("hitung_screen")
}