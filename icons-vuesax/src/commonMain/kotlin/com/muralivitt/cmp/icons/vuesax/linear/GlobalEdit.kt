package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.GlobalEdit: ImageVector
    get() {
        if (_GlobalEdit != null) {
            return _GlobalEdit!!
        }
        _GlobalEdit = ImageVector.Builder(
            name = "GlobalEdit",
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
                moveTo(22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 3f)
                horizontalLineTo(9f)
                curveTo(7.05f, 8.84f, 7.05f, 15.16f, 9f, 21f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 3f)
                curveTo(15.97f, 5.92f, 16.46f, 8.96f, 16.46f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 16f)
                verticalLineTo(15f)
                curveTo(5.92f, 15.97f, 8.96f, 16.46f, 12f, 16.46f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 9f)
                curveTo(8.84f, 7.05f, 15.16f, 7.05f, 21f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.21f, 15.74f)
                lineTo(15.67f, 19.28f)
                curveTo(15.53f, 19.42f, 15.4f, 19.68f, 15.37f, 19.87f)
                lineTo(15.18f, 21.22f)
                curveTo(15.11f, 21.71f, 15.45f, 22.05f, 15.94f, 21.98f)
                lineTo(17.29f, 21.79f)
                curveTo(17.48f, 21.76f, 17.75f, 21.63f, 17.88f, 21.49f)
                lineTo(21.42f, 17.95f)
                curveTo(22.03f, 17.34f, 22.32f, 16.63f, 21.42f, 15.73f)
                curveTo(20.53f, 14.84f, 19.82f, 15.13f, 19.21f, 15.74f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.7f, 16.25f)
                curveTo(19f, 17.33f, 19.84f, 18.17f, 20.92f, 18.47f)
            }
        }.build()

        return _GlobalEdit!!
    }

@Suppress("ObjectPropertyName")
private var _GlobalEdit: ImageVector? = null
