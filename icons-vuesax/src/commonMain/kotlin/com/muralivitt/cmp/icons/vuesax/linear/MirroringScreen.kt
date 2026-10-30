package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MirroringScreen: ImageVector
    get() {
        if (_MirroringScreen != null) {
            return _MirroringScreen!!
        }
        _MirroringScreen = ImageVector.Builder(
            name = "MirroringScreen",
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
                verticalLineTo(8f)
                curveTo(2f, 5f, 4f, 3f, 7f, 3f)
                horizontalLineTo(17f)
                curveTo(20f, 3f, 22f, 5f, 22f, 8f)
                verticalLineTo(16f)
                curveTo(22f, 19f, 20f, 21f, 17f, 21f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.69f, 11.71f)
                curveTo(8.31f, 12.3f, 11.7f, 15.7f, 12.3f, 20.32f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.62f, 15.07f)
                curveTo(6.01f, 15.5f, 8.5f, 18f, 8.94f, 21.39f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1.98f, 18.86f)
                curveTo(3.67f, 19.08f, 4.92f, 20.32f, 5.14f, 22.02f)
            }
        }.build()

        return _MirroringScreen!!
    }

@Suppress("ObjectPropertyName")
private var _MirroringScreen: ImageVector? = null
