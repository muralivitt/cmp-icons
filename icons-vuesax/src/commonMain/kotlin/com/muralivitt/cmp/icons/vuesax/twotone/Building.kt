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

val VuesaxIconsTwotone.Building: ImageVector
    get() {
        if (_Building != null) {
            return _Building!!
        }
        _Building = ImageVector.Builder(
            name = "Building",
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
                moveTo(12.5f, 22f)
                horizontalLineTo(4.08f)
                curveTo(2.92f, 22f, 1.97f, 21.07f, 1.97f, 19.93f)
                verticalLineTo(5.09f)
                curveTo(1.97f, 2.47f, 3.92f, 1.28f, 6.31f, 2.45f)
                lineTo(10.75f, 4.63f)
                curveTo(11.71f, 5.1f, 12.5f, 6.35f, 12.5f, 7.41f)
                verticalLineTo(22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.97f, 15.06f)
                verticalLineTo(18.84f)
                curveTo(21.97f, 21f, 20.97f, 22f, 18.81f, 22f)
                horizontalLineTo(12.5f)
                verticalLineTo(10.42f)
                lineTo(12.97f, 10.52f)
                lineTo(17.47f, 11.53f)
                lineTo(19.5f, 11.98f)
                curveTo(20.82f, 12.27f, 21.9f, 12.95f, 21.96f, 14.87f)
                curveTo(21.97f, 14.93f, 21.97f, 14.99f, 21.97f, 15.06f)
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
                moveTo(5.5f, 9f)
                horizontalLineTo(8.97f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.5f, 13f)
                horizontalLineTo(8.97f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.47f, 11.531f)
                verticalLineTo(14.75f)
                curveTo(17.47f, 15.991f, 16.46f, 17f, 15.22f, 17f)
                curveTo(13.98f, 17f, 12.97f, 15.991f, 12.97f, 14.75f)
                verticalLineTo(10.521f)
                lineTo(17.47f, 11.531f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.96f, 14.87f)
                curveTo(21.9f, 16.05f, 20.92f, 17f, 19.72f, 17f)
                curveTo(18.48f, 17f, 17.47f, 15.99f, 17.47f, 14.75f)
                verticalLineTo(11.53f)
                lineTo(19.5f, 11.98f)
                curveTo(20.82f, 12.27f, 21.9f, 12.95f, 21.96f, 14.87f)
                close()
            }
        }.build()

        return _Building!!
    }

@Suppress("ObjectPropertyName")
private var _Building: ImageVector? = null
