package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Data: ImageVector
    get() {
        if (_Data != null) {
            return _Data!!
        }
        _Data = ImageVector.Builder(
            name = "Data",
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
                moveTo(20f, 14f)
                curveTo(21.105f, 14f, 22f, 13.105f, 22f, 12f)
                curveTo(22f, 10.895f, 21.105f, 10f, 20f, 10f)
                curveTo(18.895f, 10f, 18f, 10.895f, 18f, 12f)
                curveTo(18f, 13.105f, 18.895f, 14f, 20f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 6f)
                curveTo(21.105f, 6f, 22f, 5.105f, 22f, 4f)
                curveTo(22f, 2.895f, 21.105f, 2f, 20f, 2f)
                curveTo(18.895f, 2f, 18f, 2.895f, 18f, 4f)
                curveTo(18f, 5.105f, 18.895f, 6f, 20f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 22f)
                curveTo(21.105f, 22f, 22f, 21.105f, 22f, 20f)
                curveTo(22f, 18.895f, 21.105f, 18f, 20f, 18f)
                curveTo(18.895f, 18f, 18f, 18.895f, 18f, 20f)
                curveTo(18f, 21.105f, 18.895f, 22f, 20f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 14f)
                curveTo(5.105f, 14f, 6f, 13.105f, 6f, 12f)
                curveTo(6f, 10.895f, 5.105f, 10f, 4f, 10f)
                curveTo(2.895f, 10f, 2f, 10.895f, 2f, 12f)
                curveTo(2f, 13.105f, 2.895f, 14f, 4f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 4f)
                horizontalLineTo(14f)
                curveTo(12f, 4f, 11f, 5f, 11f, 7f)
                verticalLineTo(17f)
                curveTo(11f, 19f, 12f, 20f, 14f, 20f)
                horizontalLineTo(18f)
            }
        }.build()

        return _Data!!
    }

@Suppress("ObjectPropertyName")
private var _Data: ImageVector? = null
