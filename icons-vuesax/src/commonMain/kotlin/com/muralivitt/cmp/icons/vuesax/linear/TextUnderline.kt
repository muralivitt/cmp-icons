package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.TextUnderline: ImageVector
    get() {
        if (_TextUnderline != null) {
            return _TextUnderline!!
        }
        _TextUnderline = ImageVector.Builder(
            name = "TextUnderline",
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
                moveTo(5f, 21f)
                horizontalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 3f)
                verticalLineTo(10f)
                curveTo(5f, 13.87f, 8.13f, 17f, 12f, 17f)
                curveTo(15.87f, 17f, 19f, 13.87f, 19f, 10f)
                verticalLineTo(3f)
            }
        }.build()

        return _TextUnderline!!
    }

@Suppress("ObjectPropertyName")
private var _TextUnderline: ImageVector? = null
