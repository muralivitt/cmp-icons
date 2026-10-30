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

val VuesaxIconsTwotone.Grammerly: ImageVector
    get() {
        if (_Grammerly != null) {
            return _Grammerly!!
        }
        _Grammerly = ImageVector.Builder(
            name = "Grammerly",
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
                moveTo(19.071f, 4.95f)
                curveTo(23.041f, 8.92f, 22.971f, 15.4f, 18.871f, 19.29f)
                curveTo(15.081f, 22.88f, 8.931f, 22.88f, 5.131f, 19.29f)
                curveTo(1.021f, 15.4f, 0.951f, 8.92f, 4.931f, 4.95f)
                curveTo(8.831f, 1.04f, 15.171f, 1.04f, 19.071f, 4.95f)
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
                moveTo(15.84f, 16.07f)
                curveTo(13.72f, 18.07f, 10.28f, 18.07f, 8.17f, 16.07f)
            }
        }.build()

        return _Grammerly!!
    }

@Suppress("ObjectPropertyName")
private var _Grammerly: ImageVector? = null
