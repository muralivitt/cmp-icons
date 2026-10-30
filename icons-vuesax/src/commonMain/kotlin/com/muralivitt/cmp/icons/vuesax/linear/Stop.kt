package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Stop: ImageVector
    get() {
        if (_Stop != null) {
            return _Stop!!
        }
        _Stop = ImageVector.Builder(
            name = "Stop",
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
                moveTo(9.3f, 21f)
                horizontalLineTo(14.7f)
                curveTo(19.2f, 21f, 21f, 19.2f, 21f, 14.7f)
                verticalLineTo(9.3f)
                curveTo(21f, 4.8f, 19.2f, 3f, 14.7f, 3f)
                horizontalLineTo(9.3f)
                curveTo(4.8f, 3f, 3f, 4.8f, 3f, 9.3f)
                verticalLineTo(14.7f)
                curveTo(3f, 19.2f, 4.8f, 21f, 9.3f, 21f)
                close()
            }
        }.build()

        return _Stop!!
    }

@Suppress("ObjectPropertyName")
private var _Stop: ImageVector? = null
