package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Buildings: ImageVector
    get() {
        if (_Buildings != null) {
            return _Buildings!!
        }
        _Buildings = ImageVector.Builder(
            name = "Buildings",
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
                moveTo(13f, 22f)
                horizontalLineTo(5f)
                curveTo(3f, 22f, 2f, 21f, 2f, 19f)
                verticalLineTo(11f)
                curveTo(2f, 9f, 3f, 8f, 5f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                curveTo(10f, 21f, 11f, 22f, 13f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.11f, 4f)
                curveTo(10.03f, 4.3f, 10f, 4.63f, 10f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                curveTo(5f, 4.9f, 5.9f, 4f, 7f, 4f)
                horizontalLineTo(10.11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 8f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 8f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 17f)
                horizontalLineTo(15f)
                curveTo(14.45f, 17f, 14f, 17.45f, 14f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                curveTo(18f, 17.45f, 17.55f, 17f, 17f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 13f)
                verticalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 19f)
                verticalLineTo(5f)
                curveTo(10f, 3f, 11f, 2f, 13f, 2f)
                horizontalLineTo(19f)
                curveTo(21f, 2f, 22f, 3f, 22f, 5f)
                verticalLineTo(19f)
                curveTo(22f, 21f, 21f, 22f, 19f, 22f)
                horizontalLineTo(13f)
                curveTo(11f, 22f, 10f, 21f, 10f, 19f)
                close()
            }
        }.build()

        return _Buildings!!
    }

@Suppress("ObjectPropertyName")
private var _Buildings: ImageVector? = null
