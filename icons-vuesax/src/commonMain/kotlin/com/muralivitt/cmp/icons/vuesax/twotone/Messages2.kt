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

val VuesaxIconsTwotone.Messages2: ImageVector
    get() {
        if (_Messages2 != null) {
            return _Messages2!!
        }
        _Messages2 = ImageVector.Builder(
            name = "Messages2",
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
                moveTo(18.47f, 16.83f)
                lineTo(18.86f, 19.99f)
                curveTo(18.96f, 20.82f, 18.07f, 21.4f, 17.36f, 20.97f)
                lineTo(13.17f, 18.48f)
                curveTo(12.71f, 18.48f, 12.26f, 18.45f, 11.82f, 18.39f)
                curveTo(12.56f, 17.52f, 13f, 16.42f, 13f, 15.23f)
                curveTo(13f, 12.39f, 10.54f, 10.09f, 7.5f, 10.09f)
                curveTo(6.34f, 10.09f, 5.27f, 10.42f, 4.38f, 11f)
                curveTo(4.35f, 10.75f, 4.34f, 10.5f, 4.34f, 10.24f)
                curveTo(4.34f, 5.69f, 8.29f, 2f, 13.17f, 2f)
                curveTo(18.05f, 2f, 22f, 5.69f, 22f, 10.24f)
                curveTo(22f, 12.94f, 20.61f, 15.33f, 18.47f, 16.83f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 15.23f)
                curveTo(13f, 16.42f, 12.56f, 17.52f, 11.82f, 18.39f)
                curveTo(10.83f, 19.59f, 9.26f, 20.36f, 7.5f, 20.36f)
                lineTo(4.89f, 21.91f)
                curveTo(4.45f, 22.18f, 3.89f, 21.81f, 3.95f, 21.3f)
                lineTo(4.2f, 19.33f)
                curveTo(2.86f, 18.4f, 2f, 16.91f, 2f, 15.23f)
                curveTo(2f, 13.47f, 2.94f, 11.92f, 4.38f, 11f)
                curveTo(5.27f, 10.42f, 6.34f, 10.09f, 7.5f, 10.09f)
                curveTo(10.54f, 10.09f, 13f, 12.39f, 13f, 15.23f)
                close()
            }
        }.build()

        return _Messages2!!
    }

@Suppress("ObjectPropertyName")
private var _Messages2: ImageVector? = null
