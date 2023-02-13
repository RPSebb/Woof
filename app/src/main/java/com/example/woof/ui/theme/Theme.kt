package com.example.woof.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColorScheme = lightColorScheme(
    primary        = Grey50,
    surface        = White,
    background     = Green100,
    secondary      = Grey700,
    onSurface      = Grey900,
    onPrimary      = Grey900,
    surfaceVariant = Green50
)

private val DarkColorScheme = darkColorScheme(
    primary        = White,
    surface        = Black,
    background     = Cyan900,
    secondary      = Grey900,
    onSurface      = Grey100,
    onPrimary      = Grey100,
    surfaceVariant = Cyan700
)



@Composable
fun WoofTheme(
        darkTheme: Boolean = isSystemInDarkTheme(),
        content: @Composable () -> Unit
) {
    val colorScheme = if(darkTheme) { DarkColorScheme  }
                      else          { LightColorScheme }
    val view = LocalView.current

    SideEffect {
        val window = (view.context as Activity).window
        window.statusBarColor = colorScheme.surface.toArgb()
        WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography  = Typography,
        shapes      = Shapes,
        content     = content
    )
}