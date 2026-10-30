package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.ElementPlus: ImageVector
    get() {
        if (_ElementPlus != null) {
            return _ElementPlus!!
        }
        _ElementPlus = ImageVector.Builder(
            name = "ElementPlus",
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
                moveTo(22f, 8.27f)
                verticalLineTo(4.23f)
                curveTo(22f, 2.64f, 21.36f, 2f, 19.77f, 2f)
                horizontalLineTo(15.73f)
                curveTo(14.14f, 2f, 13.5f, 2.64f, 13.5f, 4.23f)
                verticalLineTo(8.27f)
                curveTo(13.5f, 9.86f, 14.14f, 10.5f, 15.73f, 10.5f)
                horizontalLineTo(19.77f)
                curveTo(21.36f, 10.5f, 22f, 9.86f, 22f, 8.27f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 8.52f)
                verticalLineTo(3.98f)
                curveTo(10.5f, 2.57f, 9.86f, 2f, 8.27f, 2f)
                horizontalLineTo(4.23f)
                curveTo(2.64f, 2f, 2f, 2.57f, 2f, 3.98f)
                verticalLineTo(8.51f)
                curveTo(2f, 9.93f, 2.64f, 10.49f, 4.23f, 10.49f)
                horizontalLineTo(8.27f)
                curveTo(9.86f, 10.5f, 10.5f, 9.93f, 10.5f, 8.52f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 19.77f)
                verticalLineTo(15.73f)
                curveTo(10.5f, 14.14f, 9.86f, 13.5f, 8.27f, 13.5f)
                horizontalLineTo(4.23f)
                curveTo(2.64f, 13.5f, 2f, 14.14f, 2f, 15.73f)
                verticalLineTo(19.77f)
                curveTo(2f, 21.36f, 2.64f, 22f, 4.23f, 22f)
                horizontalLineTo(8.27f)
                curveTo(9.86f, 22f, 10.5f, 21.36f, 10.5f, 19.77f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(14.5f, 17.5f)
                horizontalLineTo(20.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(17.5f, 20.5f)
                verticalLineTo(14.5f)
            }
        }.build()

        return _ElementPlus!!
    }

@Suppress("ObjectPropertyName")
private var _ElementPlus: ImageVector? = null
