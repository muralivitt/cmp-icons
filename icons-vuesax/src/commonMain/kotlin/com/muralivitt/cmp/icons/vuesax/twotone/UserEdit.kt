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

val VuesaxIconsTwotone.UserEdit: ImageVector
    get() {
        if (_UserEdit != null) {
            return _UserEdit!!
        }
        _UserEdit = ImageVector.Builder(
            name = "UserEdit",
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
                moveTo(12f, 12f)
                curveTo(14.761f, 12f, 17f, 9.761f, 17f, 7f)
                curveTo(17f, 4.239f, 14.761f, 2f, 12f, 2f)
                curveTo(9.239f, 2f, 7f, 4.239f, 7f, 7f)
                curveTo(7f, 9.761f, 9.239f, 12f, 12f, 12f)
                close()
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
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.41f, 22f)
                curveTo(3.41f, 18.13f, 7.26f, 15f, 12f, 15f)
                curveTo(13.04f, 15f, 14.04f, 15.15f, 14.97f, 15.43f)
            }
        }.build()

        return _UserEdit!!
    }

@Suppress("ObjectPropertyName")
private var _UserEdit: ImageVector? = null
