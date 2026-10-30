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

val VuesaxIconsTwotone.Tree: ImageVector
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
                moveTo(16.169f, 10.06f)
                horizontalLineTo(7.829f)
                curveTo(6.649f, 10.06f, 6.239f, 9.27f, 6.929f, 8.31f)
                lineTo(11.099f, 2.47f)
                curveTo(11.589f, 1.77f, 12.409f, 1.77f, 12.889f, 2.47f)
                lineTo(17.059f, 8.31f)
                curveTo(17.759f, 9.27f, 17.349f, 10.06f, 16.169f, 10.06f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.589f, 18f)
                horizontalLineTo(6.419f)
                curveTo(4.839f, 18f, 4.299f, 16.95f, 5.229f, 15.67f)
                lineTo(9.219f, 10.06f)
                horizontalLineTo(14.789f)
                lineTo(18.779f, 15.67f)
                curveTo(19.709f, 16.95f, 19.169f, 18f, 17.589f, 18f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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
