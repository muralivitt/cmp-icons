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

val VuesaxIconsTwotone.Medal: ImageVector
    get() {
        if (_Medal != null) {
            return _Medal!!
        }
        _Medal = ImageVector.Builder(
            name = "Medal",
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
                moveTo(12f, 15f)
                curveTo(15.728f, 15f, 18.75f, 12.09f, 18.75f, 8.5f)
                curveTo(18.75f, 4.91f, 15.728f, 2f, 12f, 2f)
                curveTo(8.272f, 2f, 5.25f, 4.91f, 5.25f, 8.5f)
                curveTo(5.25f, 12.09f, 8.272f, 15f, 12f, 15f)
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
                moveTo(7.52f, 13.52f)
                lineTo(7.51f, 20.9f)
                curveTo(7.51f, 21.8f, 8.14f, 22.24f, 8.92f, 21.87f)
                lineTo(11.6f, 20.6f)
                curveTo(11.82f, 20.49f, 12.19f, 20.49f, 12.41f, 20.6f)
                lineTo(15.1f, 21.87f)
                curveTo(15.87f, 22.23f, 16.51f, 21.8f, 16.51f, 20.9f)
                verticalLineTo(13.34f)
            }
        }.build()

        return _Medal!!
    }

@Suppress("ObjectPropertyName")
private var _Medal: ImageVector? = null
