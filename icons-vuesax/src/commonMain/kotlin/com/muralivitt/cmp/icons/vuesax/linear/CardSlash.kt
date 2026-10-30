package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.CardSlash: ImageVector
    get() {
        if (_CardSlash != null) {
            return _CardSlash!!
        }
        _CardSlash = ImageVector.Builder(
            name = "CardSlash",
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
                moveTo(2f, 8.5f)
                horizontalLineTo(15.24f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16.5f)
                horizontalLineTo(7.29f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 16.5f)
                horizontalLineTo(14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.98f, 20.5f)
                horizontalLineTo(17.56f)
                curveTo(21.12f, 20.5f, 22f, 19.62f, 22f, 16.11f)
                verticalLineTo(6.89f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.99f, 3.75f)
                curveTo(19.37f, 3.57f, 18.57f, 3.5f, 17.56f, 3.5f)
                horizontalLineTo(6.44f)
                curveTo(2.89f, 3.5f, 2f, 4.38f, 2f, 7.89f)
                verticalLineTo(16.1f)
                curveTo(2f, 18.44f, 2.39f, 19.61f, 3.71f, 20.13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
        }.build()

        return _CardSlash!!
    }

@Suppress("ObjectPropertyName")
private var _CardSlash: ImageVector? = null
