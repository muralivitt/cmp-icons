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

val VuesaxIconsTwotone.Wind: ImageVector
    get() {
        if (_Wind != null) {
            return _Wind!!
        }
        _Wind = ImageVector.Builder(
            name = "Wind",
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
                moveTo(2f, 15f)
                horizontalLineTo(18.5f)
                curveTo(20.43f, 15f, 22f, 16.57f, 22f, 18.5f)
                curveTo(22f, 20.43f, 20.43f, 22f, 18.5f, 22f)
                curveTo(16.57f, 22f, 15f, 20.43f, 15f, 18.5f)
                verticalLineTo(18f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                horizontalLineTo(18.5f)
                curveTo(20.42f, 12f, 22f, 10.43f, 22f, 8.5f)
                curveTo(22f, 6.58f, 20.42f, 5f, 18.5f, 5f)
                curveTo(16.58f, 5f, 15f, 6.57f, 15f, 8.5f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                horizontalLineTo(9.31f)
                curveTo(10.8f, 9f, 12f, 7.79f, 12f, 6.31f)
                curveTo(12f, 4.82f, 10.79f, 3.62f, 9.31f, 3.62f)
                curveTo(7.82f, 3.62f, 6.62f, 4.83f, 6.62f, 6.31f)
                verticalLineTo(6.69f)
            }
        }.build()

        return _Wind!!
    }

@Suppress("ObjectPropertyName")
private var _Wind: ImageVector? = null
