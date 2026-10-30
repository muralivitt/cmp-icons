package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.More2: ImageVector
    get() {
        if (_More2 != null) {
            return _More2!!
        }
        _More2 = ImageVector.Builder(
            name = "More2",
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
                moveTo(12f, 9.32f)
                curveTo(13.19f, 9.32f, 14.16f, 8.35f, 14.16f, 7.16f)
                curveTo(14.16f, 5.97f, 13.19f, 5f, 12f, 5f)
                curveTo(10.81f, 5f, 9.84f, 5.97f, 9.84f, 7.16f)
                curveTo(9.84f, 8.35f, 10.81f, 9.32f, 12f, 9.32f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.79f, 19f)
                curveTo(7.98f, 19f, 8.95f, 18.03f, 8.95f, 16.84f)
                curveTo(8.95f, 15.65f, 7.98f, 14.68f, 6.79f, 14.68f)
                curveTo(5.6f, 14.68f, 4.63f, 15.65f, 4.63f, 16.84f)
                curveTo(4.63f, 18.03f, 5.59f, 19f, 6.79f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.21f, 19f)
                curveTo(18.4f, 19f, 19.37f, 18.03f, 19.37f, 16.84f)
                curveTo(19.37f, 15.65f, 18.4f, 14.68f, 17.21f, 14.68f)
                curveTo(16.02f, 14.68f, 15.05f, 15.65f, 15.05f, 16.84f)
                curveTo(15.05f, 18.03f, 16.02f, 19f, 17.21f, 19f)
                close()
            }
        }.build()

        return _More2!!
    }

@Suppress("ObjectPropertyName")
private var _More2: ImageVector? = null
