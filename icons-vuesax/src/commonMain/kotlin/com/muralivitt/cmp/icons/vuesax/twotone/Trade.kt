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

val VuesaxIconsTwotone.Trade: ImageVector
    get() {
        if (_Trade != null) {
            return _Trade!!
        }
        _Trade = ImageVector.Builder(
            name = "Trade",
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
                moveTo(22f, 8.5f)
                curveTo(22f, 12.09f, 19.09f, 15f, 15.5f, 15f)
                curveTo(15.33f, 15f, 15.15f, 14.99f, 14.98f, 14.98f)
                curveTo(14.73f, 11.81f, 12.19f, 9.27f, 9.02f, 9.02f)
                curveTo(9.01f, 8.85f, 9f, 8.67f, 9f, 8.5f)
                curveTo(9f, 4.91f, 11.91f, 2f, 15.5f, 2f)
                curveTo(19.09f, 2f, 22f, 4.91f, 22f, 8.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15.5f)
                curveTo(15f, 19.09f, 12.09f, 22f, 8.5f, 22f)
                curveTo(4.91f, 22f, 2f, 19.09f, 2f, 15.5f)
                curveTo(2f, 11.91f, 4.91f, 9f, 8.5f, 9f)
                curveTo(8.67f, 9f, 8.85f, 9.01f, 9.02f, 9.02f)
                curveTo(12.19f, 9.27f, 14.73f, 11.81f, 14.98f, 14.98f)
                curveTo(14.99f, 15.15f, 15f, 15.33f, 15f, 15.5f)
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
                moveTo(5.59f, 2f)
                horizontalLineTo(3f)
                curveTo(2.45f, 2f, 2f, 2.45f, 2f, 3f)
                verticalLineTo(5.59f)
                curveTo(2f, 6.48f, 3.08f, 6.93f, 3.71f, 6.3f)
                lineTo(6.3f, 3.71f)
                curveTo(6.92f, 3.08f, 6.48f, 2f, 5.59f, 2f)
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
                moveTo(18.41f, 22f)
                horizontalLineTo(21f)
                curveTo(21.55f, 22f, 22f, 21.55f, 22f, 21f)
                verticalLineTo(18.41f)
                curveTo(22f, 17.52f, 20.92f, 17.07f, 20.29f, 17.7f)
                lineTo(17.7f, 20.29f)
                curveTo(17.08f, 20.92f, 17.52f, 22f, 18.41f, 22f)
                close()
            }
        }.build()

        return _Trade!!
    }

@Suppress("ObjectPropertyName")
private var _Trade: ImageVector? = null
