package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.UserEdit: ImageVector
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
            path(
                stroke = SolidColor(Color(0xFF292D32)),
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
