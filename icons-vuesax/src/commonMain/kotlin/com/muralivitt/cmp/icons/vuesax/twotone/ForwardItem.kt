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

val VuesaxIconsTwotone.ForwardItem: ImageVector
    get() {
        if (_ForwardItem != null) {
            return _ForwardItem!!
        }
        _ForwardItem = ImageVector.Builder(
            name = "ForwardItem",
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
                moveTo(17.379f, 10.38f)
                verticalLineTo(13.61f)
                curveTo(17.379f, 16.3f, 16.299f, 17.38f, 13.609f, 17.38f)
                horizontalLineTo(10.379f)
                curveTo(7.689f, 17.38f, 6.609f, 16.3f, 6.609f, 13.61f)
                verticalLineTo(10.38f)
                curveTo(6.609f, 7.69f, 7.689f, 6.61f, 10.379f, 6.61f)
                horizontalLineTo(13.609f)
                curveTo(16.309f, 6.62f, 17.379f, 7.69f, 17.379f, 10.38f)
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
                moveTo(22f, 5.77f)
                verticalLineTo(9f)
                curveTo(22f, 11.69f, 20.92f, 12.77f, 18.23f, 12.77f)
                horizontalLineTo(17.381f)
                verticalLineTo(10.39f)
                curveTo(17.381f, 7.7f, 16.301f, 6.62f, 13.611f, 6.62f)
                horizontalLineTo(11.231f)
                verticalLineTo(5.77f)
                curveTo(11.231f, 3.08f, 12.311f, 2f, 15f, 2f)
                horizontalLineTo(18.23f)
                curveTo(20.92f, 2f, 22f, 3.08f, 22f, 5.77f)
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
                moveTo(2f, 18.23f)
                verticalLineTo(15f)
                curveTo(2f, 12.31f, 3.08f, 11.23f, 5.77f, 11.23f)
                horizontalLineTo(6.62f)
                verticalLineTo(13.61f)
                curveTo(6.62f, 16.3f, 7.7f, 17.38f, 10.39f, 17.38f)
                horizontalLineTo(12.77f)
                verticalLineTo(18.23f)
                curveTo(12.77f, 20.92f, 11.69f, 22f, 9f, 22f)
                horizontalLineTo(5.77f)
                curveTo(3.08f, 22f, 2f, 20.92f, 2f, 18.23f)
                close()
            }
        }.build()

        return _ForwardItem!!
    }

@Suppress("ObjectPropertyName")
private var _ForwardItem: ImageVector? = null
