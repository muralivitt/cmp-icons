package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Glass: ImageVector
    get() {
        if (_Glass != null) {
            return _Glass!!
        }
        _Glass = ImageVector.Builder(
            name = "Glass",
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
                moveTo(8.16f, 22f)
                curveTo(3.98f, 22f, 3.14f, 19.47f, 4.5f, 16.39f)
                lineTo(8.75f, 6.74f)
                horizontalLineTo(8.45f)
                curveTo(7.8f, 6.74f, 7.2f, 6.48f, 6.77f, 6.05f)
                curveTo(6.33f, 5.62f, 6.07f, 5.02f, 6.07f, 4.37f)
                curveTo(6.07f, 3.07f, 7.13f, 2f, 8.44f, 2f)
                horizontalLineTo(15.55f)
                curveTo(16.21f, 2f, 16.8f, 2.27f, 17.23f, 2.7f)
                curveTo(17.79f, 3.26f, 18.07f, 4.08f, 17.86f, 4.95f)
                curveTo(17.59f, 6.03f, 16.55f, 6.74f, 15.44f, 6.74f)
                horizontalLineTo(15.28f)
                lineTo(19.5f, 16.4f)
                curveTo(20.85f, 19.48f, 19.97f, 22f, 15.83f, 22f)
                horizontalLineTo(8.16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.94f, 13.12f)
                curveTo(5.94f, 13.12f, 9f, 13f, 12f, 14f)
                curveTo(15f, 15f, 17.83f, 13.11f, 17.83f, 13.11f)
            }
        }.build()

        return _Glass!!
    }

@Suppress("ObjectPropertyName")
private var _Glass: ImageVector? = null
