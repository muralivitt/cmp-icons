package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Archive1: ImageVector
    get() {
        if (_Archive1 != null) {
            return _Archive1!!
        }
        _Archive1 = ImageVector.Builder(
            name = "Archive1",
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
                moveTo(19.5f, 10.22f)
                verticalLineTo(19f)
                curveTo(19.5f, 21f, 19f, 22f, 16.5f, 22f)
                horizontalLineTo(7.5f)
                curveTo(5f, 22f, 4.5f, 21f, 4.5f, 19f)
                verticalLineTo(10.22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 2f)
                horizontalLineTo(19f)
                curveTo(21f, 2f, 22f, 3f, 22f, 5f)
                verticalLineTo(7f)
                curveTo(22f, 9f, 21f, 10f, 19f, 10f)
                horizontalLineTo(5f)
                curveTo(3f, 10f, 2f, 9f, 2f, 7f)
                verticalLineTo(5f)
                curveTo(2f, 3f, 3f, 2f, 5f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.18f, 14f)
                horizontalLineTo(13.82f)
            }
        }.build()

        return _Archive1!!
    }

@Suppress("ObjectPropertyName")
private var _Archive1: ImageVector? = null
