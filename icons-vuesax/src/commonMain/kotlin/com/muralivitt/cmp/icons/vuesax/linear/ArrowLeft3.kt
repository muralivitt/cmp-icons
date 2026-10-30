package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.ArrowLeft3: ImageVector
    get() {
        if (_ArrowLeft3 != null) {
            return _ArrowLeft3!!
        }
        _ArrowLeft3 = ImageVector.Builder(
            name = "ArrowLeft3",
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
                moveTo(18f, 12f)
                verticalLineTo(14.67f)
                curveTo(18f, 17.98f, 15.65f, 19.34f, 12.78f, 17.68f)
                lineTo(10.47f, 16.34f)
                lineTo(8.16f, 15f)
                curveTo(5.29f, 13.34f, 5.29f, 10.63f, 8.16f, 8.97f)
                lineTo(10.47f, 7.63f)
                lineTo(12.78f, 6.29f)
                curveTo(15.65f, 4.66f, 18f, 6.01f, 18f, 9.33f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _ArrowLeft3!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft3: ImageVector? = null
