package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.NotificationBing: ImageVector
    get() {
        if (_NotificationBing != null) {
            return _NotificationBing!!
        }
        _NotificationBing = ImageVector.Builder(
            name = "NotificationBing",
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
                moveTo(12f, 6.44f)
                verticalLineTo(9.77f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(12.02f, 2f)
                curveTo(8.34f, 2f, 5.36f, 4.98f, 5.36f, 8.66f)
                verticalLineTo(10.76f)
                curveTo(5.36f, 11.44f, 5.08f, 12.46f, 4.73f, 13.04f)
                lineTo(3.46f, 15.16f)
                curveTo(2.68f, 16.47f, 3.22f, 17.93f, 4.66f, 18.41f)
                curveTo(9.44f, 20f, 14.61f, 20f, 19.39f, 18.41f)
                curveTo(20.74f, 17.96f, 21.32f, 16.38f, 20.59f, 15.16f)
                lineTo(19.32f, 13.04f)
                curveTo(18.97f, 12.46f, 18.69f, 11.43f, 18.69f, 10.76f)
                verticalLineTo(8.66f)
                curveTo(18.68f, 5f, 15.68f, 2f, 12.02f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(15.33f, 18.82f)
                curveTo(15.33f, 20.65f, 13.83f, 22.15f, 12f, 22.15f)
                curveTo(11.09f, 22.15f, 10.25f, 21.77f, 9.65f, 21.17f)
                curveTo(9.05f, 20.57f, 8.67f, 19.73f, 8.67f, 18.82f)
            }
        }.build()

        return _NotificationBing!!
    }

@Suppress("ObjectPropertyName")
private var _NotificationBing: ImageVector? = null
