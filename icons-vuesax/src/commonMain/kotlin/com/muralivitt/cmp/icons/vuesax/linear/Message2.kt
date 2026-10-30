package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Message2: ImageVector
    get() {
        if (_Message2 != null) {
            return _Message2!!
        }
        _Message2 = ImageVector.Builder(
            name = "Message2",
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
                moveTo(8.5f, 10.5f)
                horizontalLineTo(15.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 18.43f)
                horizontalLineTo(11f)
                lineTo(15.45f, 21.39f)
                curveTo(16.11f, 21.83f, 17f, 21.36f, 17f, 20.56f)
                verticalLineTo(18.43f)
                curveTo(20f, 18.43f, 22f, 16.43f, 22f, 13.43f)
                verticalLineTo(7.43f)
                curveTo(22f, 4.43f, 20f, 2.43f, 17f, 2.43f)
                horizontalLineTo(7f)
                curveTo(4f, 2.43f, 2f, 4.43f, 2f, 7.43f)
                verticalLineTo(13.43f)
                curveTo(2f, 16.43f, 4f, 18.43f, 7f, 18.43f)
                close()
            }
        }.build()

        return _Message2!!
    }

@Suppress("ObjectPropertyName")
private var _Message2: ImageVector? = null
