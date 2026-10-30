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

val VuesaxIconsTwotone.FilterSquare: ImageVector
    get() {
        if (_FilterSquare != null) {
            return _FilterSquare!!
        }
        _FilterSquare = ImageVector.Builder(
            name = "FilterSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.16f, 6.65f)
                horizontalLineTo(15.83f)
                curveTo(16.47f, 6.65f, 16.99f, 7.17f, 16.99f, 7.81f)
                verticalLineTo(9.09f)
                curveTo(16.99f, 9.56f, 16.7f, 10.14f, 16.41f, 10.43f)
                lineTo(13.91f, 12.64f)
                curveTo(13.56f, 12.93f, 13.33f, 13.51f, 13.33f, 13.98f)
                verticalLineTo(16.48f)
                curveTo(13.33f, 16.83f, 13.1f, 17.29f, 12.81f, 17.47f)
                lineTo(12f, 17.98f)
                curveTo(11.24f, 18.45f, 10.2f, 17.92f, 10.2f, 16.99f)
                verticalLineTo(13.91f)
                curveTo(10.2f, 13.5f, 9.97f, 12.98f, 9.73f, 12.69f)
                lineTo(7.52f, 10.36f)
                curveTo(7.23f, 10.08f, 7f, 9.55f, 7f, 9.2f)
                verticalLineTo(7.87f)
                curveTo(7f, 7.17f, 7.52f, 6.65f, 8.16f, 6.65f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                close()
            }
        }.build()

        return _FilterSquare!!
    }

@Suppress("ObjectPropertyName")
private var _FilterSquare: ImageVector? = null
