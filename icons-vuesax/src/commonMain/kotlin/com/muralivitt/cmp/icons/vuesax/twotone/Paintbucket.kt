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

val VuesaxIconsTwotone.Paintbucket: ImageVector
    get() {
        if (_Paintbucket != null) {
            return _Paintbucket!!
        }
        _Paintbucket = ImageVector.Builder(
            name = "Paintbucket",
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
                moveTo(3.771f, 15.56f)
                lineTo(7.231f, 19.02f)
                curveTo(9.661f, 21.45f, 10.491f, 21.41f, 12.891f, 19.02f)
                lineTo(18.461f, 13.45f)
                curveTo(20.401f, 11.51f, 20.891f, 10.22f, 18.461f, 7.79f)
                lineTo(15.001f, 4.33f)
                curveTo(12.411f, 1.74f, 11.281f, 2.39f, 9.341f, 4.33f)
                lineTo(3.771f, 9.9f)
                curveTo(1.381f, 12.3f, 1.181f, 12.97f, 3.771f, 15.56f)
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
                moveTo(19.199f, 16.79f)
                lineTo(18.539f, 17.88f)
                curveTo(17.61f, 19.43f, 18.33f, 20.7f, 20.139f, 20.7f)
                curveTo(21.949f, 20.7f, 22.67f, 19.43f, 21.74f, 17.88f)
                lineTo(21.08f, 16.79f)
                curveTo(20.559f, 15.93f, 19.709f, 15.93f, 19.199f, 16.79f)
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
                moveTo(2f, 12.24f)
                curveTo(7.56f, 10.73f, 13.42f, 10.68f, 19f, 12.11f)
                lineTo(19.5f, 12.24f)
            }
        }.build()

        return _Paintbucket!!
    }

@Suppress("ObjectPropertyName")
private var _Paintbucket: ImageVector? = null
