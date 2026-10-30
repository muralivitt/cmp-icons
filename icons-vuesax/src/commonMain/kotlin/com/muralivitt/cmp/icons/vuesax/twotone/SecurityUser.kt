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

val VuesaxIconsTwotone.SecurityUser: ImageVector
    get() {
        if (_SecurityUser != null) {
            return _SecurityUser!!
        }
        _SecurityUser = ImageVector.Builder(
            name = "SecurityUser",
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 10.92f)
                curveTo(11.96f, 10.92f, 11.91f, 10.92f, 11.87f, 10.92f)
                curveTo(10.93f, 10.89f, 10.18f, 10.11f, 10.18f, 9.16f)
                curveTo(10.18f, 8.19f, 10.97f, 7.4f, 11.94f, 7.4f)
                curveTo(12.91f, 7.4f, 13.7f, 8.19f, 13.7f, 9.16f)
                curveTo(13.69f, 10.12f, 12.94f, 10.89f, 12f, 10.92f)
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
                moveTo(10.009f, 13.72f)
                curveTo(9.049f, 14.36f, 9.049f, 15.41f, 10.009f, 16.05f)
                curveTo(11.099f, 16.78f, 12.889f, 16.78f, 13.979f, 16.05f)
                curveTo(14.939f, 15.41f, 14.939f, 14.36f, 13.979f, 13.72f)
                curveTo(12.899f, 12.99f, 11.109f, 12.99f, 10.009f, 13.72f)
                close()
            }
        }.build()

        return _SecurityUser!!
    }

@Suppress("ObjectPropertyName")
private var _SecurityUser: ImageVector? = null
