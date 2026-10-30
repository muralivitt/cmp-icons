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

val VuesaxIconsTwotone.Bluetooth2: ImageVector
    get() {
        if (_Bluetooth2 != null) {
            return _Bluetooth2!!
        }
        _Bluetooth2 = ImageVector.Builder(
            name = "Bluetooth2",
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
                moveTo(4.64f, 18.64f)
                lineTo(16.99f, 7.32f)
                curveTo(17.5f, 6.85f, 17.49f, 6.1f, 16.95f, 5.65f)
                lineTo(13.1f, 2.44f)
                curveTo(12.1f, 1.61f, 11.28f, 1.99f, 11.28f, 3.29f)
                verticalLineTo(20.71f)
                curveTo(11.28f, 22.01f, 12.1f, 22.39f, 13.1f, 21.56f)
                lineTo(16.95f, 18.35f)
                curveTo(17.49f, 17.9f, 17.5f, 17.15f, 16.99f, 16.68f)
                lineTo(4.64f, 5.36f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 13f)
                curveTo(5.552f, 13f, 6f, 12.552f, 6f, 12f)
                curveTo(6f, 11.448f, 5.552f, 11f, 5f, 11f)
                curveTo(4.448f, 11f, 4f, 11.448f, 4f, 12f)
                curveTo(4f, 12.552f, 4.448f, 13f, 5f, 13f)
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
                moveTo(19f, 13f)
                curveTo(19.552f, 13f, 20f, 12.552f, 20f, 12f)
                curveTo(20f, 11.448f, 19.552f, 11f, 19f, 11f)
                curveTo(18.448f, 11f, 18f, 11.448f, 18f, 12f)
                curveTo(18f, 12.552f, 18.448f, 13f, 19f, 13f)
                close()
            }
        }.build()

        return _Bluetooth2!!
    }

@Suppress("ObjectPropertyName")
private var _Bluetooth2: ImageVector? = null
