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

val VuesaxIconsTwotone.ColorsSquare: ImageVector
    get() {
        if (_ColorsSquare != null) {
            return _ColorsSquare!!
        }
        _ColorsSquare = ImageVector.Builder(
            name = "ColorsSquare",
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
                moveTo(13.2f, 14.4f)
                curveTo(13.2f, 15.46f, 12.74f, 16.42f, 12f, 17.08f)
                curveTo(11.36f, 17.66f, 10.52f, 18f, 9.6f, 18f)
                curveTo(7.61f, 18f, 6f, 16.39f, 6f, 14.4f)
                curveTo(6f, 12.74f, 7.13f, 11.34f, 8.65f, 10.93f)
                curveTo(9.06f, 11.97f, 9.95f, 12.78f, 11.05f, 13.08f)
                curveTo(11.35f, 13.16f, 11.67f, 13.21f, 12f, 13.21f)
                curveTo(12.33f, 13.21f, 12.65f, 13.17f, 12.95f, 13.08f)
                curveTo(13.11f, 13.48f, 13.2f, 13.93f, 13.2f, 14.4f)
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
                moveTo(15.6f, 9.6f)
                curveTo(15.6f, 10.07f, 15.51f, 10.52f, 15.35f, 10.93f)
                curveTo(14.94f, 11.97f, 14.05f, 12.78f, 12.95f, 13.08f)
                curveTo(12.65f, 13.16f, 12.33f, 13.21f, 12f, 13.21f)
                curveTo(11.67f, 13.21f, 11.35f, 13.17f, 11.05f, 13.08f)
                curveTo(9.95f, 12.78f, 9.06f, 11.98f, 8.65f, 10.93f)
                curveTo(8.49f, 10.52f, 8.4f, 10.07f, 8.4f, 9.6f)
                curveTo(8.4f, 7.61f, 10.01f, 6f, 12f, 6f)
                curveTo(13.99f, 6f, 15.6f, 7.61f, 15.6f, 9.6f)
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
                moveTo(18f, 14.4f)
                curveTo(18f, 16.39f, 16.39f, 18f, 14.4f, 18f)
                curveTo(13.48f, 18f, 12.64f, 17.65f, 12f, 17.08f)
                curveTo(12.74f, 16.43f, 13.2f, 15.47f, 13.2f, 14.4f)
                curveTo(13.2f, 13.93f, 13.11f, 13.48f, 12.95f, 13.07f)
                curveTo(14.05f, 12.77f, 14.94f, 11.97f, 15.35f, 10.92f)
                curveTo(16.87f, 11.34f, 18f, 12.74f, 18f, 14.4f)
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

        return _ColorsSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ColorsSquare: ImageVector? = null
