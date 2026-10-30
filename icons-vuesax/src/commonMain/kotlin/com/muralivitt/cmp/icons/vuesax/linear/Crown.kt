package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Crown: ImageVector
    get() {
        if (_Crown != null) {
            return _Crown!!
        }
        _Crown = ImageVector.Builder(
            name = "Crown",
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
                moveTo(2f, 15.29f)
                verticalLineTo(5.71f)
                curveTo(2f, 4.38f, 2.77f, 4.06f, 3.71f, 5f)
                lineTo(6.3f, 7.59f)
                curveTo(6.69f, 7.98f, 7.33f, 7.98f, 7.71f, 7.59f)
                lineTo(11.29f, 4f)
                curveTo(11.68f, 3.61f, 12.32f, 3.61f, 12.7f, 4f)
                lineTo(16.29f, 7.59f)
                curveTo(16.68f, 7.98f, 17.32f, 7.98f, 17.7f, 7.59f)
                lineTo(20.29f, 5f)
                curveTo(21.23f, 4.06f, 22f, 4.38f, 22f, 5.71f)
                verticalLineTo(15.3f)
                curveTo(22f, 18.3f, 20f, 20.3f, 17f, 20.3f)
                horizontalLineTo(7f)
                curveTo(4.24f, 20.29f, 2f, 18.05f, 2f, 15.29f)
                close()
            }
        }.build()

        return _Crown!!
    }

@Suppress("ObjectPropertyName")
private var _Crown: ImageVector? = null
