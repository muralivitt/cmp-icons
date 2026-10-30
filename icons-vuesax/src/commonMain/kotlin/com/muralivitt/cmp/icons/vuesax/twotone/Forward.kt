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

val VuesaxIconsTwotone.Forward: ImageVector
    get() {
        if (_Forward != null) {
            return _Forward!!
        }
        _Forward = ImageVector.Builder(
            name = "Forward",
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
                moveTo(2f, 8.34f)
                verticalLineTo(15.66f)
                curveTo(2f, 17.16f, 3.63f, 18.1f, 4.93f, 17.35f)
                lineTo(8.1f, 15.53f)
                lineTo(11.27f, 13.7f)
                curveTo(11.47f, 13.58f, 11.63f, 13.45f, 11.76f, 13.29f)
                verticalLineTo(10.73f)
                curveTo(11.63f, 10.57f, 11.47f, 10.44f, 11.27f, 10.32f)
                lineTo(8.1f, 8.49f)
                lineTo(4.93f, 6.67f)
                curveTo(3.63f, 5.9f, 2f, 6.84f, 2f, 8.34f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.76f, 8.34f)
                verticalLineTo(15.66f)
                curveTo(11.76f, 17.16f, 13.39f, 18.1f, 14.69f, 17.35f)
                lineTo(17.86f, 15.53f)
                lineTo(21.03f, 13.7f)
                curveTo(22.33f, 12.95f, 22.33f, 11.08f, 21.03f, 10.32f)
                lineTo(17.86f, 8.49f)
                lineTo(14.69f, 6.67f)
                curveTo(13.39f, 5.9f, 11.76f, 6.84f, 11.76f, 8.34f)
                close()
            }
        }.build()

        return _Forward!!
    }

@Suppress("ObjectPropertyName")
private var _Forward: ImageVector? = null
