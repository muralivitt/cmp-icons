package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BucketCircle: ImageVector
    get() {
        if (_BucketCircle != null) {
            return _BucketCircle!!
        }
        _BucketCircle = ImageVector.Builder(
            name = "BucketCircle",
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
                moveTo(9.41f, 15.95f)
                lineTo(7.02f, 13.56f)
                curveTo(6.22f, 12.76f, 6.22f, 11.96f, 7.02f, 11.17f)
                lineTo(11.01f, 7.18f)
                lineTo(15.4f, 11.57f)
                curveTo(15.62f, 11.79f, 15.62f, 12.15f, 15.4f, 12.37f)
                lineTo(11.81f, 15.96f)
                curveTo(11.01f, 16.75f, 10.21f, 16.75f, 9.41f, 15.95f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.21f, 6.38f)
                lineTo(11.01f, 7.18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.46f, 12.33f)
                lineTo(15.49f, 11.94f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.47f, 14.17f)
                curveTo(16.47f, 14.17f, 15.37f, 15.37f, 15.37f, 16.1f)
                curveTo(15.37f, 16.71f, 15.87f, 17.2f, 16.47f, 17.2f)
                curveTo(17.08f, 17.2f, 17.57f, 16.7f, 17.57f, 16.1f)
                curveTo(17.58f, 15.36f, 16.47f, 14.17f, 16.47f, 14.17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _BucketCircle!!
    }

@Suppress("ObjectPropertyName")
private var _BucketCircle: ImageVector? = null
