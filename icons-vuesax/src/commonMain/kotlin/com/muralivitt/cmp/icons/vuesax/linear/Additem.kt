package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Additem: ImageVector
    get() {
        if (_Additem != null) {
            return _Additem!!
        }
        _Additem = ImageVector.Builder(
            name = "Additem",
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
                moveTo(8f, 16f)
                horizontalLineTo(5.43f)
                curveTo(3.14f, 16f, 2f, 14.86f, 2f, 12.57f)
                verticalLineTo(5.43f)
                curveTo(2f, 3.14f, 3.14f, 2f, 5.43f, 2f)
                horizontalLineTo(10f)
                curveTo(12.29f, 2f, 13.43f, 3.14f, 13.43f, 5.43f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.57f, 22f)
                horizontalLineTo(14f)
                curveTo(11.71f, 22f, 10.57f, 20.86f, 10.57f, 18.57f)
                verticalLineTo(11.43f)
                curveTo(10.57f, 9.14f, 11.71f, 8f, 14f, 8f)
                horizontalLineTo(18.57f)
                curveTo(20.86f, 8f, 22f, 9.14f, 22f, 11.43f)
                verticalLineTo(18.57f)
                curveTo(22f, 20.86f, 20.86f, 22f, 18.57f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.87f, 15f)
                horizontalLineTo(18.13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 16.63f)
                verticalLineTo(13.37f)
            }
        }.build()

        return _Additem!!
    }

@Suppress("ObjectPropertyName")
private var _Additem: ImageVector? = null
