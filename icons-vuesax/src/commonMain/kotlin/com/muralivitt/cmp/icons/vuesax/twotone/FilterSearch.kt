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

val VuesaxIconsTwotone.FilterSearch: ImageVector
    get() {
        if (_FilterSearch != null) {
            return _FilterSearch!!
        }
        _FilterSearch = ImageVector.Builder(
            name = "FilterSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.321f, 19.07f)
                curveTo(14.321f, 19.68f, 13.92f, 20.48f, 13.41f, 20.79f)
                lineTo(12f, 21.7f)
                curveTo(10.691f, 22.51f, 8.871f, 21.6f, 8.871f, 19.98f)
                verticalLineTo(14.63f)
                curveTo(8.871f, 13.92f, 8.471f, 13.01f, 8.061f, 12.51f)
                lineTo(4.221f, 8.47f)
                curveTo(3.711f, 7.96f, 3.311f, 7.06f, 3.311f, 6.45f)
                verticalLineTo(4.13f)
                curveTo(3.311f, 2.92f, 4.221f, 2.01f, 5.331f, 2.01f)
                horizontalLineTo(18.67f)
                curveTo(19.781f, 2.01f, 20.691f, 2.92f, 20.691f, 4.03f)
                verticalLineTo(6.25f)
                curveTo(20.691f, 7.06f, 20.181f, 8.07f, 19.681f, 8.57f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.069f, 16.52f)
                curveTo(17.837f, 16.52f, 19.269f, 15.087f, 19.269f, 13.32f)
                curveTo(19.269f, 11.553f, 17.837f, 10.12f, 16.069f, 10.12f)
                curveTo(14.302f, 10.12f, 12.869f, 11.553f, 12.869f, 13.32f)
                curveTo(12.869f, 15.087f, 14.302f, 16.52f, 16.069f, 16.52f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.869f, 17.12f)
                lineTo(18.869f, 16.12f)
            }
        }.build()

        return _FilterSearch!!
    }

@Suppress("ObjectPropertyName")
private var _FilterSearch: ImageVector? = null
