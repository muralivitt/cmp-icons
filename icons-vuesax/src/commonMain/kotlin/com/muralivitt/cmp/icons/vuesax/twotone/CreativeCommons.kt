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

val VuesaxIconsTwotone.CreativeCommons: ImageVector
    get() {
        if (_CreativeCommons != null) {
            return _CreativeCommons!!
        }
        _CreativeCommons = ImageVector.Builder(
            name = "CreativeCommons",
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
                moveTo(12f, 22f)
                curveTo(6.48f, 22f, 2f, 17.52f, 2f, 12f)
                curveTo(2f, 6.48f, 6.48f, 2f, 12f, 2f)
                curveTo(17.52f, 2f, 22f, 6.48f, 22f, 12f)
                curveTo(22f, 17.52f, 17.52f, 22f, 12f, 22f)
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
                moveTo(10.879f, 14.15f)
                curveTo(10.369f, 14.59f, 9.709f, 14.87f, 8.989f, 14.87f)
                curveTo(7.409f, 14.87f, 6.119f, 13.59f, 6.119f, 12f)
                curveTo(6.119f, 10.41f, 7.399f, 9.13f, 8.989f, 9.13f)
                curveTo(9.719f, 9.13f, 10.379f, 9.4f, 10.879f, 9.85f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.879f, 14.15f)
                curveTo(17.369f, 14.59f, 16.709f, 14.87f, 15.989f, 14.87f)
                curveTo(14.409f, 14.87f, 13.119f, 13.59f, 13.119f, 12f)
                curveTo(13.119f, 10.41f, 14.399f, 9.13f, 15.989f, 9.13f)
                curveTo(16.719f, 9.13f, 17.379f, 9.4f, 17.879f, 9.85f)
            }
        }.build()

        return _CreativeCommons!!
    }

@Suppress("ObjectPropertyName")
private var _CreativeCommons: ImageVector? = null
