package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.VideoTime: ImageVector
    get() {
        if (_VideoTime != null) {
            return _VideoTime!!
        }
        _VideoTime = ImageVector.Builder(
            name = "VideoTime",
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
                moveTo(22f, 9f)
                verticalLineTo(15f)
                curveTo(22f, 15.22f, 22f, 15.44f, 21.98f, 15.65f)
                curveTo(21.16f, 14.64f, 19.91f, 14f, 18.5f, 14f)
                curveTo(17.44f, 14f, 16.46f, 14.37f, 15.69f, 14.99f)
                curveTo(14.65f, 15.81f, 14f, 17.08f, 14f, 18.5f)
                curveTo(14f, 19.91f, 14.64f, 21.16f, 15.65f, 21.98f)
                curveTo(15.44f, 22f, 15.22f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(4f, 22f, 2f, 20f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 4f, 4f, 2f, 9f, 2f)
                horizontalLineTo(15f)
                curveTo(20f, 2f, 22f, 4f, 22f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.52f, 7.11f)
                horizontalLineTo(21.48f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.52f, 2.11f)
                verticalLineTo(6.97f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.48f, 2.11f)
                verticalLineTo(6.52f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(23f, 18.5f)
                curveTo(23f, 19.85f, 22.4f, 21.05f, 21.47f, 21.88f)
                curveTo(20.67f, 22.57f, 19.64f, 23f, 18.5f, 23f)
                curveTo(17.42f, 23f, 16.42f, 22.62f, 15.65f, 21.98f)
                curveTo(14.64f, 21.16f, 14f, 19.91f, 14f, 18.5f)
                curveTo(14f, 17.08f, 14.65f, 15.81f, 15.69f, 14.99f)
                curveTo(16.46f, 14.37f, 17.44f, 14f, 18.5f, 14f)
                curveTo(19.91f, 14f, 21.16f, 14.64f, 21.98f, 15.65f)
                curveTo(22.62f, 16.42f, 23f, 17.42f, 23f, 18.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.78f, 17.09f)
                verticalLineTo(18.78f)
                lineTo(17.38f, 19.62f)
            }
        }.build()

        return _VideoTime!!
    }

@Suppress("ObjectPropertyName")
private var _VideoTime: ImageVector? = null
