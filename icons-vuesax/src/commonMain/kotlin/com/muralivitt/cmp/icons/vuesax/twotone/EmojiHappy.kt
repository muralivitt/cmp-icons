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

val VuesaxIconsTwotone.EmojiHappy: ImageVector
    get() {
        if (_EmojiHappy != null) {
            return _EmojiHappy!!
        }
        _EmojiHappy = ImageVector.Builder(
            name = "EmojiHappy",
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 9.75f)
                curveTo(16.328f, 9.75f, 17f, 9.078f, 17f, 8.25f)
                curveTo(17f, 7.422f, 16.328f, 6.75f, 15.5f, 6.75f)
                curveTo(14.672f, 6.75f, 14f, 7.422f, 14f, 8.25f)
                curveTo(14f, 9.078f, 14.672f, 9.75f, 15.5f, 9.75f)
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
                moveTo(8.5f, 9.75f)
                curveTo(9.328f, 9.75f, 10f, 9.078f, 10f, 8.25f)
                curveTo(10f, 7.422f, 9.328f, 6.75f, 8.5f, 6.75f)
                curveTo(7.672f, 6.75f, 7f, 7.422f, 7f, 8.25f)
                curveTo(7f, 9.078f, 7.672f, 9.75f, 8.5f, 9.75f)
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
                moveTo(8.4f, 13.3f)
                horizontalLineTo(15.6f)
                curveTo(16.1f, 13.3f, 16.5f, 13.7f, 16.5f, 14.2f)
                curveTo(16.5f, 16.69f, 14.49f, 18.7f, 12f, 18.7f)
                curveTo(9.51f, 18.7f, 7.5f, 16.69f, 7.5f, 14.2f)
                curveTo(7.5f, 13.7f, 7.9f, 13.3f, 8.4f, 13.3f)
                close()
            }
        }.build()

        return _EmojiHappy!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiHappy: ImageVector? = null
