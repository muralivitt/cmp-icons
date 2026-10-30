package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Edit2: ImageVector
    get() {
        if (_Edit2 != null) {
            return _Edit2!!
        }
        _Edit2 = ImageVector.Builder(
            name = "Edit2",
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
                moveTo(13.26f, 3.6f)
                lineTo(5.05f, 12.29f)
                curveTo(4.74f, 12.62f, 4.44f, 13.27f, 4.38f, 13.72f)
                lineTo(4.01f, 16.96f)
                curveTo(3.88f, 18.13f, 4.72f, 18.93f, 5.88f, 18.73f)
                lineTo(9.1f, 18.18f)
                curveTo(9.55f, 18.1f, 10.18f, 17.77f, 10.49f, 17.43f)
                lineTo(18.7f, 8.74f)
                curveTo(20.12f, 7.24f, 20.76f, 5.53f, 18.55f, 3.44f)
                curveTo(16.35f, 1.37f, 14.68f, 2.1f, 13.26f, 3.6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.89f, 5.05f)
                curveTo(12.32f, 7.81f, 14.56f, 9.92f, 17.34f, 10.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 22f)
                horizontalLineTo(21f)
            }
        }.build()

        return _Edit2!!
    }

@Suppress("ObjectPropertyName")
private var _Edit2: ImageVector? = null
