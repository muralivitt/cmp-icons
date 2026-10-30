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

val VuesaxIconsTwotone.UserSquare: ImageVector
    get() {
        if (_UserSquare != null) {
            return _UserSquare!!
        }
        _UserSquare = ImageVector.Builder(
            name = "UserSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.139f, 21.62f)
                curveTo(17.259f, 21.88f, 16.219f, 22f, 14.999f, 22f)
                horizontalLineTo(8.999f)
                curveTo(7.779f, 22f, 6.739f, 21.88f, 5.859f, 21.62f)
                curveTo(6.079f, 19.02f, 8.749f, 16.97f, 11.999f, 16.97f)
                curveTo(15.249f, 16.97f, 17.919f, 19.02f, 18.139f, 21.62f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 9f)
                verticalLineTo(15f)
                curveTo(22f, 18.78f, 20.86f, 20.85f, 18.14f, 21.62f)
                curveTo(17.26f, 21.88f, 16.22f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(7.78f, 22f, 6.74f, 21.88f, 5.86f, 21.62f)
                curveTo(3.14f, 20.85f, 2f, 18.78f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 4f, 4f, 2f, 9f, 2f)
                horizontalLineTo(15f)
                curveTo(20f, 2f, 22f, 4f, 22f, 9f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.58f, 10.58f)
                curveTo(15.58f, 12.56f, 13.98f, 14.17f, 12f, 14.17f)
                curveTo(10.02f, 14.17f, 8.42f, 12.56f, 8.42f, 10.58f)
                curveTo(8.42f, 8.6f, 10.02f, 7f, 12f, 7f)
                curveTo(13.98f, 7f, 15.58f, 8.6f, 15.58f, 10.58f)
                close()
            }
        }.build()

        return _UserSquare!!
    }

@Suppress("ObjectPropertyName")
private var _UserSquare: ImageVector? = null
