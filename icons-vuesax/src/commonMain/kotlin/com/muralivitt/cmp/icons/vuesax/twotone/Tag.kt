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

val VuesaxIconsTwotone.Tag: ImageVector
    get() {
        if (_Tag != null) {
            return _Tag!!
        }
        _Tag = ImageVector.Builder(
            name = "Tag",
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
                moveTo(4.17f, 15.3f)
                lineTo(8.7f, 19.83f)
                curveTo(10.56f, 21.69f, 13.58f, 21.69f, 15.45f, 19.83f)
                lineTo(19.84f, 15.44f)
                curveTo(21.7f, 13.58f, 21.7f, 10.56f, 19.84f, 8.69f)
                lineTo(15.3f, 4.17f)
                curveTo(14.35f, 3.22f, 13.04f, 2.71f, 11.7f, 2.78f)
                lineTo(6.7f, 3.02f)
                curveTo(4.7f, 3.11f, 3.11f, 4.7f, 3.01f, 6.69f)
                lineTo(2.77f, 11.69f)
                curveTo(2.71f, 13.04f, 3.22f, 14.35f, 4.17f, 15.3f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(9.5f, 12f)
                curveTo(10.881f, 12f, 12f, 10.881f, 12f, 9.5f)
                curveTo(12f, 8.119f, 10.881f, 7f, 9.5f, 7f)
                curveTo(8.119f, 7f, 7f, 8.119f, 7f, 9.5f)
                curveTo(7f, 10.881f, 8.119f, 12f, 9.5f, 12f)
                close()
            }
        }.build()

        return _Tag!!
    }

@Suppress("ObjectPropertyName")
private var _Tag: ImageVector? = null
