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

val VuesaxIconsTwotone.MainComponent: ImageVector
    get() {
        if (_MainComponent != null) {
            return _MainComponent!!
        }
        _MainComponent = ImageVector.Builder(
            name = "MainComponent",
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
                moveTo(20.95f, 14.55f)
                lineTo(14.56f, 20.94f)
                curveTo(13.16f, 22.34f, 10.86f, 22.34f, 9.45f, 20.94f)
                lineTo(3.06f, 14.55f)
                curveTo(1.66f, 13.15f, 1.66f, 10.85f, 3.06f, 9.44f)
                lineTo(9.45f, 3.05f)
                curveTo(10.85f, 1.65f, 13.15f, 1.65f, 14.56f, 3.05f)
                lineTo(20.95f, 9.44f)
                curveTo(22.35f, 10.85f, 22.35f, 13.15f, 20.95f, 14.55f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.25f, 6.25f)
                lineTo(17.75f, 17.75f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.75f, 6.25f)
                lineTo(6.25f, 17.75f)
            }
        }.build()

        return _MainComponent!!
    }

@Suppress("ObjectPropertyName")
private var _MainComponent: ImageVector? = null
