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

val VuesaxIconsTwotone.MusicDashboard: ImageVector
    get() {
        if (_MusicDashboard != null) {
            return _MusicDashboard!!
        }
        _MusicDashboard = ImageVector.Builder(
            name = "MusicDashboard",
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
                moveTo(22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
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
                moveTo(7f, 2.5f)
                verticalLineTo(21.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.47f, 16.8f)
                curveTo(12.293f, 16.8f, 12.96f, 16.133f, 12.96f, 15.31f)
                curveTo(12.96f, 14.487f, 12.293f, 13.82f, 11.47f, 13.82f)
                curveTo(10.648f, 13.82f, 9.98f, 14.487f, 9.98f, 15.31f)
                curveTo(9.98f, 16.133f, 10.648f, 16.8f, 11.47f, 16.8f)
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
                moveTo(18.431f, 14.31f)
                verticalLineTo(8.48f)
                curveTo(18.431f, 7.24f, 17.651f, 7.07f, 16.861f, 7.28f)
                lineTo(13.881f, 8.09f)
                curveTo(13.341f, 8.24f, 12.961f, 8.67f, 12.961f, 9.29f)
                verticalLineTo(10.33f)
                verticalLineTo(11.03f)
                verticalLineTo(15.3f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.931f, 15.8f)
                curveTo(17.754f, 15.8f, 18.421f, 15.133f, 18.421f, 14.31f)
                curveTo(18.421f, 13.487f, 17.754f, 12.82f, 16.931f, 12.82f)
                curveTo(16.108f, 12.82f, 15.441f, 13.487f, 15.441f, 14.31f)
                curveTo(15.441f, 15.133f, 16.108f, 15.8f, 16.931f, 15.8f)
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
                moveTo(12.961f, 11.04f)
                lineTo(18.431f, 9.55f)
            }
        }.build()

        return _MusicDashboard!!
    }

@Suppress("ObjectPropertyName")
private var _MusicDashboard: ImageVector? = null
