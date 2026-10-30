package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.CardCoin: ImageVector
    get() {
        if (_CardCoin != null) {
            return _CardCoin!!
        }
        _CardCoin = ImageVector.Builder(
            name = "CardCoin",
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
                moveTo(2f, 17.06f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.22f, 13.5f)
                horizontalLineTo(9.78f)
                curveTo(11.56f, 13.5f, 12f, 13.94f, 12f, 15.7f)
                verticalLineTo(19.81f)
                curveTo(12f, 21.57f, 11.56f, 22.01f, 9.78f, 22.01f)
                horizontalLineTo(4.22f)
                curveTo(2.44f, 22.01f, 2f, 21.57f, 2f, 19.81f)
                verticalLineTo(15.7f)
                curveTo(2f, 13.94f, 2.44f, 13.5f, 4.22f, 13.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 15f)
                curveTo(22f, 18.87f, 18.87f, 22f, 15f, 22f)
                lineTo(16.05f, 20.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                curveTo(2f, 5.13f, 5.13f, 2f, 9f, 2f)
                lineTo(7.95f, 3.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 11f)
                curveTo(20.985f, 11f, 23f, 8.985f, 23f, 6.5f)
                curveTo(23f, 4.015f, 20.985f, 2f, 18.5f, 2f)
                curveTo(16.015f, 2f, 14f, 4.015f, 14f, 6.5f)
                curveTo(14f, 8.985f, 16.015f, 11f, 18.5f, 11f)
                close()
            }
        }.build()

        return _CardCoin!!
    }

@Suppress("ObjectPropertyName")
private var _CardCoin: ImageVector? = null
