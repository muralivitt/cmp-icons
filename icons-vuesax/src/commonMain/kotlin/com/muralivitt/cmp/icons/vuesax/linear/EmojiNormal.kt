package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.EmojiNormal: ImageVector
    get() {
        if (_EmojiNormal != null) {
            return _EmojiNormal!!
        }
        _EmojiNormal = ImageVector.Builder(
            name = "EmojiNormal",
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
                moveTo(7f, 8.25f)
                curveTo(8f, 9.25f, 9.63f, 9.25f, 10.64f, 8.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.36f, 8.25f)
                curveTo(14.36f, 9.25f, 15.99f, 9.25f, 17f, 8.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.4f, 13f)
                horizontalLineTo(15.6f)
                curveTo(16.1f, 13f, 16.5f, 13.4f, 16.5f, 13.9f)
                curveTo(16.5f, 16.39f, 14.49f, 18.4f, 12f, 18.4f)
                curveTo(9.51f, 18.4f, 7.5f, 16.39f, 7.5f, 13.9f)
                curveTo(7.5f, 13.4f, 7.9f, 13f, 8.4f, 13f)
                close()
            }
        }.build()

        return _EmojiNormal!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiNormal: ImageVector? = null
