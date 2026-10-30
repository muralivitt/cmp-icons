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

val VuesaxIconsTwotone.Flag: ImageVector
    get() {
        if (_Flag != null) {
            return _Flag!!
        }
        _Flag = ImageVector.Builder(
            name = "Flag",
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
                moveTo(5.15f, 2f)
                verticalLineTo(22f)
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.15f, 4f)
                horizontalLineTo(16.35f)
                curveTo(19.05f, 4f, 19.65f, 5.5f, 17.75f, 7.4f)
                lineTo(16.55f, 8.6f)
                curveTo(15.75f, 9.4f, 15.75f, 10.7f, 16.55f, 11.4f)
                lineTo(17.75f, 12.6f)
                curveTo(19.65f, 14.5f, 18.95f, 16f, 16.35f, 16f)
                horizontalLineTo(5.15f)
            }
        }.build()

        return _Flag!!
    }

@Suppress("ObjectPropertyName")
private var _Flag: ImageVector? = null
