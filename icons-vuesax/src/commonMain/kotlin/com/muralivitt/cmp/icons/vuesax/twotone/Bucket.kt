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

val VuesaxIconsTwotone.Bucket: ImageVector
    get() {
        if (_Bucket != null) {
            return _Bucket!!
        }
        _Bucket = ImageVector.Builder(
            name = "Bucket",
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
                moveTo(7.009f, 18f)
                lineTo(2.999f, 13.99f)
                curveTo(1.659f, 12.65f, 1.659f, 11.32f, 2.999f, 9.98f)
                lineTo(9.679f, 3.3f)
                lineTo(17.029f, 10.65f)
                curveTo(17.399f, 11.02f, 17.399f, 11.62f, 17.029f, 11.99f)
                lineTo(11.009f, 18.01f)
                curveTo(9.689f, 19.33f, 8.349f, 19.33f, 7.009f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.35f, 1.95f)
                lineTo(9.69f, 3.29f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.07f, 11.92f)
                lineTo(17.19f, 11.26f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 22f)
                horizontalLineTo(16f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.85f, 15f)
                curveTo(18.85f, 15f, 17f, 17.01f, 17f, 18.24f)
                curveTo(17f, 19.26f, 17.83f, 20.09f, 18.85f, 20.09f)
                curveTo(19.87f, 20.09f, 20.7f, 19.26f, 20.7f, 18.24f)
                curveTo(20.7f, 17.01f, 18.85f, 15f, 18.85f, 15f)
                close()
            }
        }.build()

        return _Bucket!!
    }

@Suppress("ObjectPropertyName")
private var _Bucket: ImageVector? = null
