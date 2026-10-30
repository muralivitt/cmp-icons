package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.LinkCircle: ImageVector
    get() {
        if (_LinkCircle != null) {
            return _LinkCircle!!
        }
        _LinkCircle = ImageVector.Builder(
            name = "LinkCircle",
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
                moveTo(7.94f, 14.51f)
                curveTo(7.32f, 14.28f, 6.77f, 13.83f, 6.42f, 13.19f)
                curveTo(5.62f, 11.73f, 6.11f, 9.83f, 7.53f, 8.95f)
                lineTo(9.87f, 7.5f)
                curveTo(11.28f, 6.62f, 13.1f, 7.1f, 13.9f, 8.55f)
                curveTo(14.7f, 10.01f, 14.21f, 11.91f, 12.79f, 12.79f)
                lineTo(12.48f, 13.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.11f, 9.45f)
                curveTo(16.73f, 9.68f, 17.28f, 10.13f, 17.63f, 10.77f)
                curveTo(18.43f, 12.23f, 17.94f, 14.13f, 16.52f, 15.01f)
                lineTo(14.18f, 16.46f)
                curveTo(12.77f, 17.34f, 10.95f, 16.86f, 10.15f, 15.41f)
                curveTo(9.35f, 13.95f, 9.84f, 12.05f, 11.26f, 11.17f)
                lineTo(11.57f, 10.95f)
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

        return _LinkCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LinkCircle: ImageVector? = null
