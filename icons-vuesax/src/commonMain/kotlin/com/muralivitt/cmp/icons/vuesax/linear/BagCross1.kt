package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BagCross1: ImageVector
    get() {
        if (_BagCross1 != null) {
            return _BagCross1!!
        }
        _BagCross1 = ImageVector.Builder(
            name = "BagCross1",
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
                moveTo(12f, 19f)
                curveTo(14.209f, 19f, 16f, 17.209f, 16f, 15f)
                curveTo(16f, 12.791f, 14.209f, 11f, 12f, 11f)
                curveTo(9.791f, 11f, 8f, 12.791f, 8f, 15f)
                curveTo(8f, 17.209f, 9.791f, 19f, 12f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.07f, 16.11f)
                lineTo(10.95f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.05f, 14.02f)
                lineTo(10.93f, 16.14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(19.02f, 22f, 19.74f, 20.39f, 19.95f, 18.43f)
                lineTo(20.7f, 12.43f)
                curveTo(20.97f, 9.99f, 20.27f, 8f, 16f, 8f)
                horizontalLineTo(8f)
                curveTo(3.73f, 8f, 3.03f, 9.99f, 3.3f, 12.43f)
                lineTo(4.05f, 18.43f)
                curveTo(4.26f, 20.39f, 4.98f, 22f, 9f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 7.67f)
                verticalLineTo(6.7f)
                curveTo(7.5f, 4.45f, 9.31f, 2.24f, 11.56f, 2.03f)
                curveTo(14.24f, 1.77f, 16.5f, 3.88f, 16.5f, 6.51f)
                verticalLineTo(7.89f)
            }
        }.build()

        return _BagCross1!!
    }

@Suppress("ObjectPropertyName")
private var _BagCross1: ImageVector? = null
