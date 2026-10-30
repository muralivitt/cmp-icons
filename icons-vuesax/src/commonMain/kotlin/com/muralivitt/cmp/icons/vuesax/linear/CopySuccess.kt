package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.CopySuccess: ImageVector
    get() {
        if (_CopySuccess != null) {
            return _CopySuccess!!
        }
        _CopySuccess = ImageVector.Builder(
            name = "CopySuccess",
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
                moveTo(22f, 11.1f)
                verticalLineTo(6.9f)
                curveTo(22f, 3.4f, 20.6f, 2f, 17.1f, 2f)
                horizontalLineTo(12.9f)
                curveTo(9.4f, 2f, 8f, 3.4f, 8f, 6.9f)
                verticalLineTo(8f)
                horizontalLineTo(11.1f)
                curveTo(14.6f, 8f, 16f, 9.4f, 16f, 12.9f)
                verticalLineTo(16f)
                horizontalLineTo(17.1f)
                curveTo(20.6f, 16f, 22f, 14.6f, 22f, 11.1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 17.1f)
                verticalLineTo(12.9f)
                curveTo(16f, 9.4f, 14.6f, 8f, 11.1f, 8f)
                horizontalLineTo(6.9f)
                curveTo(3.4f, 8f, 2f, 9.4f, 2f, 12.9f)
                verticalLineTo(17.1f)
                curveTo(2f, 20.6f, 3.4f, 22f, 6.9f, 22f)
                horizontalLineTo(11.1f)
                curveTo(14.6f, 22f, 16f, 20.6f, 16f, 17.1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.08f, 15f)
                lineTo(8.03f, 16.95f)
                lineTo(11.92f, 13.05f)
            }
        }.build()

        return _CopySuccess!!
    }

@Suppress("ObjectPropertyName")
private var _CopySuccess: ImageVector? = null
