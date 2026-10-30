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

val VuesaxIconsTwotone.CloudMinus: ImageVector
    get() {
        if (_CloudMinus != null) {
            return _CloudMinus!!
        }
        _CloudMinus = ImageVector.Builder(
            name = "CloudMinus",
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
                moveTo(12.971f, 20f)
                horizontalLineTo(8.971f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.61f, 20f)
                curveTo(17.95f, 20.01f, 19.24f, 19.51f, 20.23f, 18.61f)
                curveTo(23.5f, 15.75f, 21.75f, 10.01f, 17.44f, 9.47f)
                curveTo(15.9f, 0.13f, 2.43f, 3.67f, 5.62f, 12.56f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.279f, 12.97f)
                curveTo(6.749f, 12.7f, 6.159f, 12.56f, 5.569f, 12.57f)
                curveTo(0.909f, 12.9f, 0.919f, 19.68f, 5.569f, 20.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.82f, 9.89f)
                curveTo(16.34f, 9.63f, 16.9f, 9.49f, 17.48f, 9.48f)
            }
        }.build()

        return _CloudMinus!!
    }

@Suppress("ObjectPropertyName")
private var _CloudMinus: ImageVector? = null
