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

val VuesaxIconsTwotone.Sticker: ImageVector
    get() {
        if (_Sticker != null) {
            return _Sticker!!
        }
        _Sticker = ImageVector.Builder(
            name = "Sticker",
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
                moveTo(21.93f, 12.86f)
                curveTo(21.91f, 13.05f, 21.879f, 13.23f, 21.83f, 13.41f)
                curveTo(20.789f, 12.53f, 19.44f, 12f, 17.969f, 12f)
                curveTo(14.66f, 12f, 11.969f, 14.69f, 11.969f, 18f)
                curveTo(11.969f, 19.47f, 12.5f, 20.82f, 13.38f, 21.86f)
                curveTo(13.2f, 21.91f, 13.019f, 21.94f, 12.83f, 21.96f)
                curveTo(11.979f, 22.04f, 11.109f, 22f, 10.21f, 21.85f)
                curveTo(6.1f, 21.15f, 2.789f, 17.82f, 2.109f, 13.7f)
                curveTo(0.98f, 6.85f, 6.819f, 1.01f, 13.67f, 2.14f)
                curveTo(17.789f, 2.82f, 21.119f, 6.13f, 21.819f, 10.24f)
                curveTo(21.969f, 11.14f, 22.01f, 12.01f, 21.93f, 12.86f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.831f, 13.41f)
                curveTo(21.691f, 13.9f, 21.431f, 14.34f, 21.061f, 14.71f)
                lineTo(14.681f, 21.09f)
                curveTo(14.311f, 21.46f, 13.871f, 21.72f, 13.381f, 21.86f)
                curveTo(12.501f, 20.82f, 11.971f, 19.47f, 11.971f, 18f)
                curveTo(11.971f, 14.69f, 14.661f, 12f, 17.971f, 12f)
                curveTo(19.441f, 12f, 20.791f, 12.53f, 21.831f, 13.41f)
                close()
            }
        }.build()

        return _Sticker!!
    }

@Suppress("ObjectPropertyName")
private var _Sticker: ImageVector? = null
