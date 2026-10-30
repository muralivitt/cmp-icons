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

val VuesaxIconsTwotone.Star: ImageVector
    get() {
        if (_Star != null) {
            return _Star!!
        }
        _Star = ImageVector.Builder(
            name = "Star",
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
                moveTo(15.391f, 5.21f)
                lineTo(16.801f, 8.03f)
                curveTo(16.991f, 8.42f, 17.501f, 8.79f, 17.931f, 8.87f)
                lineTo(20.481f, 9.29f)
                curveTo(22.111f, 9.56f, 22.491f, 10.74f, 21.321f, 11.92f)
                lineTo(19.331f, 13.91f)
                curveTo(19.001f, 14.24f, 18.811f, 14.89f, 18.921f, 15.36f)
                lineTo(19.491f, 17.82f)
                curveTo(19.941f, 19.76f, 18.901f, 20.52f, 17.191f, 19.5f)
                lineTo(14.801f, 18.08f)
                curveTo(14.371f, 17.82f, 13.651f, 17.82f, 13.221f, 18.08f)
                lineTo(10.831f, 19.5f)
                curveTo(9.121f, 20.51f, 8.081f, 19.76f, 8.531f, 17.82f)
                lineTo(9.101f, 15.36f)
                curveTo(9.211f, 14.9f, 9.021f, 14.25f, 8.691f, 13.91f)
                lineTo(6.701f, 11.92f)
                curveTo(5.531f, 10.75f, 5.911f, 9.57f, 7.541f, 9.29f)
                lineTo(10.091f, 8.87f)
                curveTo(10.521f, 8.8f, 11.031f, 8.42f, 11.221f, 8.03f)
                lineTo(12.631f, 5.21f)
                curveTo(13.381f, 3.68f, 14.621f, 3.68f, 15.391f, 5.21f)
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
                moveTo(8f, 5f)
                horizontalLineTo(2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 19f)
                horizontalLineTo(2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                horizontalLineTo(2f)
            }
        }.build()

        return _Star!!
    }

@Suppress("ObjectPropertyName")
private var _Star: ImageVector? = null
