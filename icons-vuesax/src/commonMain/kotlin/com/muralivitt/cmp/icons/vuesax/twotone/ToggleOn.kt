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

val VuesaxIconsTwotone.ToggleOn: ImageVector
    get() {
        if (_ToggleOn != null) {
            return _ToggleOn!!
        }
        _ToggleOn = ImageVector.Builder(
            name = "ToggleOn",
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
                moveTo(13.3f, 16f)
                horizontalLineTo(15.7f)
                curveTo(17.7f, 16f, 18.5f, 15.2f, 18.5f, 13.2f)
                verticalLineTo(10.8f)
                curveTo(18.5f, 8.8f, 17.7f, 8f, 15.7f, 8f)
                horizontalLineTo(13.3f)
                curveTo(11.3f, 8f, 10.5f, 8.8f, 10.5f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(10.5f, 15.2f, 11.3f, 16f, 13.3f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 20f)
                horizontalLineTo(7f)
                curveTo(3f, 20f, 2f, 19f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 5f, 3f, 4f, 7f, 4f)
                horizontalLineTo(17f)
                curveTo(21f, 4f, 22f, 5f, 22f, 9f)
                verticalLineTo(15f)
                curveTo(22f, 19f, 21f, 20f, 17f, 20f)
                close()
            }
        }.build()

        return _ToggleOn!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleOn: ImageVector? = null
