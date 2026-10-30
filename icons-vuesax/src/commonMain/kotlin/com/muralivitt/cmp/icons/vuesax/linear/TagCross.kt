package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.TagCross: ImageVector
    get() {
        if (_TagCross != null) {
            return _TagCross!!
        }
        _TagCross = ImageVector.Builder(
            name = "TagCross",
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
                moveTo(10.28f, 20.25f)
                horizontalLineTo(17f)
                curveTo(19.76f, 20.25f, 22f, 18.01f, 22f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(22f, 5.99f, 19.76f, 3.75f, 17f, 3.75f)
                horizontalLineTo(10.28f)
                curveTo(8.87f, 3.75f, 7.53f, 4.34f, 6.58f, 5.39f)
                lineTo(3.05f, 9.27f)
                curveTo(1.64f, 10.82f, 1.64f, 13.18f, 3.05f, 14.73f)
                lineTo(6.58f, 18.61f)
                curveTo(7.53f, 19.66f, 8.87f, 20.25f, 10.28f, 20.25f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(16f, 14.47f)
                lineTo(11.06f, 9.53f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(11.06f, 14.47f)
                lineTo(16f, 9.53f)
            }
        }.build()

        return _TagCross!!
    }

@Suppress("ObjectPropertyName")
private var _TagCross: ImageVector? = null
