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

val VuesaxIconsTwotone.NoteSquare: ImageVector
    get() {
        if (_NoteSquare != null) {
            return _NoteSquare!!
        }
        _NoteSquare = ImageVector.Builder(
            name = "NoteSquare",
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
                moveTo(22f, 10f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(11f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.51f, 22f)
                curveTo(16.614f, 22f, 17.51f, 21.105f, 17.51f, 20f)
                curveTo(17.51f, 18.895f, 16.614f, 18f, 15.51f, 18f)
                curveTo(14.405f, 18f, 13.51f, 18.895f, 13.51f, 20f)
                curveTo(13.51f, 21.105f, 14.405f, 22f, 15.51f, 22f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.51f, 20f)
                verticalLineTo(13.01f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.82f, 12.07f)
                lineTo(21.03f, 12.81f)
                curveTo(21.56f, 12.99f, 22f, 13.59f, 22f, 14.16f)
                verticalLineTo(14.75f)
                curveTo(22f, 15.51f, 21.41f, 15.94f, 20.69f, 15.7f)
                lineTo(18.48f, 14.96f)
                curveTo(17.95f, 14.78f, 17.51f, 14.18f, 17.51f, 13.61f)
                verticalLineTo(13.02f)
                curveTo(17.51f, 12.25f, 18.1f, 11.83f, 18.82f, 12.07f)
                close()
            }
        }.build()

        return _NoteSquare!!
    }

@Suppress("ObjectPropertyName")
private var _NoteSquare: ImageVector? = null
