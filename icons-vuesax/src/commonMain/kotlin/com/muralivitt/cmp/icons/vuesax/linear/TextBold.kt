package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.TextBold: ImageVector
    get() {
        if (_TextBold != null) {
            return _TextBold!!
        }
        _TextBold = ImageVector.Builder(
            name = "TextBold",
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
                moveTo(4.88f, 4.5f)
                curveTo(4.88f, 3.4f, 5.78f, 2.5f, 6.88f, 2.5f)
                horizontalLineTo(12f)
                curveTo(14.62f, 2.5f, 16.75f, 4.63f, 16.75f, 7.25f)
                curveTo(16.75f, 9.87f, 14.62f, 12f, 12f, 12f)
                horizontalLineTo(4.88f)
                verticalLineTo(4.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.88f, 12f)
                horizontalLineTo(14.38f)
                curveTo(17f, 12f, 19.13f, 14.13f, 19.13f, 16.75f)
                curveTo(19.13f, 19.37f, 17f, 21.5f, 14.38f, 21.5f)
                horizontalLineTo(6.88f)
                curveTo(5.78f, 21.5f, 4.88f, 20.6f, 4.88f, 19.5f)
                verticalLineTo(12f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _TextBold!!
    }

@Suppress("ObjectPropertyName")
private var _TextBold: ImageVector? = null
