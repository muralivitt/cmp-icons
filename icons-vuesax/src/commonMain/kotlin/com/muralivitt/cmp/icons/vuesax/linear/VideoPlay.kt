package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.VideoPlay: ImageVector
    get() {
        if (_VideoPlay != null) {
            return _VideoPlay!!
        }
        _VideoPlay = ImageVector.Builder(
            name = "VideoPlay",
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.52f, 7.11f)
                horizontalLineTo(21.48f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.52f, 2.11f)
                verticalLineTo(6.97f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.48f, 2.11f)
                verticalLineTo(6.52f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.75f, 14.45f)
                verticalLineTo(13.25f)
                curveTo(9.75f, 11.71f, 10.84f, 11.08f, 12.17f, 11.85f)
                lineTo(13.21f, 12.45f)
                lineTo(14.25f, 13.05f)
                curveTo(15.58f, 13.82f, 15.58f, 15.08f, 14.25f, 15.85f)
                lineTo(13.21f, 16.45f)
                lineTo(12.17f, 17.05f)
                curveTo(10.84f, 17.82f, 9.75f, 17.19f, 9.75f, 15.65f)
                verticalLineTo(14.45f)
                verticalLineTo(14.45f)
                close()
            }
        }.build()

        return _VideoPlay!!
    }

@Suppress("ObjectPropertyName")
private var _VideoPlay: ImageVector? = null
