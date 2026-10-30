package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.VolumeCross: ImageVector
    get() {
        if (_VolumeCross != null) {
            return _VolumeCross!!
        }
        _VolumeCross = ImageVector.Builder(
            name = "VolumeCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(2f, 10.16f)
                verticalLineTo(14.16f)
                curveTo(2f, 16.16f, 3f, 17.16f, 5f, 17.16f)
                horizontalLineTo(6.43f)
                curveTo(6.8f, 17.16f, 7.17f, 17.27f, 7.49f, 17.459f)
                lineTo(10.41f, 19.289f)
                curveTo(12.93f, 20.869f, 15f, 19.719f, 15f, 16.75f)
                verticalLineTo(7.569f)
                curveTo(15f, 4.589f, 12.93f, 3.449f, 10.41f, 5.029f)
                lineTo(7.49f, 6.859f)
                curveTo(7.17f, 7.049f, 6.8f, 7.159f, 6.43f, 7.159f)
                horizontalLineTo(5f)
                curveTo(3f, 7.159f, 2f, 8.159f, 2f, 10.16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 14.119f)
                lineTo(18.04f, 10.159f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.96f, 10.2f)
                lineTo(18f, 14.16f)
            }
        }.build()

        return _VolumeCross!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeCross: ImageVector? = null
