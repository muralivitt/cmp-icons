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

val VuesaxIconsTwotone.Glass: ImageVector
    get() {
        if (_Glass != null) {
            return _Glass!!
        }
        _Glass = ImageVector.Builder(
            name = "Glass",
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
                moveTo(8.161f, 22f)
                curveTo(3.981f, 22f, 3.141f, 19.47f, 4.501f, 16.39f)
                lineTo(8.751f, 6.74f)
                horizontalLineTo(8.451f)
                curveTo(7.801f, 6.74f, 7.201f, 6.48f, 6.771f, 6.05f)
                curveTo(6.331f, 5.62f, 6.071f, 5.02f, 6.071f, 4.37f)
                curveTo(6.071f, 3.07f, 7.131f, 2f, 8.441f, 2f)
                horizontalLineTo(15.551f)
                curveTo(16.211f, 2f, 16.801f, 2.27f, 17.231f, 2.7f)
                curveTo(17.791f, 3.26f, 18.071f, 4.08f, 17.861f, 4.95f)
                curveTo(17.591f, 6.03f, 16.551f, 6.74f, 15.441f, 6.74f)
                horizontalLineTo(15.281f)
                lineTo(19.501f, 16.4f)
                curveTo(20.851f, 19.48f, 19.971f, 22f, 15.831f, 22f)
                horizontalLineTo(8.161f)
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
                moveTo(5.939f, 13.12f)
                curveTo(5.939f, 13.12f, 8.999f, 13f, 12f, 14f)
                curveTo(15f, 15f, 17.83f, 13.11f, 17.83f, 13.11f)
            }
        }.build()

        return _Glass!!
    }

@Suppress("ObjectPropertyName")
private var _Glass: ImageVector? = null
