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

val VuesaxIconsTwotone.Messages: ImageVector
    get() {
        if (_Messages != null) {
            return _Messages!!
        }
        _Messages = ImageVector.Builder(
            name = "Messages",
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
                moveTo(17f, 9f)
                curveTo(17f, 12.87f, 13.64f, 16f, 9.5f, 16f)
                lineTo(8.57f, 17.12f)
                lineTo(8.02f, 17.78f)
                curveTo(7.55f, 18.34f, 6.65f, 18.22f, 6.34f, 17.55f)
                lineTo(5f, 14.6f)
                curveTo(3.18f, 13.32f, 2f, 11.29f, 2f, 9f)
                curveTo(2f, 5.13f, 5.36f, 2f, 9.5f, 2f)
                curveTo(12.52f, 2f, 15.13f, 3.67f, 16.3f, 6.07f)
                curveTo(16.75f, 6.96f, 17f, 7.95f, 17f, 9f)
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
                moveTo(22f, 12.86f)
                curveTo(22f, 15.15f, 20.82f, 17.18f, 19f, 18.46f)
                lineTo(17.66f, 21.41f)
                curveTo(17.35f, 22.08f, 16.45f, 22.21f, 15.98f, 21.64f)
                lineTo(14.5f, 19.86f)
                curveTo(12.08f, 19.86f, 9.92f, 18.79f, 8.57f, 17.12f)
                lineTo(9.5f, 16f)
                curveTo(13.64f, 16f, 17f, 12.87f, 17f, 9f)
                curveTo(17f, 7.95f, 16.75f, 6.96f, 16.3f, 6.07f)
                curveTo(19.57f, 6.82f, 22f, 9.58f, 22f, 12.86f)
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
                moveTo(7f, 9f)
                horizontalLineTo(12f)
            }
        }.build()

        return _Messages!!
    }

@Suppress("ObjectPropertyName")
private var _Messages: ImageVector? = null
