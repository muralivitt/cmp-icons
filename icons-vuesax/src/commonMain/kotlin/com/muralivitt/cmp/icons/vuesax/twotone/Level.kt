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

val VuesaxIconsTwotone.Level: ImageVector
    get() {
        if (_Level != null) {
            return _Level!!
        }
        _Level = ImageVector.Builder(
            name = "Level",
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
                moveTo(2.199f, 14.02f)
                curveTo(3.129f, 18.58f, 7.159f, 22f, 11.999f, 22f)
                curveTo(16.819f, 22f, 20.839f, 18.59f, 21.789f, 14.05f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.809f, 10.06f)
                curveTo(20.909f, 5.46f, 16.859f, 2f, 11.999f, 2f)
                curveTo(7.169f, 2f, 3.139f, 5.43f, 2.199f, 9.98f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13.5f)
                curveTo(12.828f, 13.5f, 13.5f, 12.828f, 13.5f, 12f)
                curveTo(13.5f, 11.172f, 12.828f, 10.5f, 12f, 10.5f)
                curveTo(11.172f, 10.5f, 10.5f, 11.172f, 10.5f, 12f)
                curveTo(10.5f, 12.828f, 11.172f, 13.5f, 12f, 13.5f)
                close()
            }
        }.build()

        return _Level!!
    }

@Suppress("ObjectPropertyName")
private var _Level: ImageVector? = null
