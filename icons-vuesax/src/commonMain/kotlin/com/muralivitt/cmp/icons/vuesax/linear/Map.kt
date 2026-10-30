package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Map: ImageVector
    get() {
        if (_Map != null) {
            return _Map!!
        }
        _Map = ImageVector.Builder(
            name = "Map",
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
                moveTo(22f, 9f)
                verticalLineTo(15f)
                curveTo(22f, 17.5f, 21.5f, 19.25f, 20.38f, 20.38f)
                lineTo(14f, 14f)
                lineTo(21.73f, 6.27f)
                curveTo(21.91f, 7.06f, 22f, 7.96f, 22f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.73f, 6.27f)
                lineTo(6.27f, 21.73f)
                curveTo(3.26f, 21.04f, 2f, 18.96f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 4f, 4f, 2f, 9f, 2f)
                horizontalLineTo(15f)
                curveTo(18.96f, 2f, 21.04f, 3.26f, 21.73f, 6.27f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.38f, 20.38f)
                curveTo(19.25f, 21.5f, 17.5f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(7.96f, 22f, 7.06f, 21.91f, 6.27f, 21.73f)
                lineTo(14f, 14f)
                lineTo(20.38f, 20.38f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(6.24f, 7.98f)
                curveTo(6.92f, 5.05f, 11.32f, 5.05f, 12f, 7.98f)
                curveTo(12.39f, 9.7f, 11.31f, 11.16f, 10.36f, 12.06f)
                curveTo(9.67f, 12.72f, 8.58f, 12.72f, 7.88f, 12.06f)
                curveTo(6.93f, 11.16f, 5.84f, 9.7f, 6.24f, 7.98f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.095f, 8.7f)
                horizontalLineTo(9.104f)
            }
        }.build()

        return _Map!!
    }

@Suppress("ObjectPropertyName")
private var _Map: ImageVector? = null
