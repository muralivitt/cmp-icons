package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.SecurityTime: ImageVector
    get() {
        if (_SecurityTime != null) {
            return _SecurityTime!!
        }
        _SecurityTime = ImageVector.Builder(
            name = "SecurityTime",
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
                moveTo(10.49f, 2.23f)
                lineTo(5.5f, 4.1f)
                curveTo(4.35f, 4.53f, 3.41f, 5.89f, 3.41f, 7.12f)
                verticalLineTo(14.55f)
                curveTo(3.41f, 15.73f, 4.19f, 17.28f, 5.14f, 17.99f)
                lineTo(9.44f, 21.2f)
                curveTo(10.85f, 22.26f, 13.17f, 22.26f, 14.58f, 21.2f)
                lineTo(18.88f, 17.99f)
                curveTo(19.83f, 17.28f, 20.61f, 15.73f, 20.61f, 14.55f)
                verticalLineTo(7.12f)
                curveTo(20.61f, 5.89f, 19.67f, 4.53f, 18.52f, 4.1f)
                lineTo(13.53f, 2.23f)
                curveTo(12.68f, 1.92f, 11.32f, 1.92f, 10.49f, 2.23f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15.5f)
                curveTo(14.209f, 15.5f, 16f, 13.709f, 16f, 11.5f)
                curveTo(16f, 9.291f, 14.209f, 7.5f, 12f, 7.5f)
                curveTo(9.791f, 7.5f, 8f, 9.291f, 8f, 11.5f)
                curveTo(8f, 13.709f, 9.791f, 15.5f, 12f, 15.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.25f, 10.25f)
                verticalLineTo(11.18f)
                curveTo(12.25f, 11.53f, 12.07f, 11.86f, 11.76f, 12.04f)
                lineTo(11f, 12.5f)
            }
        }.build()

        return _SecurityTime!!
    }

@Suppress("ObjectPropertyName")
private var _SecurityTime: ImageVector? = null
