package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Code: ImageVector
    get() {
        if (_Code != null) {
            return _Code!!
        }
        _Code = ImageVector.Builder(
            name = "Code",
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
                moveTo(9f, 13f)
                curveTo(8.34f, 13.33f, 7.79f, 13.82f, 7.38f, 14.43f)
                curveTo(7.15f, 14.78f, 7.15f, 15.22f, 7.38f, 15.57f)
                curveTo(7.79f, 16.18f, 8.34f, 16.67f, 9f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.21f, 13f)
                curveTo(15.87f, 13.33f, 16.42f, 13.82f, 16.83f, 14.43f)
                curveTo(17.06f, 14.78f, 17.06f, 15.22f, 16.83f, 15.57f)
                curveTo(16.42f, 16.18f, 15.87f, 16.67f, 15.21f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.23f, 8.01f)
                lineTo(21.45f, 8f)
            }
        }.build()

        return _Code!!
    }

@Suppress("ObjectPropertyName")
private var _Code: ImageVector? = null
