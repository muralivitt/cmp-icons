package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.NoteAdd: ImageVector
    get() {
        if (_NoteAdd != null) {
            return _NoteAdd!!
        }
        _NoteAdd = ImageVector.Builder(
            name = "NoteAdd",
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
                moveTo(9.56f, 18f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15.5f)
                horizontalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.81f, 3.42f)
                curveTo(19.15f, 3.54f, 20.84f, 4.77f, 20.94f, 9.47f)
                lineTo(21.07f, 15.64f)
                curveTo(21.15f, 19.76f, 20.2f, 21.83f, 15.2f, 21.94f)
                lineTo(9.2f, 22.06f)
                curveTo(4.2f, 22.16f, 3.16f, 20.12f, 3.08f, 16.01f)
                lineTo(2.94f, 9.83f)
                curveTo(2.84f, 5.13f, 4.49f, 3.83f, 7.81f, 3.58f)
                lineTo(15.81f, 3.42f)
                close()
            }
        }.build()

        return _NoteAdd!!
    }

@Suppress("ObjectPropertyName")
private var _NoteAdd: ImageVector? = null
