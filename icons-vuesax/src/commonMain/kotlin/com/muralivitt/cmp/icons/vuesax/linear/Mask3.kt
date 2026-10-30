package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Mask3: ImageVector
    get() {
        if (_Mask3 != null) {
            return _Mask3!!
        }
        _Mask3 = ImageVector.Builder(
            name = "Mask3",
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
                moveTo(21.97f, 12f)
                curveTo(21.97f, 14.94f, 20.69f, 17.6f, 18.65f, 19.41f)
                curveTo(16.89f, 21.01f, 14.56f, 21.97f, 12f, 21.97f)
                curveTo(6.5f, 21.97f, 2.03f, 17.5f, 2.03f, 12f)
                curveTo(2.03f, 6.5f, 6.5f, 2.03f, 12f, 2.03f)
                curveTo(14.56f, 2.03f, 16.89f, 2.99f, 18.65f, 4.59f)
                curveTo(20.69f, 6.4f, 21.97f, 9.06f, 21.97f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.97f, 16.39f)
                curveTo(11.95f, 18.04f, 10.72f, 18.44f, 9.57f, 17.98f)
                curveTo(7.2f, 17.03f, 5.53f, 14.71f, 5.53f, 12f)
                curveTo(5.53f, 9.29f, 7.2f, 6.97f, 9.57f, 6.01f)
                curveTo(10.72f, 5.55f, 11.95f, 5.96f, 11.97f, 7.6f)
                verticalLineTo(16.39f)
                close()
            }
        }.build()

        return _Mask3!!
    }

@Suppress("ObjectPropertyName")
private var _Mask3: ImageVector? = null
