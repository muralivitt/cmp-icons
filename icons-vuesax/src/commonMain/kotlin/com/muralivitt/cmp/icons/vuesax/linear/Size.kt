package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Size: ImageVector
    get() {
        if (_Size != null) {
            return _Size!!
        }
        _Size = ImageVector.Builder(
            name = "Size",
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
                moveTo(16.97f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(16.97f, 20.5f, 15.47f, 22f, 11.72f, 22f)
                horizontalLineTo(7.22f)
                curveTo(3.47f, 22f, 1.97f, 20.5f, 1.97f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(1.97f, 8.5f, 3.47f, 7f, 7.22f, 7f)
                horizontalLineTo(11.72f)
                curveTo(15.47f, 7f, 16.97f, 8.5f, 16.97f, 12.25f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.97f, 5.85f)
                verticalLineTo(9.15f)
                curveTo(21.97f, 11.9f, 20.87f, 13f, 18.12f, 13f)
                horizontalLineTo(16.97f)
                verticalLineTo(12.25f)
                curveTo(16.97f, 8.5f, 15.47f, 7f, 11.72f, 7f)
                horizontalLineTo(10.97f)
                verticalLineTo(5.85f)
                curveTo(10.97f, 3.1f, 12.07f, 2f, 14.82f, 2f)
                horizontalLineTo(18.12f)
                curveTo(20.87f, 2f, 21.97f, 3.1f, 21.97f, 5.85f)
                close()
            }
        }.build()

        return _Size!!
    }

@Suppress("ObjectPropertyName")
private var _Size: ImageVector? = null
