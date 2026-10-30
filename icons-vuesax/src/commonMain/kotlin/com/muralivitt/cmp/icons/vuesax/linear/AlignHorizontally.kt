package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.AlignHorizontally: ImageVector
    get() {
        if (_AlignHorizontally != null) {
            return _AlignHorizontally!!
        }
        _AlignHorizontally = ImageVector.Builder(
            name = "AlignHorizontally",
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
                moveTo(4.75f, 17.4f)
                verticalLineTo(6.6f)
                curveTo(4.75f, 5.1f, 5.39f, 4.5f, 6.98f, 4.5f)
                horizontalLineTo(8.02f)
                curveTo(9.61f, 4.5f, 10.25f, 5.1f, 10.25f, 6.6f)
                verticalLineTo(17.4f)
                curveTo(10.25f, 18.9f, 9.61f, 19.5f, 8.02f, 19.5f)
                horizontalLineTo(6.98f)
                curveTo(5.39f, 19.5f, 4.75f, 18.9f, 4.75f, 17.4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.25f, 15.4f)
                verticalLineTo(8.6f)
                curveTo(13.25f, 7.1f, 13.89f, 6.5f, 15.48f, 6.5f)
                horizontalLineTo(16.52f)
                curveTo(18.11f, 6.5f, 18.75f, 7.1f, 18.75f, 8.6f)
                verticalLineTo(15.4f)
                curveTo(18.75f, 16.9f, 18.11f, 17.5f, 16.52f, 17.5f)
                horizontalLineTo(15.48f)
                curveTo(13.89f, 17.5f, 13.25f, 16.9f, 13.25f, 15.4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                horizontalLineTo(4.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 12f)
                horizontalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12f)
                horizontalLineTo(19.31f)
            }
        }.build()

        return _AlignHorizontally!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontally: ImageVector? = null
