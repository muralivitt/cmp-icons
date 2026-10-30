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

val VuesaxIconsTwotone.Element2: ImageVector
    get() {
        if (_Element2 != null) {
            return _Element2!!
        }
        _Element2 = ImageVector.Builder(
            name = "Element2",
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
                moveTo(10.5f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(10.5f, 2.6f, 9.86f, 2f, 8.27f, 2f)
                horizontalLineTo(4.23f)
                curveTo(2.64f, 2f, 2f, 2.6f, 2f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(2f, 21.4f, 2.64f, 22f, 4.23f, 22f)
                horizontalLineTo(8.27f)
                curveTo(9.86f, 22f, 10.5f, 21.4f, 10.5f, 19.9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 8.52f)
                verticalLineTo(3.98f)
                curveTo(22f, 2.57f, 21.36f, 2f, 19.77f, 2f)
                horizontalLineTo(15.73f)
                curveTo(14.14f, 2f, 13.5f, 2.57f, 13.5f, 3.98f)
                verticalLineTo(8.51f)
                curveTo(13.5f, 9.93f, 14.14f, 10.49f, 15.73f, 10.49f)
                horizontalLineTo(19.77f)
                curveTo(21.36f, 10.5f, 22f, 9.93f, 22f, 8.52f)
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
                moveTo(22f, 19.77f)
                verticalLineTo(15.73f)
                curveTo(22f, 14.14f, 21.36f, 13.5f, 19.77f, 13.5f)
                horizontalLineTo(15.73f)
                curveTo(14.14f, 13.5f, 13.5f, 14.14f, 13.5f, 15.73f)
                verticalLineTo(19.77f)
                curveTo(13.5f, 21.36f, 14.14f, 22f, 15.73f, 22f)
                horizontalLineTo(19.77f)
                curveTo(21.36f, 22f, 22f, 21.36f, 22f, 19.77f)
                close()
            }
        }.build()

        return _Element2!!
    }

@Suppress("ObjectPropertyName")
private var _Element2: ImageVector? = null
