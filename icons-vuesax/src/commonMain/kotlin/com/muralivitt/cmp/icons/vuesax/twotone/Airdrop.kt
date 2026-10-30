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

val VuesaxIconsTwotone.Airdrop: ImageVector
    get() {
        if (_Airdrop != null) {
            return _Airdrop!!
        }
        _Airdrop = ImageVector.Builder(
            name = "Airdrop",
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
                moveTo(14.13f, 11.34f)
                curveTo(14.52f, 9.7f, 13.09f, 8.27f, 11.45f, 8.66f)
                curveTo(10.68f, 8.85f, 10.05f, 9.48f, 9.86f, 10.25f)
                curveTo(9.47f, 11.89f, 10.9f, 13.32f, 12.54f, 12.93f)
                curveTo(13.32f, 12.74f, 13.95f, 12.11f, 14.13f, 11.34f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.01f, 17.19f)
                curveTo(19.72f, 15.59f, 20.79f, 13.32f, 20.79f, 10.79f)
                curveTo(20.79f, 5.93f, 16.85f, 2f, 12f, 2f)
                curveTo(7.15f, 2f, 3.21f, 5.94f, 3.21f, 10.79f)
                curveTo(3.21f, 13.33f, 4.29f, 15.62f, 6.02f, 17.22f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14.55f)
                curveTo(7.08f, 13.57f, 6.51f, 12.25f, 6.51f, 10.79f)
                curveTo(6.51f, 7.76f, 8.97f, 5.3f, 12f, 5.3f)
                curveTo(15.03f, 5.3f, 17.49f, 7.76f, 17.49f, 10.79f)
                curveTo(17.49f, 12.25f, 16.92f, 13.56f, 16f, 14.55f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.3f, 16.66f)
                lineTo(8.86f, 18.45f)
                curveTo(7.72f, 19.88f, 8.73f, 21.99f, 10.56f, 21.99f)
                horizontalLineTo(13.43f)
                curveTo(15.26f, 21.99f, 16.28f, 19.87f, 15.13f, 18.45f)
                lineTo(13.69f, 16.66f)
                curveTo(12.83f, 15.57f, 11.17f, 15.57f, 10.3f, 16.66f)
                close()
            }
        }.build()

        return _Airdrop!!
    }

@Suppress("ObjectPropertyName")
private var _Airdrop: ImageVector? = null
