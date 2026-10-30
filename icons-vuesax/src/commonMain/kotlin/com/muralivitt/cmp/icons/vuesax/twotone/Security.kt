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

val VuesaxIconsTwotone.Security: ImageVector
    get() {
        if (_Security != null) {
            return _Security!!
        }
        _Security = ImageVector.Builder(
            name = "Security",
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
                moveTo(20.91f, 11.12f)
                curveTo(20.91f, 16.01f, 17.36f, 20.59f, 12.51f, 21.93f)
                curveTo(12.18f, 22.02f, 11.82f, 22.02f, 11.49f, 21.93f)
                curveTo(6.64f, 20.59f, 3.09f, 16.01f, 3.09f, 11.12f)
                verticalLineTo(6.73f)
                curveTo(3.09f, 5.91f, 3.71f, 4.98f, 4.48f, 4.67f)
                lineTo(10.05f, 2.39f)
                curveTo(11.3f, 1.88f, 12.71f, 1.88f, 13.96f, 2.39f)
                lineTo(19.53f, 4.67f)
                curveTo(20.29f, 4.98f, 20.92f, 5.91f, 20.92f, 6.73f)
                lineTo(20.91f, 11.12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.04f, 2.39f)
                curveTo(11.29f, 1.88f, 12.7f, 1.88f, 13.95f, 2.39f)
                lineTo(19.52f, 4.67f)
                curveTo(20.28f, 4.98f, 20.91f, 5.91f, 20.91f, 6.73f)
                verticalLineTo(11.12f)
                curveTo(20.91f, 16.01f, 17.36f, 20.59f, 12.51f, 21.93f)
                curveTo(12.18f, 22.02f, 11.82f, 22.02f, 11.49f, 21.93f)
                curveTo(6.64f, 20.59f, 3.09f, 16.01f, 3.09f, 11.12f)
            }
        }.build()

        return _Security!!
    }

@Suppress("ObjectPropertyName")
private var _Security: ImageVector? = null
