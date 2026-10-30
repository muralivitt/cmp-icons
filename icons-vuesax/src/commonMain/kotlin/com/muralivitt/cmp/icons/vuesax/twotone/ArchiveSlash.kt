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

val VuesaxIconsTwotone.ArchiveSlash: ImageVector
    get() {
        if (_ArchiveSlash != null) {
            return _ArchiveSlash!!
        }
        _ArchiveSlash = ImageVector.Builder(
            name = "ArchiveSlash",
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
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.68f, 8.71f)
                verticalLineTo(19.71f)
                curveTo(20.68f, 21.72f, 19.24f, 22.57f, 17.48f, 21.59f)
                lineTo(11f, 17.54f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.32f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(3.32f, 3.74f, 5.05f, 2f, 7.18f, 2f)
                horizontalLineTo(16.83f)
                curveTo(18.04f, 2f, 19.12f, 2.56f, 19.83f, 3.44f)
            }
        }.build()

        return _ArchiveSlash!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveSlash: ImageVector? = null
