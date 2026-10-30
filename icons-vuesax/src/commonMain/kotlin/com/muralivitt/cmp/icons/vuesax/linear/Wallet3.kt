package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Wallet3: ImageVector
    get() {
        if (_Wallet3 != null) {
            return _Wallet3!!
        }
        _Wallet3 = ImageVector.Builder(
            name = "Wallet3",
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
                moveTo(13f, 11.15f)
                horizontalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 11.15f)
                verticalLineTo(6.53f)
                curveTo(2f, 4.49f, 3.65f, 2.84f, 5.69f, 2.84f)
                horizontalLineTo(11.31f)
                curveTo(13.35f, 2.84f, 15f, 4.11f, 15f, 6.15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.48f, 12.2f)
                curveTo(16.98f, 12.68f, 16.74f, 13.42f, 16.94f, 14.18f)
                curveTo(17.19f, 15.11f, 18.11f, 15.7f, 19.07f, 15.7f)
                horizontalLineTo(20f)
                verticalLineTo(17.15f)
                curveTo(20f, 19.36f, 18.21f, 21.15f, 16f, 21.15f)
                horizontalLineTo(6f)
                curveTo(3.79f, 21.15f, 2f, 19.36f, 2f, 17.15f)
                verticalLineTo(10.15f)
                curveTo(2f, 7.94f, 3.79f, 6.15f, 6f, 6.15f)
                horizontalLineTo(16f)
                curveTo(18.2f, 6.15f, 20f, 7.95f, 20f, 10.15f)
                verticalLineTo(11.6f)
                horizontalLineTo(18.92f)
                curveTo(18.36f, 11.6f, 17.85f, 11.82f, 17.48f, 12.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12.62f)
                verticalLineTo(14.68f)
                curveTo(22f, 15.24f, 21.54f, 15.7f, 20.97f, 15.7f)
                horizontalLineTo(19.04f)
                curveTo(17.96f, 15.7f, 16.97f, 14.91f, 16.88f, 13.83f)
                curveTo(16.82f, 13.2f, 17.06f, 12.61f, 17.48f, 12.2f)
                curveTo(17.85f, 11.82f, 18.36f, 11.6f, 18.92f, 11.6f)
                horizontalLineTo(20.97f)
                curveTo(21.54f, 11.6f, 22f, 12.06f, 22f, 12.62f)
                close()
            }
        }.build()

        return _Wallet3!!
    }

@Suppress("ObjectPropertyName")
private var _Wallet3: ImageVector? = null
