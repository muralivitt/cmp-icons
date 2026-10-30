package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.CreativeCommons: ImageVector
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.88f, 14.15f)
                curveTo(10.37f, 14.59f, 9.71f, 14.87f, 8.99f, 14.87f)
                curveTo(7.41f, 14.87f, 6.12f, 13.59f, 6.12f, 12f)
                curveTo(6.12f, 10.41f, 7.4f, 9.13f, 8.99f, 9.13f)
                curveTo(9.72f, 9.13f, 10.38f, 9.4f, 10.88f, 9.85f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.88f, 14.15f)
                curveTo(17.37f, 14.59f, 16.71f, 14.87f, 15.99f, 14.87f)
                curveTo(14.41f, 14.87f, 13.12f, 13.59f, 13.12f, 12f)
                curveTo(13.12f, 10.41f, 14.4f, 9.13f, 15.99f, 9.13f)
                curveTo(16.72f, 9.13f, 17.38f, 9.4f, 17.88f, 9.85f)
            }
        }.build()

        return _CreativeCommons!!
    }

@Suppress("ObjectPropertyName")
private var _CreativeCommons: ImageVector? = null
