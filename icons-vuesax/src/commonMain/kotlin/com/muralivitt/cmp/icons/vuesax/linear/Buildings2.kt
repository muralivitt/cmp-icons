package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Buildings2: ImageVector
    get() {
        if (_Buildings2 != null) {
            return _Buildings2!!
        }
        _Buildings2 = ImageVector.Builder(
            name = "Buildings2",
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
                moveTo(6.7f, 18f)
                horizontalLineTo(4.15f)
                curveTo(2.72f, 18f, 2f, 17.28f, 2f, 15.85f)
                verticalLineTo(4.15f)
                curveTo(2f, 2.72f, 2.72f, 2f, 4.15f, 2f)
                horizontalLineTo(8.45f)
                curveTo(9.88f, 2f, 10.6f, 2.72f, 10.6f, 4.15f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.37f, 8.42f)
                verticalLineTo(19.58f)
                curveTo(17.37f, 21.19f, 16.57f, 22f, 14.96f, 22f)
                horizontalLineTo(9.12f)
                curveTo(7.51f, 22f, 6.7f, 21.19f, 6.7f, 19.58f)
                verticalLineTo(8.42f)
                curveTo(6.7f, 6.81f, 7.51f, 6f, 9.12f, 6f)
                horizontalLineTo(14.96f)
                curveTo(16.57f, 6f, 17.37f, 6.81f, 17.37f, 8.42f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.4f, 6f)
                verticalLineTo(4.15f)
                curveTo(13.4f, 2.72f, 14.12f, 2f, 15.55f, 2f)
                horizontalLineTo(19.85f)
                curveTo(21.28f, 2f, 22f, 2.72f, 22f, 4.15f)
                verticalLineTo(15.85f)
                curveTo(22f, 17.28f, 21.28f, 18f, 19.85f, 18f)
                horizontalLineTo(17.37f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 11f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 14f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineTo(19f)
            }
        }.build()

        return _Buildings2!!
    }

@Suppress("ObjectPropertyName")
private var _Buildings2: ImageVector? = null
