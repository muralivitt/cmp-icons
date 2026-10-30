package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.LikeShapes: ImageVector
    get() {
        if (_LikeShapes != null) {
            return _LikeShapes!!
        }
        _LikeShapes = ImageVector.Builder(
            name = "LikeShapes",
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
                moveTo(10.75f, 2.45f)
                curveTo(11.44f, 1.86f, 12.57f, 1.86f, 13.27f, 2.45f)
                lineTo(14.85f, 3.81f)
                curveTo(15.15f, 4.07f, 15.71f, 4.28f, 16.11f, 4.28f)
                horizontalLineTo(17.81f)
                curveTo(18.87f, 4.28f, 19.74f, 5.15f, 19.74f, 6.21f)
                verticalLineTo(7.91f)
                curveTo(19.74f, 8.3f, 19.95f, 8.87f, 20.21f, 9.17f)
                lineTo(21.57f, 10.75f)
                curveTo(22.16f, 11.44f, 22.16f, 12.57f, 21.57f, 13.27f)
                lineTo(20.21f, 14.85f)
                curveTo(19.95f, 15.15f, 19.74f, 15.71f, 19.74f, 16.11f)
                verticalLineTo(17.81f)
                curveTo(19.74f, 18.87f, 18.87f, 19.74f, 17.81f, 19.74f)
                horizontalLineTo(16.11f)
                curveTo(15.72f, 19.74f, 15.15f, 19.95f, 14.85f, 20.21f)
                lineTo(13.27f, 21.57f)
                curveTo(12.58f, 22.16f, 11.45f, 22.16f, 10.75f, 21.57f)
                lineTo(9.17f, 20.21f)
                curveTo(8.87f, 19.95f, 8.31f, 19.74f, 7.91f, 19.74f)
                horizontalLineTo(6.18f)
                curveTo(5.12f, 19.74f, 4.25f, 18.87f, 4.25f, 17.81f)
                verticalLineTo(16.1f)
                curveTo(4.25f, 15.71f, 4.04f, 15.15f, 3.79f, 14.85f)
                lineTo(2.44f, 13.26f)
                curveTo(1.86f, 12.57f, 1.86f, 11.45f, 2.44f, 10.76f)
                lineTo(3.79f, 9.17f)
                curveTo(4.04f, 8.87f, 4.25f, 8.31f, 4.25f, 7.92f)
                verticalLineTo(6.21f)
                curveTo(4.25f, 5.15f, 5.12f, 4.28f, 6.18f, 4.28f)
                horizontalLineTo(7.91f)
                curveTo(8.3f, 4.28f, 8.87f, 4.07f, 9.17f, 3.81f)
                lineTo(10.75f, 2.45f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(9.89f, 14.82f)
                lineTo(11.34f, 15.94f)
                curveTo(11.53f, 16.13f, 11.95f, 16.22f, 12.23f, 16.22f)
                horizontalLineTo(14f)
                curveTo(14.56f, 16.22f, 15.17f, 15.8f, 15.31f, 15.24f)
                lineTo(16.43f, 11.82f)
                curveTo(16.66f, 11.17f, 16.24f, 10.6f, 15.54f, 10.6f)
                horizontalLineTo(13.67f)
                curveTo(13.39f, 10.6f, 13.16f, 10.37f, 13.2f, 10.04f)
                lineTo(13.43f, 8.54f)
                curveTo(13.52f, 8.12f, 13.24f, 7.65f, 12.82f, 7.51f)
                curveTo(12.45f, 7.37f, 11.98f, 7.56f, 11.79f, 7.84f)
                lineTo(9.87f, 10.69f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 14.82f)
                verticalLineTo(10.24f)
                curveTo(7.5f, 9.58f, 7.78f, 9.35f, 8.44f, 9.35f)
                horizontalLineTo(8.91f)
                curveTo(9.56f, 9.35f, 9.85f, 9.58f, 9.85f, 10.24f)
                verticalLineTo(14.82f)
                curveTo(9.85f, 15.47f, 9.57f, 15.71f, 8.91f, 15.71f)
                horizontalLineTo(8.44f)
                curveTo(7.78f, 15.71f, 7.5f, 15.48f, 7.5f, 14.82f)
                close()
            }
        }.build()

        return _LikeShapes!!
    }

@Suppress("ObjectPropertyName")
private var _LikeShapes: ImageVector? = null
