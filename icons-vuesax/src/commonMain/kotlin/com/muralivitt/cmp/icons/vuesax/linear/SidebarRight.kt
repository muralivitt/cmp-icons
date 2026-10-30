package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.SidebarRight: ImageVector
    get() {
        if (_SidebarRight != null) {
            return _SidebarRight!!
        }
        _SidebarRight = ImageVector.Builder(
            name = "SidebarRight",
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
                moveTo(21.97f, 15f)
                verticalLineTo(9f)
                curveTo(21.97f, 4f, 19.97f, 2f, 14.97f, 2f)
                horizontalLineTo(8.97f)
                curveTo(3.97f, 2f, 1.97f, 4f, 1.97f, 9f)
                verticalLineTo(15f)
                curveTo(1.97f, 20f, 3.97f, 22f, 8.97f, 22f)
                horizontalLineTo(14.97f)
                curveTo(19.97f, 22f, 21.97f, 20f, 21.97f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.97f, 2f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.97f, 9.44f)
                lineTo(10.53f, 12f)
                lineTo(7.97f, 14.56f)
            }
        }.build()

        return _SidebarRight!!
    }

@Suppress("ObjectPropertyName")
private var _SidebarRight: ImageVector? = null
