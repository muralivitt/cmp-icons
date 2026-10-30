package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Chrome: ImageVector
    get() {
        if (_Chrome != null) {
            return _Chrome!!
        }
        _Chrome = ImageVector.Builder(
            name = "Chrome",
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
                moveTo(12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                curveTo(14.21f, 16f, 16f, 14.21f, 16f, 12f)
                curveTo(16f, 9.79f, 14.21f, 8f, 12f, 8f)
                curveTo(9.79f, 8f, 8f, 9.79f, 8f, 12f)
                curveTo(8f, 14.21f, 9.79f, 16f, 12f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.17f, 8f)
                curveTo(18.15f, 7.34f, 15.02f, 7.34f, 12f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.95f, 6.06f)
                lineTo(3.97f, 6.12f)
                curveTo(4.98f, 9.01f, 6.53f, 11.69f, 8.54f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.88f, 21.94f)
                curveTo(12.94f, 19.67f, 14.49f, 16.99f, 15.43f, 14.08f)
                lineTo(15.46f, 14f)
            }
        }.build()

        return _Chrome!!
    }

@Suppress("ObjectPropertyName")
private var _Chrome: ImageVector? = null
