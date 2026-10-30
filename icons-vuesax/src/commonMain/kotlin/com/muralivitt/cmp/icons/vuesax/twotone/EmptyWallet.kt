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

val VuesaxIconsTwotone.EmptyWallet: ImageVector
    get() {
        if (_EmptyWallet != null) {
            return _EmptyWallet!!
        }
        _EmptyWallet = ImageVector.Builder(
            name = "EmptyWallet",
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
                moveTo(18.04f, 13.55f)
                curveTo(17.62f, 13.96f, 17.38f, 14.55f, 17.44f, 15.18f)
                curveTo(17.53f, 16.26f, 18.52f, 17.05f, 19.6f, 17.05f)
                horizontalLineTo(21.5f)
                verticalLineTo(18.24f)
                curveTo(21.5f, 20.31f, 19.81f, 22f, 17.74f, 22f)
                horizontalLineTo(6.26f)
                curveTo(4.19f, 22f, 2.5f, 20.31f, 2.5f, 18.24f)
                verticalLineTo(11.51f)
                curveTo(2.5f, 9.44f, 4.19f, 7.75f, 6.26f, 7.75f)
                horizontalLineTo(17.74f)
                curveTo(19.81f, 7.75f, 21.5f, 9.44f, 21.5f, 11.51f)
                verticalLineTo(12.95f)
                horizontalLineTo(19.48f)
                curveTo(18.92f, 12.95f, 18.41f, 13.17f, 18.04f, 13.55f)
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
                moveTo(2.5f, 12.41f)
                verticalLineTo(7.84f)
                curveTo(2.5f, 6.65f, 3.23f, 5.59f, 4.34f, 5.17f)
                lineTo(12.28f, 2.17f)
                curveTo(13.52f, 1.7f, 14.85f, 2.62f, 14.85f, 3.95f)
                verticalLineTo(7.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22.561f, 13.97f)
                verticalLineTo(16.03f)
                curveTo(22.561f, 16.58f, 22.121f, 17.03f, 21.561f, 17.05f)
                horizontalLineTo(19.601f)
                curveTo(18.521f, 17.05f, 17.531f, 16.26f, 17.441f, 15.18f)
                curveTo(17.381f, 14.55f, 17.621f, 13.96f, 18.041f, 13.55f)
                curveTo(18.411f, 13.17f, 18.921f, 12.95f, 19.481f, 12.95f)
                horizontalLineTo(21.561f)
                curveTo(22.121f, 12.97f, 22.561f, 13.42f, 22.561f, 13.97f)
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
                moveTo(7f, 12f)
                horizontalLineTo(14f)
            }
        }.build()

        return _EmptyWallet!!
    }

@Suppress("ObjectPropertyName")
private var _EmptyWallet: ImageVector? = null
