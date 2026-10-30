package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Send1: ImageVector
    get() {
        if (_Send1 != null) {
            return _Send1!!
        }
        _Send1 = ImageVector.Builder(
            name = "Send1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18.069f, 8.509f)
                lineTo(9.509f, 4.229f)
                curveTo(3.759f, 1.349f, 1.399f, 3.709f, 4.279f, 9.459f)
                lineTo(5.149f, 11.199f)
                curveTo(5.399f, 11.709f, 5.399f, 12.299f, 5.149f, 12.809f)
                lineTo(4.279f, 14.539f)
                curveTo(1.399f, 20.289f, 3.749f, 22.649f, 9.509f, 19.769f)
                lineTo(18.069f, 15.489f)
                curveTo(21.909f, 13.569f, 21.909f, 10.429f, 18.069f, 8.509f)
                close()
                moveTo(14.839f, 12.749f)
                horizontalLineTo(9.439f)
                curveTo(9.029f, 12.749f, 8.689f, 12.409f, 8.689f, 11.999f)
                curveTo(8.689f, 11.589f, 9.029f, 11.249f, 9.439f, 11.249f)
                horizontalLineTo(14.839f)
                curveTo(15.249f, 11.249f, 15.589f, 11.589f, 15.589f, 11.999f)
                curveTo(15.589f, 12.409f, 15.249f, 12.749f, 14.839f, 12.749f)
                close()
            }
        }.build()

        return _Send1!!
    }

@Suppress("ObjectPropertyName")
private var _Send1: ImageVector? = null
