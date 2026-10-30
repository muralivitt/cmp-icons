package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Smileys: ImageVector
    get() {
        if (_Smileys != null) {
            return _Smileys!!
        }
        _Smileys = ImageVector.Builder(
            name = "Smileys",
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
                moveTo(14f, 6.2f)
                verticalLineTo(10f)
                curveTo(11.21f, 10.05f, 10.05f, 11.21f, 10f, 14f)
                horizontalLineTo(6.2f)
                curveTo(3.2f, 14f, 2f, 12.8f, 2f, 9.8f)
                verticalLineTo(6.2f)
                curveTo(2f, 3.2f, 3.2f, 2f, 6.2f, 2f)
                horizontalLineTo(9.8f)
                curveTo(12.8f, 2f, 14f, 3.2f, 14f, 6.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.96f, 5.87f)
                curveTo(6.43f, 5.51f, 5.73f, 5.51f, 5.2f, 5.89f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.96f, 5.87f)
                curveTo(10.43f, 5.51f, 9.73f, 5.51f, 9.2f, 5.89f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.16f, 11.42f)
                horizontalLineTo(5.84f)
                curveTo(5.54f, 11.42f, 5.3f, 11.18f, 5.3f, 10.88f)
                curveTo(5.3f, 9.39f, 6.51f, 8.18f, 8f, 8.18f)
                curveTo(8.64f, 8.18f, 9.23f, 8.4f, 9.69f, 8.77f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 14.2f)
                verticalLineTo(17.8f)
                curveTo(22f, 20.8f, 20.8f, 22f, 17.8f, 22f)
                horizontalLineTo(14.2f)
                curveTo(11.2f, 22f, 10f, 20.8f, 10f, 17.8f)
                verticalLineTo(14f)
                curveTo(10.05f, 11.21f, 11.21f, 10.05f, 14f, 10f)
                horizontalLineTo(17.8f)
                curveTo(20.8f, 10f, 22f, 11.2f, 22f, 14.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.96f, 13.62f)
                curveTo(14.43f, 13.98f, 13.73f, 13.98f, 13.2f, 13.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.96f, 13.62f)
                curveTo(18.43f, 13.98f, 17.73f, 13.98f, 17.2f, 13.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.84f, 16.18f)
                horizontalLineTo(18.16f)
                curveTo(18.46f, 16.18f, 18.7f, 16.42f, 18.7f, 16.72f)
                curveTo(18.7f, 18.21f, 17.49f, 19.42f, 16f, 19.42f)
                curveTo(14.51f, 19.42f, 13.3f, 18.21f, 13.3f, 16.72f)
                curveTo(13.3f, 16.42f, 13.54f, 16.18f, 13.84f, 16.18f)
                close()
            }
        }.build()

        return _Smileys!!
    }

@Suppress("ObjectPropertyName")
private var _Smileys: ImageVector? = null
