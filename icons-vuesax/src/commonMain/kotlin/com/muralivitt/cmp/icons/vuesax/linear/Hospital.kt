package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Hospital: ImageVector
    get() {
        if (_Hospital != null) {
            return _Hospital!!
        }
        _Hospital = ImageVector.Builder(
            name = "Hospital",
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
                moveTo(2f, 22f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(4f, 2f, 3f, 3.79f, 3f, 6f)
                verticalLineTo(22f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                curveTo(21f, 3.79f, 20f, 2f, 17f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.06f, 15f)
                horizontalLineTo(9.93f)
                curveTo(9.42f, 15f, 8.99f, 15.42f, 8.99f, 15.94f)
                verticalLineTo(22f)
                horizontalLineTo(14.99f)
                verticalLineTo(15.94f)
                curveTo(15f, 15.42f, 14.58f, 15f, 14.06f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                verticalLineTo(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 8.5f)
                horizontalLineTo(14.5f)
            }
        }.build()

        return _Hospital!!
    }

@Suppress("ObjectPropertyName")
private var _Hospital: ImageVector? = null
