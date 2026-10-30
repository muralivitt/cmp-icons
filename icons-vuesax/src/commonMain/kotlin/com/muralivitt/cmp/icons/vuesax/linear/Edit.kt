package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Edit: ImageVector
    get() {
        if (_Edit != null) {
            return _Edit!!
        }
        _Edit = ImageVector.Builder(
            name = "Edit",
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
                moveTo(11f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.04f, 3.02f)
                lineTo(8.16f, 10.9f)
                curveTo(7.86f, 11.2f, 7.56f, 11.79f, 7.5f, 12.22f)
                lineTo(7.07f, 15.23f)
                curveTo(6.91f, 16.32f, 7.68f, 17.08f, 8.77f, 16.93f)
                lineTo(11.78f, 16.5f)
                curveTo(12.2f, 16.44f, 12.79f, 16.14f, 13.1f, 15.84f)
                lineTo(20.98f, 7.96f)
                curveTo(22.34f, 6.6f, 22.98f, 5.02f, 20.98f, 3.02f)
                curveTo(18.98f, 1.02f, 17.4f, 1.66f, 16.04f, 3.02f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.91f, 4.15f)
                curveTo(15.58f, 6.54f, 17.45f, 8.41f, 19.85f, 9.09f)
            }
        }.build()

        return _Edit!!
    }

@Suppress("ObjectPropertyName")
private var _Edit: ImageVector? = null
