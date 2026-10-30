package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Folder2: ImageVector
    get() {
        if (_Folder2 != null) {
            return _Folder2!!
        }
        _Folder2 = ImageVector.Builder(
            name = "Folder2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(22f, 11f)
                verticalLineTo(17f)
                curveTo(22f, 21f, 21f, 22f, 17f, 22f)
                horizontalLineTo(7f)
                curveTo(3f, 22f, 2f, 21f, 2f, 17f)
                verticalLineTo(7f)
                curveTo(2f, 3f, 3f, 2f, 7f, 2f)
                horizontalLineTo(8.5f)
                curveTo(10f, 2f, 10.33f, 2.44f, 10.9f, 3.2f)
                lineTo(12.4f, 5.2f)
                curveTo(12.78f, 5.7f, 13f, 6f, 14f, 6f)
                horizontalLineTo(17f)
                curveTo(21f, 6f, 22f, 7f, 22f, 11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 2f)
                horizontalLineTo(17f)
                curveTo(19f, 2f, 20f, 3f, 20f, 5f)
                verticalLineTo(6.38f)
            }
        }.build()

        return _Folder2!!
    }

@Suppress("ObjectPropertyName")
private var _Folder2: ImageVector? = null
