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

val VuesaxIconsTwotone.ShieldSlash: ImageVector
    get() {
        if (_ShieldSlash != null) {
            return _ShieldSlash!!
        }
        _ShieldSlash = ImageVector.Builder(
            name = "ShieldSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.84f, 20.02f)
                lineTo(9.43f, 21.21f)
                curveTo(10.84f, 22.27f, 13.16f, 22.27f, 14.57f, 21.21f)
                lineTo(18.87f, 18f)
                curveTo(19.82f, 17.29f, 20.6f, 15.74f, 20.6f, 14.56f)
                verticalLineTo(7.12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.98f, 4.34f)
                curveTo(18.83f, 4.25f, 18.67f, 4.17f, 18.51f, 4.1f)
                lineTo(13.52f, 2.23f)
                curveTo(12.69f, 1.92f, 11.33f, 1.92f, 10.5f, 2.23f)
                lineTo(5.5f, 4.11f)
                curveTo(4.35f, 4.54f, 3.41f, 5.9f, 3.41f, 7.12f)
                verticalLineTo(14.55f)
                curveTo(3.41f, 15.73f, 4.19f, 17.28f, 5.14f, 17.99f)
                lineTo(5.34f, 18.14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
        }.build()

        return _ShieldSlash!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSlash: ImageVector? = null
