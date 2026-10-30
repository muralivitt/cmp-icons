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

val VuesaxIconsTwotone.Cloud: ImageVector
    get() {
        if (_Cloud != null) {
            return _Cloud!!
        }
        _Cloud = ImageVector.Builder(
            name = "Cloud",
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
                moveTo(7.269f, 13.01f)
                curveTo(6.739f, 12.74f, 6.149f, 12.6f, 5.549f, 12.6f)
                curveTo(0.869f, 12.93f, 0.869f, 19.74f, 5.549f, 20.07f)
                horizontalLineTo(16.639f)
                curveTo(17.989f, 20.08f, 19.289f, 19.58f, 20.279f, 18.67f)
                curveTo(23.569f, 15.8f, 21.809f, 10.03f, 17.479f, 9.48f)
                curveTo(15.919f, 0.11f, 2.389f, 3.67f, 5.599f, 12.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.85f, 9.92f)
                curveTo(16.37f, 9.66f, 16.94f, 9.52f, 17.52f, 9.51f)
            }
        }.build()

        return _Cloud!!
    }

@Suppress("ObjectPropertyName")
private var _Cloud: ImageVector? = null
