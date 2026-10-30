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

val VuesaxIconsTwotone.Refresh2: ImageVector
    get() {
        if (_Refresh2 != null) {
            return _Refresh2!!
        }
        _Refresh2 = ImageVector.Builder(
            name = "Refresh2",
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
                moveTo(2f, 12f)
                curveTo(2f, 6.48f, 6.44f, 2f, 12f, 2f)
                curveTo(18.67f, 2f, 22f, 7.56f, 22f, 7.56f)
                moveTo(22f, 7.56f)
                verticalLineTo(2.56f)
                moveTo(22f, 7.56f)
                horizontalLineTo(17.56f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.89f, 12f)
                curveTo(21.89f, 17.52f, 17.41f, 22f, 11.89f, 22f)
                curveTo(6.37f, 22f, 3f, 16.44f, 3f, 16.44f)
                moveTo(3f, 16.44f)
                horizontalLineTo(7.52f)
                moveTo(3f, 16.44f)
                verticalLineTo(21.44f)
            }
        }.build()

        return _Refresh2!!
    }

@Suppress("ObjectPropertyName")
private var _Refresh2: ImageVector? = null
