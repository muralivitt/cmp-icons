package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.SidebarTop: ImageVector
    get() {
        if (_SidebarTop != null) {
            return _SidebarTop!!
        }
        _SidebarTop = ImageVector.Builder(
            name = "SidebarTop",
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
                moveTo(21.971f, 15f)
                verticalLineTo(9f)
                curveTo(21.971f, 4f, 19.971f, 2f, 14.971f, 2f)
                horizontalLineTo(8.971f)
                curveTo(3.971f, 2f, 1.971f, 4f, 1.971f, 9f)
                verticalLineTo(15f)
                curveTo(1.971f, 20f, 3.971f, 22f, 8.971f, 22f)
                horizontalLineTo(14.971f)
                curveTo(19.971f, 22f, 21.971f, 20f, 21.971f, 15f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 8.5f)
                horizontalLineTo(2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.559f, 15.5f)
                lineTo(12f, 12.94f)
                lineTo(9.439f, 15.5f)
            }
        }.build()

        return _SidebarTop!!
    }

@Suppress("ObjectPropertyName")
private var _SidebarTop: ImageVector? = null
