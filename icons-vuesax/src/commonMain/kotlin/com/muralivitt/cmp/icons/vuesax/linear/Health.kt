package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Health: ImageVector
    get() {
        if (_Health != null) {
            return _Health!!
        }
        _Health = ImageVector.Builder(
            name = "Health",
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
                moveTo(8.97f, 22f)
                horizontalLineTo(14.97f)
                curveTo(19.97f, 22f, 21.97f, 20f, 21.97f, 15f)
                verticalLineTo(9f)
                curveTo(21.97f, 4f, 19.97f, 2f, 14.97f, 2f)
                horizontalLineTo(8.97f)
                curveTo(3.97f, 2f, 1.97f, 4f, 1.97f, 9f)
                verticalLineTo(15f)
                curveTo(1.97f, 20f, 3.97f, 22f, 8.97f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1.97f, 12.7f)
                lineTo(7.97f, 12.68f)
                curveTo(8.72f, 12.68f, 9.56f, 13.25f, 9.84f, 13.95f)
                lineTo(10.98f, 16.83f)
                curveTo(11.24f, 17.48f, 11.65f, 17.48f, 11.91f, 16.83f)
                lineTo(14.2f, 11.02f)
                curveTo(14.42f, 10.46f, 14.83f, 10.44f, 15.11f, 10.97f)
                lineTo(16.15f, 12.94f)
                curveTo(16.46f, 13.53f, 17.26f, 14.01f, 17.92f, 14.01f)
                horizontalLineTo(21.98f)
            }
        }.build()

        return _Health!!
    }

@Suppress("ObjectPropertyName")
private var _Health: ImageVector? = null
