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

val VuesaxIconsTwotone.ShieldSearch: ImageVector
    get() {
        if (_ShieldSearch != null) {
            return _ShieldSearch!!
        }
        _ShieldSearch = ImageVector.Builder(
            name = "ShieldSearch",
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
                moveTo(20.59f, 10.55f)
                verticalLineTo(7.12f)
                curveTo(20.59f, 5.89f, 19.65f, 4.53f, 18.5f, 4.1f)
                lineTo(13.51f, 2.23f)
                curveTo(12.68f, 1.92f, 11.32f, 1.92f, 10.49f, 2.23f)
                lineTo(5.5f, 4.11f)
                curveTo(4.35f, 4.54f, 3.41f, 5.9f, 3.41f, 7.12f)
                verticalLineTo(14.55f)
                curveTo(3.41f, 15.73f, 4.19f, 17.28f, 5.14f, 17.99f)
                lineTo(9.44f, 21.2f)
                curveTo(10.14f, 21.74f, 11.07f, 22f, 12f, 22f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 20f)
                curveTo(18.209f, 20f, 20f, 18.209f, 20f, 16f)
                curveTo(20f, 13.791f, 18.209f, 12f, 16f, 12f)
                curveTo(13.791f, 12f, 12f, 13.791f, 12f, 16f)
                curveTo(12f, 18.209f, 13.791f, 20f, 16f, 20f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.996f, 21f)
                horizontalLineTo(21.004f)
            }
        }.build()

        return _ShieldSearch!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSearch: ImageVector? = null
