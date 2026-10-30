package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Building3: ImageVector
    get() {
        if (_Building3 != null) {
            return _Building3!!
        }
        _Building3 = ImageVector.Builder(
            name = "Building3",
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
                moveTo(2f, 22f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.01f, 21.99f)
                lineTo(3.01f, 22.01f)
                lineTo(3f, 7.07f)
                curveTo(3f, 6.4f, 3.34f, 5.78f, 3.89f, 5.41f)
                lineTo(7.89f, 2.74f)
                curveTo(8.56f, 2.29f, 9.44f, 2.29f, 10.11f, 2.74f)
                lineTo(14.11f, 5.41f)
                curveTo(14.67f, 5.78f, 15f, 6.4f, 15f, 7.07f)
                lineTo(15.01f, 21.99f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.98f, 22.01f)
                verticalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                curveTo(18.9f, 12f, 18f, 12.9f, 18f, 14f)
                verticalLineTo(16f)
                curveTo(18f, 17.1f, 18.9f, 18f, 20f, 18f)
                curveTo(21.1f, 18f, 22f, 17.1f, 22f, 16f)
                verticalLineTo(14f)
                curveTo(22f, 12.9f, 21.1f, 12f, 20f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 14f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 22f)
                verticalLineTo(18.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 10.5f)
                curveTo(9.828f, 10.5f, 10.5f, 9.828f, 10.5f, 9f)
                curveTo(10.5f, 8.172f, 9.828f, 7.5f, 9f, 7.5f)
                curveTo(8.172f, 7.5f, 7.5f, 8.172f, 7.5f, 9f)
                curveTo(7.5f, 9.828f, 8.172f, 10.5f, 9f, 10.5f)
                close()
            }
        }.build()

        return _Building3!!
    }

@Suppress("ObjectPropertyName")
private var _Building3: ImageVector? = null
