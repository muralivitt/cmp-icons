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

val VuesaxIconsTwotone.PauseCircle: ImageVector
    get() {
        if (_PauseCircle != null) {
            return _PauseCircle!!
        }
        _PauseCircle = ImageVector.Builder(
            name = "PauseCircle",
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
                moveTo(11.971f, 22f)
                curveTo(17.494f, 22f, 21.971f, 17.523f, 21.971f, 12f)
                curveTo(21.971f, 6.477f, 17.494f, 2f, 11.971f, 2f)
                curveTo(6.448f, 2f, 1.971f, 6.477f, 1.971f, 12f)
                curveTo(1.971f, 17.523f, 6.448f, 22f, 11.971f, 22f)
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
                moveTo(10.72f, 14.53f)
                verticalLineTo(9.47f)
                curveTo(10.72f, 8.99f, 10.52f, 8.8f, 10.01f, 8.8f)
                horizontalLineTo(8.71f)
                curveTo(8.2f, 8.8f, 8f, 8.99f, 8f, 9.47f)
                verticalLineTo(14.53f)
                curveTo(8f, 15.01f, 8.2f, 15.2f, 8.71f, 15.2f)
                horizontalLineTo(10f)
                curveTo(10.52f, 15.2f, 10.72f, 15.01f, 10.72f, 14.53f)
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
                moveTo(15.999f, 14.53f)
                verticalLineTo(9.47f)
                curveTo(15.999f, 8.99f, 15.799f, 8.8f, 15.289f, 8.8f)
                horizontalLineTo(13.999f)
                curveTo(13.489f, 8.8f, 13.289f, 8.99f, 13.289f, 9.47f)
                verticalLineTo(14.53f)
                curveTo(13.289f, 15.01f, 13.489f, 15.2f, 13.999f, 15.2f)
                horizontalLineTo(15.289f)
                curveTo(15.799f, 15.2f, 15.999f, 15.01f, 15.999f, 14.53f)
                close()
            }
        }.build()

        return _PauseCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PauseCircle: ImageVector? = null
