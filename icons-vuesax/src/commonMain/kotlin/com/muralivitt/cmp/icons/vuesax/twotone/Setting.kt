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

val VuesaxIconsTwotone.Setting: ImageVector
    get() {
        if (_Setting != null) {
            return _Setting!!
        }
        _Setting = ImageVector.Builder(
            name = "Setting",
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
                moveTo(3f, 9.11f)
                verticalLineTo(14.88f)
                curveTo(3f, 17f, 3f, 17f, 5f, 18.35f)
                lineTo(10.5f, 21.53f)
                curveTo(11.33f, 22.01f, 12.68f, 22.01f, 13.5f, 21.53f)
                lineTo(19f, 18.35f)
                curveTo(21f, 17f, 21f, 17f, 21f, 14.89f)
                verticalLineTo(9.11f)
                curveTo(21f, 7f, 21f, 7f, 19f, 5.65f)
                lineTo(13.5f, 2.47f)
                curveTo(12.68f, 1.99f, 11.33f, 1.99f, 10.5f, 2.47f)
                lineTo(5f, 5.65f)
                curveTo(3f, 7f, 3f, 7f, 3f, 9.11f)
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
                moveTo(12f, 15f)
                curveTo(13.657f, 15f, 15f, 13.657f, 15f, 12f)
                curveTo(15f, 10.343f, 13.657f, 9f, 12f, 9f)
                curveTo(10.343f, 9f, 9f, 10.343f, 9f, 12f)
                curveTo(9f, 13.657f, 10.343f, 15f, 12f, 15f)
                close()
            }
        }.build()

        return _Setting!!
    }

@Suppress("ObjectPropertyName")
private var _Setting: ImageVector? = null
