package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.VolumeUp: ImageVector
    get() {
        if (_VolumeUp != null) {
            return _VolumeUp!!
        }
        _VolumeUp = ImageVector.Builder(
            name = "VolumeUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(2f, 9.96f)
                verticalLineTo(14.04f)
                curveTo(2f, 16.08f, 3.02f, 17.1f, 5.06f, 17.1f)
                horizontalLineTo(6.52f)
                curveTo(6.9f, 17.1f, 7.28f, 17.21f, 7.6f, 17.41f)
                lineTo(10.58f, 19.27f)
                curveTo(13.16f, 20.88f, 15.26f, 19.71f, 15.26f, 16.67f)
                verticalLineTo(7.32f)
                curveTo(15.26f, 4.28f, 13.15f, 3.11f, 10.58f, 4.72f)
                lineTo(7.6f, 6.59f)
                curveTo(7.27f, 6.79f, 6.9f, 6.9f, 6.52f, 6.9f)
                horizontalLineTo(5.06f)
                curveTo(3.02f, 6.9f, 2f, 7.92f, 2f, 9.96f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 14f)
                verticalLineTo(10f)
            }
        }.build()

        return _VolumeUp!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeUp: ImageVector? = null
