package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Notification: ImageVector
    get() {
        if (_Notification != null) {
            return _Notification!!
        }
        _Notification = ImageVector.Builder(
            name = "Notification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(12.02f, 2.91f)
                curveTo(8.71f, 2.91f, 6.02f, 5.6f, 6.02f, 8.91f)
                verticalLineTo(11.8f)
                curveTo(6.02f, 12.41f, 5.76f, 13.34f, 5.45f, 13.86f)
                lineTo(4.3f, 15.77f)
                curveTo(3.59f, 16.95f, 4.08f, 18.26f, 5.38f, 18.7f)
                curveTo(9.69f, 20.14f, 14.34f, 20.14f, 18.65f, 18.7f)
                curveTo(19.86f, 18.3f, 20.39f, 16.87f, 19.73f, 15.77f)
                lineTo(18.58f, 13.86f)
                curveTo(18.28f, 13.34f, 18.02f, 12.41f, 18.02f, 11.8f)
                verticalLineTo(8.91f)
                curveTo(18.02f, 5.61f, 15.32f, 2.91f, 12.02f, 2.91f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.87f, 3.2f)
                curveTo(13.56f, 3.11f, 13.24f, 3.04f, 12.91f, 3f)
                curveTo(11.95f, 2.88f, 11.03f, 2.95f, 10.17f, 3.2f)
                curveTo(10.46f, 2.46f, 11.18f, 1.94f, 12.02f, 1.94f)
                curveTo(12.86f, 1.94f, 13.58f, 2.46f, 13.87f, 3.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(15.02f, 19.06f)
                curveTo(15.02f, 20.71f, 13.67f, 22.06f, 12.02f, 22.06f)
                curveTo(11.2f, 22.06f, 10.44f, 21.72f, 9.9f, 21.18f)
                curveTo(9.36f, 20.64f, 9.02f, 19.88f, 9.02f, 19.06f)
            }
        }.build()

        return _Notification!!
    }

@Suppress("ObjectPropertyName")
private var _Notification: ImageVector? = null
