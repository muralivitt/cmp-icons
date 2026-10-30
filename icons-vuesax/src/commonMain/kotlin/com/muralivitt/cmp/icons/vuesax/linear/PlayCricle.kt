package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.PlayCricle: ImageVector
    get() {
        if (_PlayCricle != null) {
            return _PlayCricle!!
        }
        _PlayCricle = ImageVector.Builder(
            name = "PlayCricle",
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
                moveTo(19.07f, 19.07f)
                curveTo(22.98f, 15.16f, 22.98f, 8.83f, 19.07f, 4.93f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.93f, 4.93f)
                curveTo(1.02f, 8.84f, 1.02f, 15.17f, 4.93f, 19.07f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.7f, 21.41f)
                curveTo(9.77f, 21.78f, 10.88f, 21.96f, 12f, 21.96f)
                curveTo(13.12f, 21.95f, 14.23f, 21.78f, 15.3f, 21.41f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.7f, 2.59f)
                curveTo(9.77f, 2.22f, 10.88f, 2.04f, 12f, 2.04f)
                curveTo(13.12f, 2.04f, 14.23f, 2.22f, 15.3f, 2.59f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.74f, 12f)
                verticalLineTo(10.33f)
                curveTo(8.74f, 8.25f, 10.21f, 7.4f, 12.01f, 8.44f)
                lineTo(13.46f, 9.28f)
                lineTo(14.91f, 10.12f)
                curveTo(16.71f, 11.16f, 16.71f, 12.86f, 14.91f, 13.9f)
                lineTo(13.46f, 14.74f)
                lineTo(12.01f, 15.58f)
                curveTo(10.21f, 16.62f, 8.74f, 15.77f, 8.74f, 13.69f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _PlayCricle!!
    }

@Suppress("ObjectPropertyName")
private var _PlayCricle: ImageVector? = null
