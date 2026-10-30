package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Tree: ImageVector
    get() {
        if (_Tree != null) {
            return _Tree!!
        }
        _Tree = ImageVector.Builder(
            name = "Tree",
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
                moveTo(16.17f, 10.06f)
                horizontalLineTo(7.83f)
                curveTo(6.65f, 10.06f, 6.24f, 9.27f, 6.93f, 8.31f)
                lineTo(11.1f, 2.47f)
                curveTo(11.59f, 1.77f, 12.41f, 1.77f, 12.89f, 2.47f)
                lineTo(17.06f, 8.31f)
                curveTo(17.76f, 9.27f, 17.35f, 10.06f, 16.17f, 10.06f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.59f, 18f)
                horizontalLineTo(6.42f)
                curveTo(4.84f, 18f, 4.3f, 16.95f, 5.23f, 15.67f)
                lineTo(9.22f, 10.06f)
                horizontalLineTo(14.79f)
                lineTo(18.78f, 15.67f)
                curveTo(19.71f, 16.95f, 19.17f, 18f, 17.59f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineTo(18f)
            }
        }.build()

        return _Tree!!
    }

@Suppress("ObjectPropertyName")
private var _Tree: ImageVector? = null
