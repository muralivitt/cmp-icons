package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.Pet: ImageVector
    get() {
        if (_Pet != null) {
            return _Pet!!
        }
        _Pet = ImageVector.Builder(
            name = "Pet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.411f, 16.75f)
                curveTo(4.171f, 19.64f, 6.351f, 22f, 9.251f, 22f)
                horizontalLineTo(14.041f)
                curveTo(17.301f, 22f, 19.541f, 19.37f, 19.001f, 16.15f)
                curveTo(18.431f, 12.77f, 15.171f, 10f, 11.741f, 10f)
                curveTo(8.021f, 10f, 4.721f, 13.04f, 4.411f, 16.75f)
                close()
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.471f, 7.5f)
                curveTo(11.851f, 7.5f, 12.971f, 6.381f, 12.971f, 5f)
                curveTo(12.971f, 3.619f, 11.851f, 2.5f, 10.471f, 2.5f)
                curveTo(9.09f, 2.5f, 7.971f, 3.619f, 7.971f, 5f)
                curveTo(7.971f, 6.381f, 9.09f, 7.5f, 10.471f, 7.5f)
                close()
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.301f, 8.7f)
                curveTo(18.405f, 8.7f, 19.301f, 7.805f, 19.301f, 6.7f)
                curveTo(19.301f, 5.596f, 18.405f, 4.7f, 17.301f, 4.7f)
                curveTo(16.196f, 4.7f, 15.301f, 5.596f, 15.301f, 6.7f)
                curveTo(15.301f, 7.805f, 16.196f, 8.7f, 17.301f, 8.7f)
                close()
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12.7f)
                curveTo(21.828f, 12.7f, 22.5f, 12.029f, 22.5f, 11.2f)
                curveTo(22.5f, 10.372f, 21.828f, 9.7f, 21f, 9.7f)
                curveTo(20.172f, 9.7f, 19.5f, 10.372f, 19.5f, 11.2f)
                curveTo(19.5f, 12.029f, 20.172f, 12.7f, 21f, 12.7f)
                close()
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.971f, 10.7f)
                curveTo(5.075f, 10.7f, 5.971f, 9.805f, 5.971f, 8.7f)
                curveTo(5.971f, 7.596f, 5.075f, 6.7f, 3.971f, 6.7f)
                curveTo(2.866f, 6.7f, 1.971f, 7.596f, 1.971f, 8.7f)
                curveTo(1.971f, 9.805f, 2.866f, 10.7f, 3.971f, 10.7f)
                close()
            }
        }.build()

        return _Pet!!
    }

@Suppress("ObjectPropertyName")
private var _Pet: ImageVector? = null
