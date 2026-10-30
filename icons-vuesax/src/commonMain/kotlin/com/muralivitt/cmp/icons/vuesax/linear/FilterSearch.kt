package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.FilterSearch: ImageVector
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.32f, 19.07f)
                curveTo(14.32f, 19.68f, 13.92f, 20.48f, 13.41f, 20.79f)
                lineTo(12f, 21.7f)
                curveTo(10.69f, 22.51f, 8.87f, 21.6f, 8.87f, 19.98f)
                verticalLineTo(14.63f)
                curveTo(8.87f, 13.92f, 8.47f, 13.01f, 8.06f, 12.51f)
                lineTo(4.22f, 8.47f)
                curveTo(3.71f, 7.96f, 3.31f, 7.06f, 3.31f, 6.45f)
                verticalLineTo(4.13f)
                curveTo(3.31f, 2.92f, 4.22f, 2.01f, 5.33f, 2.01f)
                horizontalLineTo(18.67f)
                curveTo(19.78f, 2.01f, 20.69f, 2.92f, 20.69f, 4.03f)
                verticalLineTo(6.25f)
                curveTo(20.69f, 7.06f, 20.18f, 8.07f, 19.68f, 8.57f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.07f, 16.52f)
                curveTo(17.837f, 16.52f, 19.27f, 15.087f, 19.27f, 13.32f)
                curveTo(19.27f, 11.553f, 17.837f, 10.12f, 16.07f, 10.12f)
                curveTo(14.303f, 10.12f, 12.87f, 11.553f, 12.87f, 13.32f)
                curveTo(12.87f, 15.087f, 14.303f, 16.52f, 16.07f, 16.52f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.87f, 17.12f)
                lineTo(18.87f, 16.12f)
            }
        }.build()

        return _FilterSearch!!
    }

@Suppress("ObjectPropertyName")
private var _FilterSearch: ImageVector? = null
