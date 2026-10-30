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

val VuesaxIconsTwotone.Paperclip: ImageVector
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
                moveTo(11.971f, 12f)
                verticalLineTo(15.5f)
                curveTo(11.971f, 17.43f, 13.541f, 19f, 15.471f, 19f)
                curveTo(17.401f, 19f, 18.971f, 17.43f, 18.971f, 15.5f)
                verticalLineTo(10f)
                curveTo(18.971f, 6.13f, 15.841f, 3f, 11.971f, 3f)
                curveTo(8.101f, 3f, 4.971f, 6.13f, 4.971f, 10f)
                verticalLineTo(16f)
                curveTo(4.971f, 19.31f, 7.661f, 22f, 10.971f, 22f)
            }
        }.build()

        return _Paperclip!!
    }

@Suppress("ObjectPropertyName")
private var _Paperclip: ImageVector? = null
