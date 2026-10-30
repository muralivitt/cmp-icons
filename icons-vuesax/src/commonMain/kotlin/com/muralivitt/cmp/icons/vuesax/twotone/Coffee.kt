package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.Coffee: ImageVector
    get() {
        if (_Coffee != null) {
            return _Coffee!!
        }
        _Coffee = ImageVector.Builder(
            name = "Coffee",
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
                moveTo(17.79f, 10.47f)
                verticalLineTo(17.79f)
                curveTo(17.79f, 20.12f, 15.9f, 22f, 13.58f, 22f)
                horizontalLineTo(6.21f)
                curveTo(3.89f, 22f, 2f, 20.11f, 2f, 17.79f)
                verticalLineTo(10.47f)
                curveTo(2f, 8.14f, 3.89f, 6.26f, 6.21f, 6.26f)
                horizontalLineTo(13.58f)
                curveTo(15.9f, 6.26f, 17.79f, 8.15f, 17.79f, 10.47f)
                close()
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.5f, 4f)
                verticalLineTo(2.25f)
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 4f)
                verticalLineTo(2.25f)
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 4f)
                verticalLineTo(2.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.999f, 13.16f)
                curveTo(21.999f, 15.48f, 20.109f, 17.37f, 17.789f, 17.37f)
                verticalLineTo(8.95f)
                curveTo(20.109f, 8.95f, 21.999f, 10.83f, 21.999f, 13.16f)
                close()
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                horizontalLineTo(17.51f)
            }
        }.build()

        return _Coffee!!
    }

@Suppress("ObjectPropertyName")
private var _Coffee: ImageVector? = null
