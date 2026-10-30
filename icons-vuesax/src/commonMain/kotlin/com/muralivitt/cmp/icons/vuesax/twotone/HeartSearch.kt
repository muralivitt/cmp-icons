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

val VuesaxIconsTwotone.HeartSearch: ImageVector
    get() {
        if (_HeartSearch != null) {
            return _HeartSearch!!
        }
        _HeartSearch = ImageVector.Builder(
            name = "HeartSearch",
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
                moveTo(21.49f, 12f)
                curveTo(21.81f, 10.98f, 22f, 9.88f, 22f, 8.69f)
                curveTo(22f, 5.6f, 19.51f, 3.1f, 16.44f, 3.1f)
                curveTo(14.62f, 3.1f, 13.01f, 3.98f, 12f, 5.34f)
                curveTo(10.99f, 3.98f, 9.37f, 3.1f, 7.56f, 3.1f)
                curveTo(4.49f, 3.1f, 2f, 5.6f, 2f, 8.69f)
                curveTo(2f, 15.69f, 8.48f, 19.82f, 11.38f, 20.82f)
                curveTo(11.55f, 20.88f, 11.77f, 20.91f, 12f, 20.91f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.739f, 21f)
                curveTo(19.506f, 21f, 20.939f, 19.567f, 20.939f, 17.8f)
                curveTo(20.939f, 16.033f, 19.506f, 14.6f, 17.739f, 14.6f)
                curveTo(15.972f, 14.6f, 14.539f, 16.033f, 14.539f, 17.8f)
                curveTo(14.539f, 19.567f, 15.972f, 21f, 17.739f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.539f, 21.6f)
                lineTo(20.539f, 20.6f)
            }
        }.build()

        return _HeartSearch!!
    }

@Suppress("ObjectPropertyName")
private var _HeartSearch: ImageVector? = null
