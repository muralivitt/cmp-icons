package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Signpost: ImageVector
    get() {
        if (_Signpost != null) {
            return _Signpost!!
        }
        _Signpost = ImageVector.Builder(
            name = "Signpost",
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
                moveTo(17.22f, 2f)
                horizontalLineTo(8.96f)
                curveTo(8.56f, 2f, 8.18f, 2.14f, 7.87f, 2.38f)
                lineTo(5.68f, 4.13f)
                curveTo(4.8f, 4.83f, 4.8f, 6.16f, 5.68f, 6.86f)
                lineTo(7.87f, 8.61f)
                curveTo(8.18f, 8.86f, 8.57f, 8.99f, 8.96f, 8.99f)
                horizontalLineTo(17.22f)
                curveTo(18.19f, 8.99f, 18.97f, 8.21f, 18.97f, 7.24f)
                verticalLineTo(3.74f)
                curveTo(18.97f, 2.78f, 18.19f, 2f, 17.22f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.8f, 12f)
                horizontalLineTo(15.06f)
                curveTo(15.46f, 12f, 15.84f, 12.14f, 16.15f, 12.38f)
                lineTo(18.34f, 14.13f)
                curveTo(19.22f, 14.83f, 19.22f, 16.16f, 18.34f, 16.86f)
                lineTo(16.15f, 18.61f)
                curveTo(15.84f, 18.86f, 15.45f, 18.99f, 15.06f, 18.99f)
                horizontalLineTo(6.8f)
                curveTo(5.83f, 18.99f, 5.05f, 18.21f, 5.05f, 17.24f)
                verticalLineTo(13.74f)
                curveTo(5.05f, 12.78f, 5.83f, 12f, 6.8f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 22f)
                horizontalLineTo(15f)
            }
        }.build()

        return _Signpost!!
    }

@Suppress("ObjectPropertyName")
private var _Signpost: ImageVector? = null
