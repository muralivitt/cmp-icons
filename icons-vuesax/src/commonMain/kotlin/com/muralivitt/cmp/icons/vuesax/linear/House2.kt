package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.House2: ImageVector
    get() {
        if (_House2 != null) {
            return _House2!!
        }
        _House2 = ImageVector.Builder(
            name = "House2",
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
                moveTo(2f, 22f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.95f, 22f)
                lineTo(3f, 9.97f)
                curveTo(3f, 9.36f, 3.29f, 8.78f, 3.77f, 8.4f)
                lineTo(10.77f, 2.95f)
                curveTo(11.49f, 2.39f, 12.5f, 2.39f, 13.23f, 2.95f)
                lineTo(20.23f, 8.39f)
                curveTo(20.72f, 8.77f, 21f, 9.35f, 21f, 9.97f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 11f)
                horizontalLineTo(8.5f)
                curveTo(7.67f, 11f, 7f, 11.67f, 7f, 12.5f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(12.5f)
                curveTo(17f, 11.67f, 16.33f, 11f, 15.5f, 11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 16.25f)
                verticalLineTo(17.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 7.5f)
                horizontalLineTo(13.5f)
            }
        }.build()

        return _House2!!
    }

@Suppress("ObjectPropertyName")
private var _House2: ImageVector? = null
