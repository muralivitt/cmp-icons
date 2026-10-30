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

val VuesaxIconsTwotone.Shapes1: ImageVector
    get() {
        if (_Shapes1 != null) {
            return _Shapes1!!
        }
        _Shapes1 = ImageVector.Builder(
            name = "Shapes1",
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
                moveTo(16.971f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(16.971f, 20.5f, 15.471f, 22f, 11.721f, 22f)
                horizontalLineTo(7.221f)
                curveTo(3.471f, 22f, 1.971f, 20.5f, 1.971f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(1.971f, 8.5f, 3.471f, 7f, 7.221f, 7f)
                horizontalLineTo(11.721f)
                curveTo(15.471f, 7f, 16.971f, 8.5f, 16.971f, 12.25f)
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
                moveTo(21.97f, 7.5f)
                curveTo(21.97f, 10.37f, 19.78f, 12.72f, 16.97f, 12.97f)
                verticalLineTo(12.25f)
                curveTo(16.97f, 8.5f, 15.47f, 7f, 11.72f, 7f)
                horizontalLineTo(11f)
                curveTo(11.25f, 4.19f, 13.6f, 2f, 16.47f, 2f)
                curveTo(19.26f, 2f, 21.56f, 4.07f, 21.91f, 6.77f)
                curveTo(21.95f, 7f, 21.97f, 7.25f, 21.97f, 7.5f)
                close()
            }
        }.build()

        return _Shapes1!!
    }

@Suppress("ObjectPropertyName")
private var _Shapes1: ImageVector? = null
