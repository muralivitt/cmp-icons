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

val VuesaxIconsTwotone.ArchiveTick: ImageVector
    get() {
        if (_ArchiveTick != null) {
            return _ArchiveTick!!
        }
        _ArchiveTick = ImageVector.Builder(
            name = "ArchiveTick",
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
                moveTo(16.82f, 2f)
                horizontalLineTo(7.18f)
                curveTo(5.05f, 2f, 3.32f, 3.74f, 3.32f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(3.32f, 21.75f, 4.61f, 22.51f, 6.19f, 21.64f)
                lineTo(11.07f, 18.93f)
                curveTo(11.59f, 18.64f, 12.43f, 18.64f, 12.94f, 18.93f)
                lineTo(17.82f, 21.64f)
                curveTo(19.4f, 22.52f, 20.69f, 21.76f, 20.69f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(20.68f, 3.74f, 18.95f, 2f, 16.82f, 2f)
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
                moveTo(9.59f, 11f)
                lineTo(11.09f, 12.5f)
                lineTo(15.09f, 8.5f)
            }
        }.build()

        return _ArchiveTick!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveTick: ImageVector? = null
