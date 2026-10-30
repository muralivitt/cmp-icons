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

val VuesaxIconsTwotone.PlayAdd: ImageVector
    get() {
        if (_PlayAdd != null) {
            return _PlayAdd!!
        }
        _PlayAdd = ImageVector.Builder(
            name = "PlayAdd",
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
                moveTo(22f, 12f)
                curveTo(22f, 13.31f, 21.75f, 14.57f, 21.28f, 15.72f)
                curveTo(20.63f, 15.27f, 19.84f, 15f, 19f, 15f)
                curveTo(18.06f, 15f, 17.19f, 15.33f, 16.5f, 15.88f)
                curveTo(15.58f, 16.61f, 15f, 17.74f, 15f, 19f)
                curveTo(15f, 19.75f, 15.21f, 20.46f, 15.58f, 21.06f)
                curveTo(15.62f, 21.13f, 15.67f, 21.2f, 15.73f, 21.27f)
                curveTo(14.58f, 21.74f, 13.32f, 22f, 12f, 22f)
                curveTo(6.48f, 22f, 2f, 17.52f, 2f, 12f)
                curveTo(2f, 6.48f, 6.48f, 2f, 12f, 2f)
                curveTo(17.52f, 2f, 22f, 6.48f, 22f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.381f, 12f)
                verticalLineTo(10.61f)
                curveTo(9.381f, 8.89f, 10.601f, 8.18f, 12.091f, 9.04f)
                lineTo(13.291f, 9.73f)
                lineTo(14.491f, 10.42f)
                curveTo(15.981f, 11.28f, 15.981f, 12.69f, 14.491f, 13.55f)
                lineTo(13.291f, 14.24f)
                lineTo(12.091f, 14.93f)
                curveTo(10.601f, 15.79f, 9.381f, 15.09f, 9.381f, 13.36f)
                verticalLineTo(12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(23f, 19f)
                curveTo(23f, 19.75f, 22.79f, 20.46f, 22.42f, 21.06f)
                curveTo(22.21f, 21.42f, 21.94f, 21.74f, 21.63f, 22f)
                curveTo(20.93f, 22.63f, 20.01f, 23f, 19f, 23f)
                curveTo(17.54f, 23f, 16.27f, 22.22f, 15.58f, 21.06f)
                curveTo(15.21f, 20.46f, 15f, 19.75f, 15f, 19f)
                curveTo(15f, 17.74f, 15.58f, 16.61f, 16.5f, 15.88f)
                curveTo(17.19f, 15.33f, 18.06f, 15f, 19f, 15f)
                curveTo(21.21f, 15f, 23f, 16.79f, 23f, 19f)
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
                moveTo(20.49f, 18.98f)
                horizontalLineTo(17.51f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 17.52f)
                verticalLineTo(20.51f)
            }
        }.build()

        return _PlayAdd!!
    }

@Suppress("ObjectPropertyName")
private var _PlayAdd: ImageVector? = null
