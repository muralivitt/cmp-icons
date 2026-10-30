package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MusicSquare: ImageVector
    get() {
        if (_MusicSquare != null) {
            return _MusicSquare!!
        }
        _MusicSquare = ImageVector.Builder(
            name = "MusicSquare",
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
                moveTo(8.42f, 17.11f)
                curveTo(9.287f, 17.11f, 9.99f, 16.407f, 9.99f, 15.54f)
                curveTo(9.99f, 14.673f, 9.287f, 13.97f, 8.42f, 13.97f)
                curveTo(7.553f, 13.97f, 6.85f, 14.673f, 6.85f, 15.54f)
                curveTo(6.85f, 16.407f, 7.553f, 17.11f, 8.42f, 17.11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.75f, 14.49f)
                verticalLineTo(8.35f)
                curveTo(15.75f, 7.04f, 14.93f, 6.86f, 14.1f, 7.09f)
                lineTo(10.96f, 7.95f)
                curveTo(10.39f, 8.11f, 10f, 8.56f, 10f, 9.21f)
                verticalLineTo(10.31f)
                verticalLineTo(11.05f)
                verticalLineTo(15.55f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.18f, 16.06f)
                curveTo(15.047f, 16.06f, 15.75f, 15.357f, 15.75f, 14.49f)
                curveTo(15.75f, 13.623f, 15.047f, 12.92f, 14.18f, 12.92f)
                curveTo(13.313f, 12.92f, 12.61f, 13.623f, 12.61f, 14.49f)
                curveTo(12.61f, 15.357f, 13.313f, 16.06f, 14.18f, 16.06f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.99f, 11.04f)
                lineTo(15.75f, 9.47f)
            }
        }.build()

        return _MusicSquare!!
    }

@Suppress("ObjectPropertyName")
private var _MusicSquare: ImageVector? = null
