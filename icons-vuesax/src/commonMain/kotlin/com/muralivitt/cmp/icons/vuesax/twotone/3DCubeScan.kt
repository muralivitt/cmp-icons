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

val VuesaxIconsTwotone.`3DCubeScan`: ImageVector
    get() {
        if (_3DCubeScan != null) {
            return _3DCubeScan!!
        }
        _3DCubeScan = ImageVector.Builder(
            name = "3DCubeScan",
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
                moveTo(2f, 9f)
                verticalLineTo(7f)
                curveTo(2f, 4f, 4f, 2f, 7f, 2f)
                horizontalLineTo(17f)
                curveTo(20f, 2f, 22f, 4f, 22f, 7f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 15f)
                verticalLineTo(17f)
                curveTo(2f, 20f, 4f, 22f, 7f, 22f)
                horizontalLineTo(17f)
                curveTo(20f, 22f, 22f, 20f, 22f, 17f)
                verticalLineTo(15f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.699f, 9.26f)
                lineTo(11.999f, 12.33f)
                lineTo(17.259f, 9.28f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17.77f)
                verticalLineTo(12.32f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.76f, 6.29f)
                lineTo(7.56f, 8.07f)
                curveTo(6.84f, 8.47f, 6.24f, 9.48f, 6.24f, 10.31f)
                verticalLineTo(13.7f)
                curveTo(6.24f, 14.53f, 6.83f, 15.54f, 7.56f, 15.94f)
                lineTo(10.76f, 17.72f)
                curveTo(11.44f, 18.1f, 12.56f, 18.1f, 13.25f, 17.72f)
                lineTo(16.45f, 15.94f)
                curveTo(17.17f, 15.54f, 17.77f, 14.53f, 17.77f, 13.7f)
                verticalLineTo(10.31f)
                curveTo(17.77f, 9.48f, 17.18f, 8.47f, 16.45f, 8.07f)
                lineTo(13.25f, 6.29f)
                curveTo(12.56f, 5.9f, 11.44f, 5.9f, 10.76f, 6.29f)
                close()
            }
        }.build()

        return _3DCubeScan!!
    }

@Suppress("ObjectPropertyName")
private var _3DCubeScan: ImageVector? = null
