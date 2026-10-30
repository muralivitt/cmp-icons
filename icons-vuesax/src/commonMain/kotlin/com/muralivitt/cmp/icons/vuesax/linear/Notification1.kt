package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Notification1: ImageVector
    get() {
        if (_Notification1 != null) {
            return _Notification1!!
        }
        _Notification1 = ImageVector.Builder(
            name = "Notification1",
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
                moveTo(19f, 8f)
                curveTo(20.657f, 8f, 22f, 6.657f, 22f, 5f)
                curveTo(22f, 3.343f, 20.657f, 2f, 19f, 2f)
                curveTo(17.343f, 2f, 16f, 3.343f, 16f, 5f)
                curveTo(16f, 6.657f, 17.343f, 8f, 19f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(10f)
            }
        }.build()

        return _Notification1!!
    }

@Suppress("ObjectPropertyName")
private var _Notification1: ImageVector? = null
