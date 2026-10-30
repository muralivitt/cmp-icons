package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MessageText: ImageVector
    get() {
        if (_MessageText != null) {
            return _MessageText!!
        }
        _MessageText = ImageVector.Builder(
            name = "MessageText",
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
                moveTo(16f, 2f)
                horizontalLineTo(8f)
                curveTo(4f, 2f, 2f, 4f, 2f, 8f)
                verticalLineTo(21f)
                curveTo(2f, 21.55f, 2.45f, 22f, 3f, 22f)
                horizontalLineTo(16f)
                curveTo(20f, 22f, 22f, 20f, 22f, 16f)
                verticalLineTo(8f)
                curveTo(22f, 4f, 20f, 2f, 16f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9.5f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 14.5f)
                horizontalLineTo(14f)
            }
        }.build()

        return _MessageText!!
    }

@Suppress("ObjectPropertyName")
private var _MessageText: ImageVector? = null
