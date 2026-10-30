package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.UserTag: ImageVector
    get() {
        if (_UserTag != null) {
            return _UserTag!!
        }
        _UserTag = ImageVector.Builder(
            name = "UserTag",
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
                moveTo(18f, 18.86f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.86f, 15.68f, 19.17f, 15.12f, 19.73f)
                lineTo(13.41f, 21.42f)
                curveTo(12.63f, 22.19f, 11.36f, 22.19f, 10.58f, 21.42f)
                lineTo(8.87f, 19.73f)
                curveTo(8.31f, 19.17f, 7.54f, 18.86f, 6.75f, 18.86f)
                horizontalLineTo(6f)
                curveTo(4.34f, 18.86f, 3f, 17.53f, 3f, 15.89f)
                verticalLineTo(4.98f)
                curveTo(3f, 3.34f, 4.34f, 2.01f, 6f, 2.01f)
                horizontalLineTo(18f)
                curveTo(19.66f, 2.01f, 21f, 3.34f, 21f, 4.98f)
                verticalLineTo(15.89f)
                curveTo(21f, 17.52f, 19.66f, 18.86f, 18f, 18.86f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 10f)
                curveTo(13.287f, 10f, 14.33f, 8.957f, 14.33f, 7.67f)
                curveTo(14.33f, 6.383f, 13.287f, 5.34f, 12f, 5.34f)
                curveTo(10.713f, 5.34f, 9.67f, 6.383f, 9.67f, 7.67f)
                curveTo(9.67f, 8.957f, 10.713f, 10f, 12f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 15.66f)
                curveTo(16f, 13.86f, 14.21f, 12.4f, 12f, 12.4f)
                curveTo(9.79f, 12.4f, 8f, 13.86f, 8f, 15.66f)
            }
        }.build()

        return _UserTag!!
    }

@Suppress("ObjectPropertyName")
private var _UserTag: ImageVector? = null
