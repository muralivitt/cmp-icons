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

val VuesaxIconsTwotone.MonitorRecorder: ImageVector
    get() {
        if (_MonitorRecorder != null) {
            return _MonitorRecorder!!
        }
        _MonitorRecorder = ImageVector.Builder(
            name = "MonitorRecorder",
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
                moveTo(22f, 11.89f)
                verticalLineTo(12.78f)
                curveTo(22f, 16.34f, 21.11f, 17.22f, 17.56f, 17.22f)
                horizontalLineTo(6.44f)
                curveTo(2.89f, 17.22f, 2f, 16.33f, 2f, 12.78f)
                verticalLineTo(6.44f)
                curveTo(2f, 2.89f, 2.89f, 2f, 6.44f, 2f)
                horizontalLineTo(8f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17.22f)
                verticalLineTo(22f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 13f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 22f)
                horizontalLineTo(16.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.86f, 9.37f)
                horizontalLineTo(13.1f)
                curveTo(11.72f, 9.37f, 11.26f, 8.45f, 11.26f, 7.53f)
                verticalLineTo(4.01f)
                curveTo(11.26f, 2.91f, 12.16f, 2.01f, 13.26f, 2.01f)
                horizontalLineTo(17.86f)
                curveTo(18.88f, 2.01f, 19.7f, 2.83f, 19.7f, 3.85f)
                verticalLineTo(7.53f)
                curveTo(19.7f, 8.55f, 18.88f, 9.37f, 17.86f, 9.37f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.91f, 7.92f)
                lineTo(19.7f, 7.07f)
                verticalLineTo(4.31f)
                lineTo(20.91f, 3.46f)
                curveTo(21.51f, 3.05f, 22f, 3.3f, 22f, 4.03f)
                verticalLineTo(7.36f)
                curveTo(22f, 8.09f, 21.51f, 8.34f, 20.91f, 7.92f)
                close()
            }
        }.build()

        return _MonitorRecorder!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorRecorder: ImageVector? = null
