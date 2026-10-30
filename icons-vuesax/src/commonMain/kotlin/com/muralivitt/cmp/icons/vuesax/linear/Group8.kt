package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Group8: ImageVector
    get() {
        if (_Group8 != null) {
            return _Group8!!
        }
        _Group8 = ImageVector.Builder(
            name = "Group8",
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
                moveTo(14.9f, 2f)
                horizontalLineTo(9.1f)
                curveTo(8.42f, 2f, 7.46f, 2.4f, 6.98f, 2.88f)
                lineTo(2.88f, 6.98f)
                curveTo(2.4f, 7.46f, 2f, 8.42f, 2f, 9.1f)
                verticalLineTo(14.9f)
                curveTo(2f, 15.58f, 2.4f, 16.54f, 2.88f, 17.02f)
                lineTo(6.98f, 21.12f)
                curveTo(7.46f, 21.6f, 8.42f, 22f, 9.1f, 22f)
                horizontalLineTo(14.9f)
                curveTo(15.58f, 22f, 16.54f, 21.6f, 17.02f, 21.12f)
                lineTo(21.12f, 17.02f)
                curveTo(21.6f, 16.54f, 22f, 15.58f, 22f, 14.9f)
                verticalLineTo(9.1f)
                curveTo(22f, 8.42f, 21.6f, 7.46f, 21.12f, 6.98f)
                lineTo(17.02f, 2.88f)
                curveTo(16.54f, 2.4f, 15.58f, 2f, 14.9f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.94f, 19.08f)
                lineTo(19.08f, 4.94f)
            }
        }.build()

        return _Group8!!
    }

@Suppress("ObjectPropertyName")
private var _Group8: ImageVector? = null
