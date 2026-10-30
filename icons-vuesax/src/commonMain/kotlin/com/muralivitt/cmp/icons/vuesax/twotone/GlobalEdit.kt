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

val VuesaxIconsTwotone.GlobalEdit: ImageVector
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 3f)
                curveTo(15.97f, 5.92f, 16.46f, 8.96f, 16.46f, 12f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 16f)
                verticalLineTo(15f)
                curveTo(5.92f, 15.97f, 8.96f, 16.46f, 12f, 16.46f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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
                moveTo(19.211f, 15.74f)
                lineTo(15.671f, 19.28f)
                curveTo(15.531f, 19.42f, 15.401f, 19.68f, 15.371f, 19.87f)
                lineTo(15.181f, 21.22f)
                curveTo(15.111f, 21.71f, 15.451f, 22.05f, 15.941f, 21.98f)
                lineTo(17.291f, 21.79f)
                curveTo(17.481f, 21.76f, 17.751f, 21.63f, 17.881f, 21.49f)
                lineTo(21.421f, 17.95f)
                curveTo(22.031f, 17.34f, 22.321f, 16.63f, 21.421f, 15.73f)
                curveTo(20.531f, 14.84f, 19.821f, 15.13f, 19.211f, 15.74f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.699f, 16.25f)
                curveTo(18.999f, 17.33f, 19.839f, 18.17f, 20.919f, 18.47f)
            }
        }.build()

        return _GlobalEdit!!
    }

@Suppress("ObjectPropertyName")
private var _GlobalEdit: ImageVector? = null
