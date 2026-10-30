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

val VuesaxIconsTwotone.Setting2: ImageVector
    get() {
        if (_Setting2 != null) {
            return _Setting2!!
        }
        _Setting2 = ImageVector.Builder(
            name = "Setting2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                curveTo(13.657f, 15f, 15f, 13.657f, 15f, 12f)
                curveTo(15f, 10.343f, 13.657f, 9f, 12f, 9f)
                curveTo(10.343f, 9f, 9f, 10.343f, 9f, 12f)
                curveTo(9f, 13.657f, 10.343f, 15f, 12f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12.88f)
                verticalLineTo(11.12f)
                curveTo(2f, 10.08f, 2.85f, 9.22f, 3.9f, 9.22f)
                curveTo(5.71f, 9.22f, 6.45f, 7.94f, 5.54f, 6.37f)
                curveTo(5.02f, 5.47f, 5.33f, 4.3f, 6.24f, 3.78f)
                lineTo(7.97f, 2.79f)
                curveTo(8.76f, 2.32f, 9.78f, 2.6f, 10.25f, 3.39f)
                lineTo(10.36f, 3.58f)
                curveTo(11.26f, 5.15f, 12.74f, 5.15f, 13.65f, 3.58f)
                lineTo(13.76f, 3.39f)
                curveTo(14.23f, 2.6f, 15.25f, 2.32f, 16.04f, 2.79f)
                lineTo(17.77f, 3.78f)
                curveTo(18.68f, 4.3f, 18.99f, 5.47f, 18.47f, 6.37f)
                curveTo(17.56f, 7.94f, 18.3f, 9.22f, 20.11f, 9.22f)
                curveTo(21.15f, 9.22f, 22.01f, 10.07f, 22.01f, 11.12f)
                verticalLineTo(12.88f)
                curveTo(22.01f, 13.92f, 21.16f, 14.78f, 20.11f, 14.78f)
                curveTo(18.3f, 14.78f, 17.56f, 16.06f, 18.47f, 17.63f)
                curveTo(18.99f, 18.54f, 18.68f, 19.7f, 17.77f, 20.22f)
                lineTo(16.04f, 21.21f)
                curveTo(15.25f, 21.68f, 14.23f, 21.4f, 13.76f, 20.61f)
                lineTo(13.65f, 20.42f)
                curveTo(12.75f, 18.85f, 11.27f, 18.85f, 10.36f, 20.42f)
                lineTo(10.25f, 20.61f)
                curveTo(9.78f, 21.4f, 8.76f, 21.68f, 7.97f, 21.21f)
                lineTo(6.24f, 20.22f)
                curveTo(5.33f, 19.7f, 5.02f, 18.53f, 5.54f, 17.63f)
                curveTo(6.45f, 16.06f, 5.71f, 14.78f, 3.9f, 14.78f)
                curveTo(2.85f, 14.78f, 2f, 13.92f, 2f, 12.88f)
                close()
            }
        }.build()

        return _Setting2!!
    }

@Suppress("ObjectPropertyName")
private var _Setting2: ImageVector? = null
