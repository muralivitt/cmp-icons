package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Headphone: ImageVector
    get() {
        if (_Headphone != null) {
            return _Headphone!!
        }
        _Headphone = ImageVector.Builder(
            name = "Headphone",
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
                moveTo(5.46f, 18.49f)
                verticalLineTo(15.57f)
                curveTo(5.46f, 14.6f, 6.22f, 13.73f, 7.3f, 13.73f)
                curveTo(8.27f, 13.73f, 9.14f, 14.49f, 9.14f, 15.57f)
                verticalLineTo(18.38f)
                curveTo(9.14f, 20.33f, 7.52f, 21.95f, 5.57f, 21.95f)
                curveTo(3.62f, 21.95f, 2f, 20.32f, 2f, 18.38f)
                verticalLineTo(12.22f)
                curveTo(1.89f, 6.6f, 6.33f, 2.05f, 11.95f, 2.05f)
                curveTo(17.57f, 2.05f, 22f, 6.6f, 22f, 12.11f)
                verticalLineTo(18.27f)
                curveTo(22f, 20.22f, 20.38f, 21.84f, 18.43f, 21.84f)
                curveTo(16.48f, 21.84f, 14.86f, 20.22f, 14.86f, 18.27f)
                verticalLineTo(15.46f)
                curveTo(14.86f, 14.49f, 15.62f, 13.62f, 16.7f, 13.62f)
                curveTo(17.67f, 13.62f, 18.54f, 14.38f, 18.54f, 15.46f)
                verticalLineTo(18.49f)
            }
        }.build()

        return _Headphone!!
    }

@Suppress("ObjectPropertyName")
private var _Headphone: ImageVector? = null
