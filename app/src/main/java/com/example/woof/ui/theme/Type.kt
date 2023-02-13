package com.example.woof.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.woof.R


val AbrilFatFace = FontFamily(Font(R.font.abril_fatface_regular))
val Montserrat   = FontFamily(
        Font(R.font.montserrat_bold),
        Font(R.font.montserrat_regular)
)

// Set of Material typography styles to start with
val Typography = Typography(
        displayLarge = TextStyle(
                fontFamily = AbrilFatFace,
                fontWeight = FontWeight.Normal,
                fontSize = 30.sp
        ),
        displayMedium = TextStyle(
                fontFamily = Montserrat,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
        ),
        displaySmall = TextStyle(
                fontFamily = Montserrat,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
        ),
        bodyLarge = TextStyle(
                fontFamily = Montserrat,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp
        )
)