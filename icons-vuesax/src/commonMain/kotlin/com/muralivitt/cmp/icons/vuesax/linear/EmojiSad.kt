package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.EmojiSad: ImageVector
    get() {
        if (_EmojiSad != null) {
            return _EmojiSad!!
        }
        _EmojiSad = ImageVector.Builder(
            name = "EmojiSad",
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
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 8.75f)
                curveTo(8f, 7.75f, 9.63f, 7.75f, 10.64f, 8.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.36f, 8.75f)
                curveTo(14.36f, 7.75f, 15.99f, 7.75f, 17f, 8.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.4f, 17.7f)
                horizontalLineTo(15.6f)
                curveTo(16.1f, 17.7f, 16.5f, 17.3f, 16.5f, 16.8f)
                curveTo(16.5f, 14.31f, 14.49f, 12.3f, 12f, 12.3f)
                curveTo(9.51f, 12.3f, 7.5f, 14.31f, 7.5f, 16.8f)
                curveTo(7.5f, 17.3f, 7.9f, 17.7f, 8.4f, 17.7f)
                close()
            }
        }.build()

        return _EmojiSad!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiSad: ImageVector? = null
