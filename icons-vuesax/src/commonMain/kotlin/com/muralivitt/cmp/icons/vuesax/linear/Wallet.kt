package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Wallet: ImageVector
    get() {
        if (_Wallet != null) {
            return _Wallet!!
        }
        _Wallet = ImageVector.Builder(
            name = "Wallet",
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
                moveTo(22f, 12f)
                verticalLineTo(17f)
                curveTo(22f, 20f, 20f, 22f, 17f, 22f)
                horizontalLineTo(7f)
                curveTo(4f, 22f, 2f, 20f, 2f, 17f)
                verticalLineTo(12f)
                curveTo(2f, 9.28f, 3.64f, 7.38f, 6.19f, 7.06f)
                curveTo(6.45f, 7.02f, 6.72f, 7f, 7f, 7f)
                horizontalLineTo(17f)
                curveTo(17.26f, 7f, 17.51f, 7.01f, 17.75f, 7.05f)
                curveTo(20.33f, 7.35f, 22f, 9.26f, 22f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.751f, 7.05f)
                curveTo(17.511f, 7.01f, 17.261f, 7f, 17.001f, 7f)
                horizontalLineTo(7.001f)
                curveTo(6.721f, 7f, 6.451f, 7.02f, 6.191f, 7.06f)
                curveTo(6.331f, 6.78f, 6.531f, 6.52f, 6.771f, 6.28f)
                lineTo(10.021f, 3.02f)
                curveTo(11.391f, 1.66f, 13.611f, 1.66f, 14.981f, 3.02f)
                lineTo(16.731f, 4.79f)
                curveTo(17.371f, 5.42f, 17.711f, 6.22f, 17.751f, 7.05f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12.5f)
                horizontalLineTo(19f)
                curveTo(17.9f, 12.5f, 17f, 13.4f, 17f, 14.5f)
                curveTo(17f, 15.6f, 17.9f, 16.5f, 19f, 16.5f)
                horizontalLineTo(22f)
            }
        }.build()

        return _Wallet!!
    }

@Suppress("ObjectPropertyName")
private var _Wallet: ImageVector? = null
