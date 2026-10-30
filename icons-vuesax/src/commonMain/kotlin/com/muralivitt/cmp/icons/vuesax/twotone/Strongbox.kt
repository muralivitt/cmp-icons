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

val VuesaxIconsTwotone.Strongbox: ImageVector
    get() {
        if (_Strongbox != null) {
            return _Strongbox!!
        }
        _Strongbox = ImageVector.Builder(
            name = "Strongbox",
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
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(14.351f, 10.91f)
                curveTo(14.251f, 11.62f, 13.831f, 12.22f, 13.251f, 12.58f)
                verticalLineTo(14.56f)
                curveTo(13.251f, 15.25f, 12.691f, 15.81f, 12.001f, 15.81f)
                curveTo(11.311f, 15.81f, 10.751f, 15.25f, 10.751f, 14.56f)
                verticalLineTo(12.58f)
                curveTo(10.171f, 12.22f, 9.751f, 11.62f, 9.651f, 10.91f)
                curveTo(9.631f, 10.8f, 9.621f, 10.68f, 9.621f, 10.56f)
                curveTo(9.621f, 9.04f, 11.061f, 7.86f, 12.641f, 8.28f)
                curveTo(13.441f, 8.49f, 14.091f, 9.14f, 14.301f, 9.94f)
                curveTo(14.391f, 10.27f, 14.401f, 10.6f, 14.351f, 10.91f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(22f, 10.91f)
                horizontalLineTo(14.35f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(9.65f, 10.91f)
                horizontalLineTo(2f)
            }
        }.build()

        return _Strongbox!!
    }

@Suppress("ObjectPropertyName")
private var _Strongbox: ImageVector? = null
