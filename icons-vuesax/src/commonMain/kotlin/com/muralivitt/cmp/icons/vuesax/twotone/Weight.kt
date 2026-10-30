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

val VuesaxIconsTwotone.Weight: ImageVector
    get() {
        if (_Weight != null) {
            return _Weight!!
        }
        _Weight = ImageVector.Builder(
            name = "Weight",
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
                moveTo(10f, 22f)
                horizontalLineTo(14f)
                curveTo(19f, 22f, 21f, 20f, 21f, 15f)
                verticalLineTo(9f)
                curveTo(21f, 4f, 19f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                curveTo(5f, 2f, 3f, 4f, 3f, 9f)
                verticalLineTo(15f)
                curveTo(3f, 20f, 5f, 22f, 10f, 22f)
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
                moveTo(17.25f, 8.29f)
                curveTo(14.26f, 5.63f, 9.74f, 5.63f, 6.75f, 8.29f)
                lineTo(8.93f, 11.79f)
                curveTo(10.68f, 10.23f, 13.32f, 10.23f, 15.07f, 11.79f)
                lineTo(17.25f, 8.29f)
                close()
            }
        }.build()

        return _Weight!!
    }

@Suppress("ObjectPropertyName")
private var _Weight: ImageVector? = null
