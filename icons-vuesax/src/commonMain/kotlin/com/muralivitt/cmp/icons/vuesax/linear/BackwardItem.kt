package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BackwardItem: ImageVector
    get() {
        if (_BackwardItem != null) {
            return _BackwardItem!!
        }
        _BackwardItem = ImageVector.Builder(
            name = "BackwardItem",
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
                moveTo(22f, 5.15f)
                verticalLineTo(7.85f)
                curveTo(22f, 10.1f, 21.1f, 11f, 18.85f, 11f)
                horizontalLineTo(16.15f)
                curveTo(13.9f, 11f, 13f, 10.1f, 13f, 7.85f)
                verticalLineTo(5.15f)
                curveTo(13f, 2.9f, 13.9f, 2f, 16.15f, 2f)
                horizontalLineTo(18.85f)
                curveTo(21.1f, 2f, 22f, 2.9f, 22f, 5.15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 16.15f)
                verticalLineTo(18.85f)
                curveTo(11f, 21.1f, 10.1f, 22f, 7.85f, 22f)
                horizontalLineTo(5.15f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 18.85f)
                verticalLineTo(16.15f)
                curveTo(2f, 13.9f, 2.9f, 13f, 5.15f, 13f)
                horizontalLineTo(7.85f)
                curveTo(10.1f, 13f, 11f, 13.9f, 11f, 16.15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.38f, 11f)
                verticalLineTo(13.62f)
                curveTo(17.38f, 16.31f, 16.31f, 17.38f, 13.62f, 17.38f)
                horizontalLineTo(11f)
                verticalLineTo(16.15f)
                curveTo(11f, 13.9f, 10.1f, 13f, 7.85f, 13f)
                horizontalLineTo(6.62f)
                verticalLineTo(10.38f)
                curveTo(6.62f, 7.69f, 7.69f, 6.62f, 10.38f, 6.62f)
                horizontalLineTo(13f)
                verticalLineTo(7.85f)
                curveTo(13f, 10.1f, 13.9f, 11f, 16.15f, 11f)
                horizontalLineTo(17.38f)
                close()
            }
        }.build()

        return _BackwardItem!!
    }

@Suppress("ObjectPropertyName")
private var _BackwardItem: ImageVector? = null
