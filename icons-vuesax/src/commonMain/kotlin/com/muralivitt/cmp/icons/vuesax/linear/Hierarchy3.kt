package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Hierarchy3: ImageVector
    get() {
        if (_Hierarchy3 != null) {
            return _Hierarchy3!!
        }
        _Hierarchy3 = ImageVector.Builder(
            name = "Hierarchy3",
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
                moveTo(5f, 8f)
                curveTo(6.657f, 8f, 8f, 6.657f, 8f, 5f)
                curveTo(8f, 3.343f, 6.657f, 2f, 5f, 2f)
                curveTo(3.343f, 2f, 2f, 3.343f, 2f, 5f)
                curveTo(2f, 6.657f, 3.343f, 8f, 5f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 15f)
                curveTo(20.657f, 15f, 22f, 13.657f, 22f, 12f)
                curveTo(22f, 10.343f, 20.657f, 9f, 19f, 9f)
                curveTo(17.343f, 9f, 16f, 10.343f, 16f, 12f)
                curveTo(16f, 13.657f, 17.343f, 15f, 19f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 22f)
                curveTo(6.657f, 22f, 8f, 20.657f, 8f, 19f)
                curveTo(8f, 17.343f, 6.657f, 16f, 5f, 16f)
                curveTo(3.343f, 16f, 2f, 17.343f, 2f, 19f)
                curveTo(2f, 20.657f, 3.343f, 22f, 5f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12f)
                horizontalLineTo(9f)
                curveTo(6.8f, 12f, 5f, 11f, 5f, 8f)
                verticalLineTo(16f)
            }
        }.build()

        return _Hierarchy3!!
    }

@Suppress("ObjectPropertyName")
private var _Hierarchy3: ImageVector? = null
