package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Reserve: ImageVector
    get() {
        if (_Reserve != null) {
            return _Reserve!!
        }
        _Reserve = ImageVector.Builder(
            name = "Reserve",
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
                moveTo(18.97f, 22f)
                horizontalLineTo(4.97f)
                curveTo(1.97f, 22f, 1.97f, 20.65f, 1.97f, 19f)
                verticalLineTo(18f)
                curveTo(1.97f, 17.45f, 2.42f, 17f, 2.97f, 17f)
                horizontalLineTo(20.97f)
                curveTo(21.52f, 17f, 21.97f, 17.45f, 21.97f, 18f)
                verticalLineTo(19f)
                curveTo(21.97f, 20.65f, 21.97f, 22f, 18.97f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.72f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(3.27f)
                verticalLineTo(13f)
                curveTo(3.27f, 9.16f, 5.98f, 5.95f, 9.59f, 5.18f)
                curveTo(10.13f, 5.06f, 10.69f, 5f, 11.27f, 5f)
                horizontalLineTo(12.72f)
                curveTo(13.3f, 5f, 13.87f, 5.06f, 14.41f, 5.18f)
                curveTo(18.02f, 5.96f, 20.72f, 9.16f, 20.72f, 13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 4.5f)
                curveTo(14.5f, 4.74f, 14.47f, 4.96f, 14.41f, 5.18f)
                curveTo(13.87f, 5.06f, 13.3f, 5f, 12.72f, 5f)
                horizontalLineTo(11.27f)
                curveTo(10.69f, 5f, 10.13f, 5.06f, 9.59f, 5.18f)
                curveTo(9.53f, 4.96f, 9.5f, 4.74f, 9.5f, 4.5f)
                curveTo(9.5f, 3.12f, 10.62f, 2f, 12f, 2f)
                curveTo(13.38f, 2f, 14.5f, 3.12f, 14.5f, 4.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 11f)
                horizontalLineTo(9f)
            }
        }.build()

        return _Reserve!!
    }

@Suppress("ObjectPropertyName")
private var _Reserve: ImageVector? = null
