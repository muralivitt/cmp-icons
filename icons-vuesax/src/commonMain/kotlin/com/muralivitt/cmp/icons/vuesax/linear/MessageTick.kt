package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MessageTick: ImageVector
    get() {
        if (_MessageTick != null) {
            return _MessageTick!!
        }
        _MessageTick = ImageVector.Builder(
            name = "MessageTick",
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
                moveTo(22f, 7.43f)
                verticalLineTo(13.43f)
                curveTo(22f, 14.93f, 21.5f, 16.18f, 20.62f, 17.06f)
                curveTo(19.75f, 17.93f, 18.5f, 18.43f, 17f, 18.43f)
                verticalLineTo(20.56f)
                curveTo(17f, 21.36f, 16.11f, 21.84f, 15.45f, 21.4f)
                lineTo(11f, 18.43f)
                horizontalLineTo(8.88f)
                curveTo(8.96f, 18.13f, 9f, 17.82f, 9f, 17.5f)
                curveTo(9f, 16.48f, 8.61f, 15.54f, 7.97f, 14.83f)
                curveTo(7.25f, 14.01f, 6.18f, 13.5f, 5f, 13.5f)
                curveTo(3.88f, 13.5f, 2.86f, 13.96f, 2.13f, 14.71f)
                curveTo(2.04f, 14.31f, 2f, 13.88f, 2f, 13.43f)
                verticalLineTo(7.43f)
                curveTo(2f, 4.43f, 4f, 2.43f, 7f, 2.43f)
                horizontalLineTo(17f)
                curveTo(20f, 2.43f, 22f, 4.43f, 22f, 7.43f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 17.5f)
                curveTo(9f, 18.25f, 8.79f, 18.96f, 8.42f, 19.56f)
                curveTo(8.21f, 19.92f, 7.94f, 20.24f, 7.63f, 20.5f)
                curveTo(6.93f, 21.13f, 6.01f, 21.5f, 5f, 21.5f)
                curveTo(3.54f, 21.5f, 2.27f, 20.72f, 1.58f, 19.56f)
                curveTo(1.21f, 18.96f, 1f, 18.25f, 1f, 17.5f)
                curveTo(1f, 16.24f, 1.58f, 15.11f, 2.5f, 14.38f)
                curveTo(3.19f, 13.83f, 4.06f, 13.5f, 5f, 13.5f)
                curveTo(7.21f, 13.5f, 9f, 15.29f, 9f, 17.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.44f, 17.5f)
                lineTo(4.43f, 18.49f)
                lineTo(6.56f, 16.52f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 10.5f)
                horizontalLineTo(15.5f)
            }
        }.build()

        return _MessageTick!!
    }

@Suppress("ObjectPropertyName")
private var _MessageTick: ImageVector? = null
