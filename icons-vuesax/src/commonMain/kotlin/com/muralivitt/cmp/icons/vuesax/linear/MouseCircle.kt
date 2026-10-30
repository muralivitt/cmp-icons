package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MouseCircle: ImageVector
    get() {
        if (_MouseCircle != null) {
            return _MouseCircle!!
        }
        _MouseCircle = ImageVector.Builder(
            name = "MouseCircle",
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
                moveTo(20.96f, 17.84f)
                lineTo(19.33f, 18.39f)
                curveTo(18.88f, 18.54f, 18.52f, 18.89f, 18.37f, 19.35f)
                lineTo(17.82f, 20.98f)
                curveTo(17.35f, 22.39f, 15.37f, 22.36f, 14.93f, 20.95f)
                lineTo(13.08f, 15f)
                curveTo(12.72f, 13.82f, 13.81f, 12.72f, 14.98f, 13.09f)
                lineTo(20.94f, 14.94f)
                curveTo(22.34f, 15.38f, 22.36f, 17.37f, 20.96f, 17.84f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
            }
        }.build()

        return _MouseCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MouseCircle: ImageVector? = null
