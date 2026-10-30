package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Brush3: ImageVector
    get() {
        if (_Brush3 != null) {
            return _Brush3!!
        }
        _Brush3 = ImageVector.Builder(
            name = "Brush3",
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
                moveTo(10f, 16f)
                curveTo(10f, 14.34f, 10f, 13f, 13f, 13f)
                horizontalLineTo(17f)
                curveTo(20f, 13f, 20f, 12f, 20f, 10f)
                verticalLineTo(8f)
                curveTo(20f, 6f, 20f, 5f, 17f, 5f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                horizontalLineTo(8f)
                curveTo(7.35f, 3.95f, 7.35f, 6.05f, 8f, 8f)
                horizontalLineTo(12f)
                curveTo(12.65f, 6.05f, 12.65f, 3.95f, 12f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 2f)
                horizontalLineTo(7f)
                curveTo(5f, 2f, 4f, 3f, 4f, 5f)
                curveTo(4f, 7f, 5f, 8f, 7f, 8f)
                horizontalLineTo(8f)
                curveTo(7f, 6f, 7f, 4f, 8f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 2f)
                horizontalLineTo(12f)
                curveTo(13f, 4f, 13f, 6f, 12f, 8f)
                horizontalLineTo(13f)
                curveTo(15f, 8f, 16f, 7f, 16f, 5f)
                curveTo(16f, 3f, 15f, 2f, 13f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 22f)
                horizontalLineTo(10.5f)
                curveTo(12f, 22f, 12f, 21f, 12f, 20.5f)
                verticalLineTo(17.5f)
                curveTo(12f, 17f, 12f, 16f, 10.5f, 16f)
                horizontalLineTo(9.5f)
                curveTo(8f, 16f, 8f, 17f, 8f, 17.5f)
                verticalLineTo(20.5f)
                curveTo(8f, 21f, 8f, 22f, 9.5f, 22f)
                close()
            }
        }.build()

        return _Brush3!!
    }

@Suppress("ObjectPropertyName")
private var _Brush3: ImageVector? = null
