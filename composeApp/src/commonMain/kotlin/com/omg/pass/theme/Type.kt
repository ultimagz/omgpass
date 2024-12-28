import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import omgpass.composeapp.generated.resources.NotoSansThai_ExtraLight
import omgpass.composeapp.generated.resources.NotoSansThai_Light
import omgpass.composeapp.generated.resources.NotoSansThai_Thin
import omgpass.composeapp.generated.resources.NotoSansThai_Regular
import omgpass.composeapp.generated.resources.NotoSansThai_Medium
import omgpass.composeapp.generated.resources.NotoSansThai_SemiBold
import omgpass.composeapp.generated.resources.NotoSansThai_Bold
import omgpass.composeapp.generated.resources.NotoSansThai_ExtraBold
import omgpass.composeapp.generated.resources.NotoSansThai_Black
import omgpass.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun BodyFontFamily() = FontFamily(
    Font(Res.font.NotoSansThai_Thin, weight = FontWeight.Thin),
    Font(Res.font.NotoSansThai_ExtraLight, weight = FontWeight.ExtraLight),
    Font(Res.font.NotoSansThai_Light, weight = FontWeight.Light),
    Font(Res.font.NotoSansThai_Regular, weight = FontWeight.Normal),
    Font(Res.font.NotoSansThai_Medium, weight = FontWeight.Medium),
    Font(Res.font.NotoSansThai_SemiBold, weight = FontWeight.SemiBold),
    Font(Res.font.NotoSansThai_Bold, weight = FontWeight.Bold),
    Font(Res.font.NotoSansThai_ExtraBold, weight = FontWeight.ExtraBold),
    Font(Res.font.NotoSansThai_Black, weight = FontWeight.Black),
)

@Composable
fun DisplayFontFamily() = FontFamily(
    Font(Res.font.NotoSansThai_Thin, weight = FontWeight.Thin),
    Font(Res.font.NotoSansThai_ExtraLight, weight = FontWeight.ExtraLight),
    Font(Res.font.NotoSansThai_Light, weight = FontWeight.Light),
    Font(Res.font.NotoSansThai_Regular, weight = FontWeight.Normal),
    Font(Res.font.NotoSansThai_Medium, weight = FontWeight.Medium),
    Font(Res.font.NotoSansThai_SemiBold, weight = FontWeight.SemiBold),
    Font(Res.font.NotoSansThai_Bold, weight = FontWeight.Bold),
    Font(Res.font.NotoSansThai_ExtraBold, weight = FontWeight.ExtraBold),
    Font(Res.font.NotoSansThai_Black, weight = FontWeight.Black),
)

@Composable
fun AppTypography() = Typography().run {
    val baseline = Typography()
    val displayFontFamily = DisplayFontFamily()
    val bodyFontFamily = BodyFontFamily()
    copy(
        displayLarge = baseline.displayLarge.copy(fontFamily = displayFontFamily),
        displayMedium = baseline.displayMedium.copy(fontFamily = displayFontFamily),
        displaySmall = baseline.displaySmall.copy(fontFamily = displayFontFamily),
        headlineLarge = baseline.headlineLarge.copy(fontFamily = displayFontFamily),
        headlineMedium = baseline.headlineMedium.copy(fontFamily = displayFontFamily),
        headlineSmall = baseline.headlineSmall.copy(fontFamily = displayFontFamily),
        titleLarge = baseline.titleLarge.copy(fontFamily = displayFontFamily),
        titleMedium = baseline.titleMedium.copy(fontFamily = displayFontFamily),
        titleSmall = baseline.titleSmall.copy(fontFamily = displayFontFamily),
        bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFontFamily),
        bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFontFamily),
        bodySmall = baseline.bodySmall.copy(fontFamily = bodyFontFamily),
        labelLarge = baseline.labelLarge.copy(fontFamily = bodyFontFamily),
        labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily),
        labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily),
    )
}
