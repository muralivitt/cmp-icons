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

val VuesaxIconsTwotone.BuyCrypto: ImageVector
    get() {
        if (_BuyCrypto != null) {
            return _BuyCrypto!!
        }
        _BuyCrypto = ImageVector.Builder(
            name = "BuyCrypto",
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
                moveTo(22f, 8.5f)
                curveTo(22f, 12.09f, 19.09f, 15f, 15.5f, 15f)
                curveTo(15.33f, 15f, 15.15f, 14.99f, 14.98f, 14.98f)
                curveTo(14.73f, 11.81f, 12.19f, 9.27f, 9.02f, 9.02f)
                curveTo(9.01f, 8.85f, 9f, 8.67f, 9f, 8.5f)
                curveTo(9f, 4.91f, 11.91f, 2f, 15.5f, 2f)
                curveTo(19.09f, 2f, 22f, 4.91f, 22f, 8.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15.5f)
                curveTo(15f, 19.09f, 12.09f, 22f, 8.5f, 22f)
                curveTo(4.91f, 22f, 2f, 19.09f, 2f, 15.5f)
                curveTo(2f, 11.91f, 4.91f, 9f, 8.5f, 9f)
                curveTo(8.67f, 9f, 8.85f, 9.01f, 9.02f, 9.02f)
                curveTo(12.19f, 9.27f, 14.73f, 11.81f, 14.98f, 14.98f)
                curveTo(14.99f, 15.15f, 15f, 15.33f, 15f, 15.5f)
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
                moveTo(7.62f, 14.62f)
                lineTo(8.5f, 13f)
                lineTo(9.38f, 14.62f)
                lineTo(11f, 15.5f)
                lineTo(9.38f, 16.38f)
                lineTo(8.5f, 18f)
                lineTo(7.62f, 16.38f)
                lineTo(6f, 15.5f)
                lineTo(7.62f, 14.62f)
                close()
            }
        }.build()

        return _BuyCrypto!!
    }

@Suppress("ObjectPropertyName")
private var _BuyCrypto: ImageVector? = null
