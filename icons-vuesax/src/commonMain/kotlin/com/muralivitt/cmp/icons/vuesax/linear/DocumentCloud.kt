package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DocumentCloud: ImageVector
    get() {
        if (_DocumentCloud != null) {
            return _DocumentCloud!!
        }
        _DocumentCloud = ImageVector.Builder(
            name = "DocumentCloud",
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
                moveTo(14f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 10f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 10f)
                horizontalLineTo(18f)
                curveTo(15f, 10f, 14f, 9f, 14f, 6f)
                verticalLineTo(2f)
                lineTo(22f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.76f, 18.26f)
                curveTo(11.41f, 18.43f, 11.41f, 21.83f, 13.76f, 22f)
                horizontalLineTo(19.32f)
                curveTo(19.99f, 22f, 20.65f, 21.75f, 21.14f, 21.3f)
                curveTo(22.79f, 19.86f, 21.91f, 16.98f, 19.74f, 16.71f)
                curveTo(18.96f, 12.02f, 12.18f, 13.8f, 13.78f, 18.27f)
            }
        }.build()

        return _DocumentCloud!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCloud: ImageVector? = null
