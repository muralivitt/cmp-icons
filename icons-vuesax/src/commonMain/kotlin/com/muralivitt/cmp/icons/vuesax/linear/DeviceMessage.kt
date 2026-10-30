package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DeviceMessage: ImageVector
    get() {
        if (_DeviceMessage != null) {
            return _DeviceMessage!!
        }
        _DeviceMessage = ImageVector.Builder(
            name = "DeviceMessage",
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
                moveTo(20f, 12.2f)
                verticalLineTo(13.9f)
                curveTo(20f, 17.05f, 18.2f, 18.4f, 15.5f, 18.4f)
                horizontalLineTo(6.5f)
                curveTo(3.8f, 18.4f, 2f, 17.05f, 2f, 13.9f)
                verticalLineTo(8.5f)
                curveTo(2f, 5.35f, 3.8f, 4f, 6.5f, 4f)
                horizontalLineTo(9.2f)
                curveTo(9.07f, 4.38f, 9f, 4.8f, 9f, 5.25f)
                verticalLineTo(9.15f)
                curveTo(9f, 10.12f, 9.32f, 10.94f, 9.89f, 11.51f)
                curveTo(10.46f, 12.08f, 11.28f, 12.4f, 12.25f, 12.4f)
                verticalLineTo(13.79f)
                curveTo(12.25f, 14.3f, 12.83f, 14.61f, 13.26f, 14.33f)
                lineTo(16.15f, 12.4f)
                horizontalLineTo(18.75f)
                curveTo(19.2f, 12.4f, 19.62f, 12.33f, 20f, 12.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 5.25f)
                verticalLineTo(9.15f)
                curveTo(22f, 10.64f, 21.24f, 11.76f, 20f, 12.2f)
                curveTo(19.62f, 12.33f, 19.2f, 12.4f, 18.75f, 12.4f)
                horizontalLineTo(16.15f)
                lineTo(13.26f, 14.33f)
                curveTo(12.83f, 14.61f, 12.25f, 14.3f, 12.25f, 13.79f)
                verticalLineTo(12.4f)
                curveTo(11.28f, 12.4f, 10.46f, 12.08f, 9.89f, 11.51f)
                curveTo(9.32f, 10.94f, 9f, 10.12f, 9f, 9.15f)
                verticalLineTo(5.25f)
                curveTo(9f, 4.8f, 9.07f, 4.38f, 9.2f, 4f)
                curveTo(9.64f, 2.76f, 10.76f, 2f, 12.25f, 2f)
                horizontalLineTo(18.75f)
                curveTo(20.7f, 2f, 22f, 3.3f, 22f, 5.25f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.4f, 22f)
                horizontalLineTo(14.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 18.4f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.496f, 7.25f)
                horizontalLineTo(18.504f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.696f, 7.25f)
                horizontalLineTo(15.705f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.895f, 7.25f)
                horizontalLineTo(12.904f)
            }
        }.build()

        return _DeviceMessage!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceMessage: ImageVector? = null
