package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Group: ImageVector
    get() {
        if (_Group != null) {
            return _Group!!
        }
        _Group = ImageVector.Builder(
            name = "Group",
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
                moveTo(8.57f, 15.27f)
                lineTo(15.11f, 8.73f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.98f, 10.37f)
                curveTo(9.659f, 10.37f, 10.21f, 9.819f, 10.21f, 9.14f)
                curveTo(10.21f, 8.461f, 9.659f, 7.91f, 8.98f, 7.91f)
                curveTo(8.301f, 7.91f, 7.75f, 8.461f, 7.75f, 9.14f)
                curveTo(7.75f, 9.819f, 8.301f, 10.37f, 8.98f, 10.37f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.52f, 16.09f)
                curveTo(16.199f, 16.09f, 16.75f, 15.539f, 16.75f, 14.86f)
                curveTo(16.75f, 14.181f, 16.199f, 13.63f, 15.52f, 13.63f)
                curveTo(14.841f, 13.63f, 14.29f, 14.181f, 14.29f, 14.86f)
                curveTo(14.29f, 15.539f, 14.841f, 16.09f, 15.52f, 16.09f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _Group!!
    }

@Suppress("ObjectPropertyName")
private var _Group: ImageVector? = null
