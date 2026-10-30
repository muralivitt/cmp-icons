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

val VuesaxIconsTwotone.Mirror: ImageVector
    get() {
        if (_Mirror != null) {
            return _Mirror!!
        }
        _Mirror = ImageVector.Builder(
            name = "Mirror",
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
                moveTo(12f, 18f)
                curveTo(16.418f, 18f, 20f, 14.418f, 20f, 10f)
                curveTo(20f, 5.582f, 16.418f, 2f, 12f, 2f)
                curveTo(7.582f, 2f, 4f, 5.582f, 4f, 10f)
                curveTo(4f, 14.418f, 7.582f, 18f, 12f, 18f)
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
                moveTo(6f, 22f)
                horizontalLineTo(18f)
            }
        }.build()

        return _Mirror!!
    }

@Suppress("ObjectPropertyName")
private var _Mirror: ImageVector? = null
