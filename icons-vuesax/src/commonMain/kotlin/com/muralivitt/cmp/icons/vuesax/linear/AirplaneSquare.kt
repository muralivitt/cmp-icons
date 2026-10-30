package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.AirplaneSquare: ImageVector
    get() {
        if (_AirplaneSquare != null) {
            return _AirplaneSquare!!
        }
        _AirplaneSquare = ImageVector.Builder(
            name = "AirplaneSquare",
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
                moveTo(9.86f, 19f)
                lineTo(11.54f, 17.58f)
                curveTo(11.79f, 17.37f, 12.21f, 17.37f, 12.47f, 17.58f)
                lineTo(14.14f, 19f)
                curveTo(14.53f, 19.2f, 15.01f, 19f, 15.15f, 18.58f)
                lineTo(15.47f, 17.62f)
                curveTo(15.55f, 17.39f, 15.47f, 17.05f, 15.3f, 16.88f)
                lineTo(13.66f, 15.23f)
                curveTo(13.54f, 15.11f, 13.45f, 14.88f, 13.45f, 14.72f)
                verticalLineTo(12.87f)
                curveTo(13.45f, 12.45f, 13.76f, 12.25f, 14.15f, 12.41f)
                lineTo(17.5f, 13.85f)
                curveTo(18.05f, 14.09f, 18.51f, 13.79f, 18.51f, 13.19f)
                verticalLineTo(12.26f)
                curveTo(18.51f, 11.78f, 18.15f, 11.22f, 17.7f, 11.03f)
                lineTo(13.76f, 9.33f)
                curveTo(13.59f, 9.26f, 13.46f, 9.05f, 13.46f, 8.87f)
                verticalLineTo(6.8f)
                curveTo(13.46f, 6.12f, 12.96f, 5.32f, 12.36f, 5.01f)
                curveTo(12.14f, 4.9f, 11.89f, 4.9f, 11.67f, 5.01f)
                curveTo(11.06f, 5.31f, 10.57f, 6.12f, 10.57f, 6.8f)
                verticalLineTo(8.87f)
                curveTo(10.57f, 9.05f, 10.43f, 9.26f, 10.27f, 9.33f)
                lineTo(6.33f, 11.03f)
                curveTo(5.89f, 11.22f, 5.52f, 11.78f, 5.52f, 12.26f)
                verticalLineTo(13.19f)
                curveTo(5.52f, 13.79f, 5.97f, 14.09f, 6.53f, 13.85f)
                lineTo(9.88f, 12.41f)
                curveTo(10.26f, 12.24f, 10.58f, 12.45f, 10.58f, 12.87f)
                verticalLineTo(14.72f)
                curveTo(10.58f, 14.89f, 10.48f, 15.12f, 10.37f, 15.23f)
                lineTo(8.7f, 16.87f)
                curveTo(8.53f, 17.04f, 8.45f, 17.38f, 8.53f, 17.61f)
                lineTo(8.85f, 18.57f)
                curveTo(8.99f, 19f, 9.46f, 19.2f, 9.86f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                close()
            }
        }.build()

        return _AirplaneSquare!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneSquare: ImageVector? = null
