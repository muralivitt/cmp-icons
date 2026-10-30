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

val VuesaxIconsTwotone.BucketSquare: ImageVector
    get() {
        if (_BucketSquare != null) {
            return _BucketSquare!!
        }
        _BucketSquare = ImageVector.Builder(
            name = "BucketSquare",
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
                moveTo(8.939f, 16.93f)
                lineTo(6.109f, 14.1f)
                curveTo(5.169f, 13.16f, 5.169f, 12.21f, 6.109f, 11.27f)
                lineTo(10.829f, 6.55f)
                lineTo(16.019f, 11.74f)
                curveTo(16.279f, 12f, 16.279f, 12.42f, 16.019f, 12.68f)
                lineTo(11.769f, 16.93f)
                curveTo(10.829f, 17.87f, 9.879f, 17.87f, 8.939f, 16.93f)
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
                moveTo(9.879f, 5.6f)
                lineTo(10.829f, 6.54f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.439f, 12.64f)
                lineTo(16.129f, 12.17f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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

        return _BucketSquare!!
    }

@Suppress("ObjectPropertyName")
private var _BucketSquare: ImageVector? = null
