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

val VuesaxIconsTwotone.StarSlash: ImageVector
    get() {
        if (_StarSlash != null) {
            return _StarSlash!!
        }
        _StarSlash = ImageVector.Builder(
            name = "StarSlash",
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
                moveTo(5.281f, 18.65f)
                lineTo(5.851f, 16.18f)
                curveTo(5.981f, 15.6f, 5.751f, 14.79f, 5.331f, 14.37f)
                lineTo(2.851f, 11.89f)
                curveTo(1.391f, 10.43f, 1.861f, 8.95f, 3.901f, 8.61f)
                lineTo(7.091f, 8.08f)
                curveTo(7.621f, 7.99f, 8.261f, 7.52f, 8.501f, 7.03f)
                lineTo(10.261f, 3.51f)
                curveTo(11.211f, 1.6f, 12.771f, 1.6f, 13.731f, 3.51f)
                lineTo(15.491f, 7.03f)
                curveTo(15.601f, 7.26f, 15.811f, 7.48f, 16.041f, 7.67f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.1f, 8.61f)
                curveTo(22.139f, 8.95f, 22.619f, 10.43f, 21.149f, 11.89f)
                lineTo(18.67f, 14.37f)
                curveTo(18.25f, 14.79f, 18.02f, 15.6f, 18.149f, 16.18f)
                lineTo(18.86f, 19.25f)
                curveTo(19.42f, 21.68f, 18.129f, 22.62f, 15.979f, 21.35f)
                lineTo(12.99f, 19.58f)
                curveTo(12.45f, 19.26f, 11.559f, 19.26f, 11.009f, 19.58f)
                lineTo(8.02f, 21.35f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
        }.build()

        return _StarSlash!!
    }

@Suppress("ObjectPropertyName")
private var _StarSlash: ImageVector? = null
