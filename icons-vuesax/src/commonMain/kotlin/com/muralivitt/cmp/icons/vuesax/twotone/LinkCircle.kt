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

val VuesaxIconsTwotone.LinkCircle: ImageVector
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.941f, 14.51f)
                curveTo(7.321f, 14.28f, 6.771f, 13.83f, 6.421f, 13.19f)
                curveTo(5.621f, 11.73f, 6.111f, 9.83f, 7.531f, 8.95f)
                lineTo(9.871f, 7.5f)
                curveTo(11.281f, 6.62f, 13.101f, 7.1f, 13.901f, 8.55f)
                curveTo(14.701f, 10.01f, 14.211f, 11.91f, 12.791f, 12.79f)
                lineTo(12.481f, 13.01f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.109f, 9.45f)
                curveTo(16.729f, 9.68f, 17.279f, 10.13f, 17.629f, 10.77f)
                curveTo(18.429f, 12.23f, 17.939f, 14.13f, 16.519f, 15.01f)
                lineTo(14.179f, 16.46f)
                curveTo(12.769f, 17.34f, 10.949f, 16.86f, 10.149f, 15.41f)
                curveTo(9.349f, 13.95f, 9.839f, 12.05f, 11.259f, 11.17f)
                lineTo(11.569f, 10.95f)
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
