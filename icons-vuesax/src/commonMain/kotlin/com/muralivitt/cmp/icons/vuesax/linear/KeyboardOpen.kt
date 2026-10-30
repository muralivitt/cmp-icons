package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.KeyboardOpen: ImageVector
    get() {
        if (_KeyboardOpen != null) {
            return _KeyboardOpen!!
        }
        _KeyboardOpen = ImageVector.Builder(
            name = "KeyboardOpen",
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
                moveTo(7.26f, 2f)
                horizontalLineTo(16.73f)
                curveTo(17.38f, 2f, 17.96f, 2.02f, 18.48f, 2.09f)
                curveTo(21.25f, 2.4f, 22f, 3.7f, 22f, 7.26f)
                verticalLineTo(13.58f)
                curveTo(22f, 17.14f, 21.25f, 18.44f, 18.48f, 18.75f)
                curveTo(17.96f, 18.82f, 17.39f, 18.84f, 16.73f, 18.84f)
                horizontalLineTo(7.26f)
                curveTo(6.61f, 18.84f, 6.03f, 18.82f, 5.51f, 18.75f)
                curveTo(2.74f, 18.44f, 1.99f, 17.14f, 1.99f, 13.58f)
                verticalLineTo(7.26f)
                curveTo(1.99f, 3.7f, 2.74f, 2.4f, 5.51f, 2.09f)
                curveTo(6.03f, 2.02f, 6.61f, 2f, 7.26f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.58f, 8.32f)
                horizontalLineTo(17.26f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.74f, 14.11f)
                horizontalLineTo(6.76f)
                horizontalLineTo(17.27f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 22f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.195f, 8.3f)
                horizontalLineTo(7.204f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.495f, 8.3f)
                horizontalLineTo(10.503f)
            }
        }.build()

        return _KeyboardOpen!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardOpen: ImageVector? = null
