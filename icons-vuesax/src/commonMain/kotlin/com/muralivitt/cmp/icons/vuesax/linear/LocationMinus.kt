package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.LocationMinus: ImageVector
    get() {
        if (_LocationMinus != null) {
            return _LocationMinus!!
        }
        _LocationMinus = ImageVector.Builder(
            name = "LocationMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(9.25f, 11f)
                horizontalLineTo(14.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(3.62f, 8.49f)
                curveTo(5.59f, -0.17f, 18.42f, -0.16f, 20.38f, 8.5f)
                curveTo(21.53f, 13.58f, 18.37f, 17.88f, 15.6f, 20.54f)
                curveTo(13.59f, 22.48f, 10.41f, 22.48f, 8.39f, 20.54f)
                curveTo(5.63f, 17.88f, 2.47f, 13.57f, 3.62f, 8.49f)
                close()
            }
        }.build()

        return _LocationMinus!!
    }

@Suppress("ObjectPropertyName")
private var _LocationMinus: ImageVector? = null
