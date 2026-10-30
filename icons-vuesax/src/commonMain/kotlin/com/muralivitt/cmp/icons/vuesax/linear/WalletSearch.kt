package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.WalletSearch: ImageVector
    get() {
        if (_WalletSearch != null) {
            return _WalletSearch!!
        }
        _WalletSearch = ImageVector.Builder(
            name = "WalletSearch",
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
                moveTo(12f, 22f)
                horizontalLineTo(17f)
                curveTo(20f, 22f, 22f, 20f, 22f, 17f)
                verticalLineTo(12f)
                curveTo(22f, 9.3f, 20.3f, 7.3f, 17.8f, 7f)
                curveTo(17.6f, 7f, 17.3f, 7f, 17f, 7f)
                horizontalLineTo(7f)
                curveTo(6.7f, 7f, 6.5f, 7f, 6.2f, 7.1f)
                curveTo(3.6f, 7.4f, 2f, 9.3f, 2f, 12f)
                curveTo(2f, 12.3f, 2f, 12.7f, 2f, 13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.8f, 7f)
                curveTo(17.6f, 7f, 17.3f, 7f, 17f, 7f)
                horizontalLineTo(7f)
                curveTo(6.7f, 7f, 6.5f, 7f, 6.2f, 7.1f)
                curveTo(6.3f, 6.8f, 6.5f, 6.6f, 6.8f, 6.3f)
                lineTo(10f, 3f)
                curveTo(11.4f, 1.6f, 13.6f, 1.6f, 15f, 3f)
                lineTo(16.8f, 4.8f)
                curveTo(17.4f, 5.4f, 17.7f, 6.2f, 17.8f, 7f)
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
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.802f, 21.4f)
                curveTo(7.572f, 21.4f, 9.002f, 19.97f, 9.002f, 18.2f)
                curveTo(9.002f, 16.43f, 7.572f, 15f, 5.802f, 15f)
                curveTo(4.032f, 15f, 2.602f, 16.43f, 2.602f, 18.2f)
                curveTo(2.602f, 19.97f, 4.032f, 21.4f, 5.802f, 21.4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 22f)
                lineTo(3f, 21f)
            }
        }.build()

        return _WalletSearch!!
    }

@Suppress("ObjectPropertyName")
private var _WalletSearch: ImageVector? = null
