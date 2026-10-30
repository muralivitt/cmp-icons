package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Map1: ImageVector
    get() {
        if (_Map1 != null) {
            return _Map1!!
        }
        _Map1 = ImageVector.Builder(
            name = "Map1",
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
                moveTo(2.29f, 7.78f)
                verticalLineTo(17.51f)
                curveTo(2.29f, 19.41f, 3.64f, 20.19f, 5.28f, 19.25f)
                lineTo(7.63f, 17.91f)
                curveTo(8.14f, 17.62f, 8.99f, 17.59f, 9.52f, 17.86f)
                lineTo(14.77f, 20.49f)
                curveTo(15.3f, 20.75f, 16.15f, 20.73f, 16.66f, 20.44f)
                lineTo(20.99f, 17.96f)
                curveTo(21.54f, 17.64f, 22f, 16.86f, 22f, 16.22f)
                verticalLineTo(6.49f)
                curveTo(22f, 4.59f, 20.65f, 3.81f, 19.01f, 4.75f)
                lineTo(16.66f, 6.09f)
                curveTo(16.15f, 6.38f, 15.3f, 6.41f, 14.77f, 6.14f)
                lineTo(9.52f, 3.52f)
                curveTo(8.99f, 3.26f, 8.14f, 3.28f, 7.63f, 3.57f)
                lineTo(3.3f, 6.05f)
                curveTo(2.74f, 6.37f, 2.29f, 7.15f, 2.29f, 7.78f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.56f, 4f)
                verticalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.73f, 6.62f)
                verticalLineTo(20f)
            }
        }.build()

        return _Map1!!
    }

@Suppress("ObjectPropertyName")
private var _Map1: ImageVector? = null
