package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Chart: ImageVector
    get() {
        if (_Chart != null) {
            return _Chart!!
        }
        _Chart = ImageVector.Builder(
            name = "Chart",
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
                moveTo(3f, 22f)
                horizontalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.6f, 8.38f)
                horizontalLineTo(4f)
                curveTo(3.45f, 8.38f, 3f, 8.83f, 3f, 9.38f)
                verticalLineTo(18f)
                curveTo(3f, 18.55f, 3.45f, 19f, 4f, 19f)
                horizontalLineTo(5.6f)
                curveTo(6.15f, 19f, 6.6f, 18.55f, 6.6f, 18f)
                verticalLineTo(9.38f)
                curveTo(6.6f, 8.83f, 6.15f, 8.38f, 5.6f, 8.38f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.8f, 5.19f)
                horizontalLineTo(11.2f)
                curveTo(10.65f, 5.19f, 10.2f, 5.64f, 10.2f, 6.19f)
                verticalLineTo(18f)
                curveTo(10.2f, 18.55f, 10.65f, 19f, 11.2f, 19f)
                horizontalLineTo(12.8f)
                curveTo(13.35f, 19f, 13.8f, 18.55f, 13.8f, 18f)
                verticalLineTo(6.19f)
                curveTo(13.8f, 5.64f, 13.35f, 5.19f, 12.8f, 5.19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 2f)
                horizontalLineTo(18.4f)
                curveTo(17.85f, 2f, 17.4f, 2.45f, 17.4f, 3f)
                verticalLineTo(18f)
                curveTo(17.4f, 18.55f, 17.85f, 19f, 18.4f, 19f)
                horizontalLineTo(20f)
                curveTo(20.55f, 19f, 21f, 18.55f, 21f, 18f)
                verticalLineTo(3f)
                curveTo(21f, 2.45f, 20.55f, 2f, 20f, 2f)
                close()
            }
        }.build()

        return _Chart!!
    }

@Suppress("ObjectPropertyName")
private var _Chart: ImageVector? = null
