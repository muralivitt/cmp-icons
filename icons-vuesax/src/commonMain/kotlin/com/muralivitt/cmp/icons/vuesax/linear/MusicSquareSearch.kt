package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MusicSquareSearch: ImageVector
    get() {
        if (_MusicSquareSearch != null) {
            return _MusicSquareSearch!!
        }
        _MusicSquareSearch = ImageVector.Builder(
            name = "MusicSquareSearch",
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
                moveTo(12.35f, 21f)
                horizontalLineTo(8.65f)
                curveTo(3.9f, 21f, 2f, 19.1f, 2f, 14.35f)
                verticalLineTo(8.65f)
                curveTo(2f, 3.9f, 3.9f, 2f, 8.65f, 2f)
                horizontalLineTo(14.35f)
                curveTo(19.1f, 2f, 21f, 3.9f, 21f, 8.65f)
                verticalLineTo(12.35f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.72f, 14.42f)
                curveTo(7.521f, 14.42f, 8.17f, 13.771f, 8.17f, 12.97f)
                curveTo(8.17f, 12.169f, 7.521f, 11.52f, 6.72f, 11.52f)
                curveTo(5.919f, 11.52f, 5.27f, 12.169f, 5.27f, 12.97f)
                curveTo(5.27f, 13.771f, 5.919f, 14.42f, 6.72f, 14.42f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.48f, 12f)
                verticalLineTo(6.34f)
                curveTo(13.48f, 5.13f, 12.72f, 4.97f, 11.96f, 5.18f)
                lineTo(9.07f, 5.97f)
                curveTo(8.55f, 6.11f, 8.18f, 6.53f, 8.18f, 7.13f)
                verticalLineTo(8.14f)
                verticalLineTo(8.82f)
                verticalLineTo(12.97f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.03f, 13.45f)
                curveTo(12.831f, 13.45f, 13.48f, 12.801f, 13.48f, 12f)
                curveTo(13.48f, 11.199f, 12.831f, 10.55f, 12.03f, 10.55f)
                curveTo(11.229f, 10.55f, 10.58f, 11.199f, 10.58f, 12f)
                curveTo(10.58f, 12.801f, 11.229f, 13.45f, 12.03f, 13.45f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.17f, 8.83f)
                lineTo(13.48f, 7.38f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.94f, 21.28f)
                curveTo(19.707f, 21.28f, 21.14f, 19.847f, 21.14f, 18.08f)
                curveTo(21.14f, 16.313f, 19.707f, 14.88f, 17.94f, 14.88f)
                curveTo(16.173f, 14.88f, 14.74f, 16.313f, 14.74f, 18.08f)
                curveTo(14.74f, 19.847f, 16.173f, 21.28f, 17.94f, 21.28f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.74f, 21.88f)
                lineTo(20.74f, 20.88f)
            }
        }.build()

        return _MusicSquareSearch!!
    }

@Suppress("ObjectPropertyName")
private var _MusicSquareSearch: ImageVector? = null
