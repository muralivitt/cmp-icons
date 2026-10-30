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

val VuesaxIconsTwotone.Frame3: ImageVector
    get() {
        if (_Frame3 != null) {
            return _Frame3!!
        }
        _Frame3 = ImageVector.Builder(
            name = "Frame3",
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
                moveTo(19.26f, 18.9f)
                verticalLineTo(7.1f)
                curveTo(19.26f, 5.6f, 18.62f, 5f, 17.03f, 5f)
                horizontalLineTo(15.99f)
                curveTo(14.4f, 5f, 13.76f, 5.6f, 13.76f, 7.1f)
                verticalLineTo(18.9f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.26f, 18.9f)
                verticalLineTo(12.1f)
                curveTo(5.26f, 10.6f, 5.9f, 10f, 7.49f, 10f)
                horizontalLineTo(8.53f)
                curveTo(10.12f, 10f, 10.76f, 10.6f, 10.76f, 12.1f)
                verticalLineTo(18.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 19f)
                horizontalLineTo(22f)
            }
        }.build()

        return _Frame3!!
    }

@Suppress("ObjectPropertyName")
private var _Frame3: ImageVector? = null
