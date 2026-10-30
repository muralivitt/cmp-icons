package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Paperclip: ImageVector
    get() {
        if (_Paperclip != null) {
            return _Paperclip!!
        }
        _Paperclip = ImageVector.Builder(
            name = "Paperclip",
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
                moveTo(11.97f, 12f)
                verticalLineTo(15.5f)
                curveTo(11.97f, 17.43f, 13.54f, 19f, 15.47f, 19f)
                curveTo(17.4f, 19f, 18.97f, 17.43f, 18.97f, 15.5f)
                verticalLineTo(10f)
                curveTo(18.97f, 6.13f, 15.84f, 3f, 11.97f, 3f)
                curveTo(8.1f, 3f, 4.97f, 6.13f, 4.97f, 10f)
                verticalLineTo(16f)
                curveTo(4.97f, 19.31f, 7.66f, 22f, 10.97f, 22f)
            }
        }.build()

        return _Paperclip!!
    }

@Suppress("ObjectPropertyName")
private var _Paperclip: ImageVector? = null
