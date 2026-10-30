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

val VuesaxIconsTwotone.`24Support`: ImageVector
    get() {
        if (_24Support != null) {
            return _24Support!!
        }
        _24Support = ImageVector.Builder(
            name = "24Support",
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9.16f)
                curveTo(7f, 8.23f, 7.76f, 7.47f, 8.69f, 7.47f)
                curveTo(9.62f, 7.47f, 10.38f, 8.23f, 10.38f, 9.16f)
                curveTo(10.38f, 11.04f, 7.71f, 11.24f, 7.12f, 13.03f)
                curveTo(7f, 13.4f, 7.31f, 13.77f, 7.7f, 13.77f)
                horizontalLineTo(10.38f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.04f, 13.76f)
                verticalLineTo(8.05f)
                curveTo(16.04f, 7.79f, 15.87f, 7.56f, 15.62f, 7.49f)
                curveTo(15.37f, 7.42f, 15.1f, 7.52f, 14.96f, 7.74f)
                curveTo(14.24f, 8.9f, 13.46f, 10.22f, 12.78f, 11.38f)
                curveTo(12.67f, 11.57f, 12.67f, 11.82f, 12.78f, 12.01f)
                curveTo(12.89f, 12.2f, 13.1f, 12.32f, 13.33f, 12.32f)
                horizontalLineTo(17f)
            }
        }.build()

        return _24Support!!
    }

@Suppress("ObjectPropertyName")
private var _24Support: ImageVector? = null
