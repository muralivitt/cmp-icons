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

val VuesaxIconsTwotone.Status: ImageVector
    get() {
        if (_Status != null) {
            return _Status!!
        }
        _Status = ImageVector.Builder(
            name = "Status",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.449f, 14.97f)
                curveTo(3.519f, 18.41f, 6.399f, 21.06f, 9.979f, 21.79f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.051f, 10.98f)
                curveTo(2.561f, 5.93f, 6.821f, 2f, 12.001f, 2f)
                curveTo(17.181f, 2f, 21.441f, 5.94f, 21.951f, 10.98f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.01f, 21.8f)
                curveTo(17.58f, 21.07f, 20.45f, 18.45f, 21.54f, 15.02f)
            }
        }.build()

        return _Status!!
    }

@Suppress("ObjectPropertyName")
private var _Status: ImageVector? = null
