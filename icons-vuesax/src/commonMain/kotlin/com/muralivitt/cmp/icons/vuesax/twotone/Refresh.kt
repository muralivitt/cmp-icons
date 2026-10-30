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

val VuesaxIconsTwotone.Refresh: ImageVector
    get() {
        if (_Refresh != null) {
            return _Refresh!!
        }
        _Refresh = ImageVector.Builder(
            name = "Refresh",
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
                moveTo(14.55f, 21.67f)
                curveTo(18.84f, 20.54f, 22f, 16.64f, 22f, 12f)
                curveTo(22f, 6.48f, 17.56f, 2f, 12f, 2f)
                curveTo(5.33f, 2f, 2f, 7.56f, 2f, 7.56f)
                moveTo(2f, 7.56f)
                verticalLineTo(3f)
                moveTo(2f, 7.56f)
                horizontalLineTo(4.01f)
                horizontalLineTo(6.44f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
            }
        }.build()

        return _Refresh!!
    }

@Suppress("ObjectPropertyName")
private var _Refresh: ImageVector? = null
