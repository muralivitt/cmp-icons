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

val VuesaxIconsTwotone.Shop: ImageVector
    get() {
        if (_Shop != null) {
            return _Shop!!
        }
        _Shop = ImageVector.Builder(
            name = "Shop",
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
                moveTo(12f, 12f)
                curveTo(13.83f, 12f, 15.181f, 10.51f, 15f, 8.68f)
                lineTo(14.34f, 2f)
                horizontalLineTo(9.67f)
                lineTo(9f, 8.68f)
                curveTo(8.82f, 10.51f, 10.17f, 12f, 12f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.311f, 12f)
                curveTo(20.331f, 12f, 21.811f, 10.36f, 21.611f, 8.35f)
                lineTo(21.331f, 5.6f)
                curveTo(20.971f, 3f, 19.971f, 2f, 17.351f, 2f)
                horizontalLineTo(14.301f)
                lineTo(15.001f, 9.01f)
                curveTo(15.171f, 10.66f, 16.661f, 12f, 18.311f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.64f, 12f)
                curveTo(7.29f, 12f, 8.78f, 10.66f, 8.94f, 9.01f)
                lineTo(9.16f, 6.8f)
                lineTo(9.64f, 2f)
                horizontalLineTo(6.59f)
                curveTo(3.97f, 2f, 2.97f, 3f, 2.61f, 5.6f)
                lineTo(2.34f, 8.35f)
                curveTo(2.14f, 10.36f, 3.62f, 12f, 5.64f, 12f)
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
                moveTo(3.01f, 11.22f)
                verticalLineTo(15.71f)
                curveTo(3.01f, 20.2f, 4.81f, 22f, 9.3f, 22f)
                horizontalLineTo(14.69f)
                curveTo(19.18f, 22f, 20.98f, 20.2f, 20.98f, 15.71f)
                verticalLineTo(11.22f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                curveTo(10.33f, 17f, 9.5f, 17.83f, 9.5f, 19.5f)
                verticalLineTo(22f)
                horizontalLineTo(14.5f)
                verticalLineTo(19.5f)
                curveTo(14.5f, 17.83f, 13.67f, 17f, 12f, 17f)
                close()
            }
        }.build()

        return _Shop!!
    }

@Suppress("ObjectPropertyName")
private var _Shop: ImageVector? = null
