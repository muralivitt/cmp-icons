package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BucketSquare1: ImageVector
    get() {
        if (_BucketSquare1 != null) {
            return _BucketSquare1!!
        }
        _BucketSquare1 = ImageVector.Builder(
            name = "BucketSquare1",
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
                moveTo(8.94f, 16.93f)
                lineTo(6.11f, 14.1f)
                curveTo(5.17f, 13.16f, 5.17f, 12.21f, 6.11f, 11.27f)
                lineTo(10.83f, 6.55f)
                lineTo(16.02f, 11.74f)
                curveTo(16.28f, 12f, 16.28f, 12.42f, 16.02f, 12.68f)
                lineTo(11.77f, 16.93f)
                curveTo(10.83f, 17.87f, 9.88f, 17.87f, 8.94f, 16.93f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.88f, 5.6f)
                lineTo(10.83f, 6.54f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.44f, 12.64f)
                lineTo(16.13f, 12.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.3f, 14.81f)
                curveTo(17.3f, 14.81f, 15.99f, 16.23f, 15.99f, 17.1f)
                curveTo(15.99f, 17.82f, 16.58f, 18.41f, 17.3f, 18.41f)
                curveTo(18.02f, 18.41f, 18.61f, 17.82f, 18.61f, 17.1f)
                curveTo(18.6f, 16.23f, 17.3f, 14.81f, 17.3f, 14.81f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                close()
            }
        }.build()

        return _BucketSquare1!!
    }

@Suppress("ObjectPropertyName")
private var _BucketSquare1: ImageVector? = null
