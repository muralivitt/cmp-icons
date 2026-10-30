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

val VuesaxIconsTwotone.MiniMusicSqaure: ImageVector
    get() {
        if (_MiniMusicSqaure != null) {
            return _MiniMusicSqaure!!
        }
        _MiniMusicSqaure = ImageVector.Builder(
            name = "MiniMusicSqaure",
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
                moveTo(22f, 10f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(11f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.27f, 22f)
                curveTo(16.065f, 22f, 16.71f, 21.355f, 16.71f, 20.56f)
                curveTo(16.71f, 19.764f, 16.065f, 19.12f, 15.27f, 19.12f)
                curveTo(14.475f, 19.12f, 13.83f, 19.764f, 13.83f, 20.56f)
                curveTo(13.83f, 21.355f, 14.475f, 22f, 15.27f, 22f)
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
                moveTo(21.999f, 19.6f)
                verticalLineTo(13.96f)
                curveTo(21.999f, 12.76f, 21.249f, 12.59f, 20.479f, 12.8f)
                lineTo(17.589f, 13.59f)
                curveTo(17.069f, 13.73f, 16.699f, 14.15f, 16.699f, 14.75f)
                verticalLineTo(15.76f)
                verticalLineTo(16.44f)
                verticalLineTo(20.57f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.561f, 21.04f)
                curveTo(21.356f, 21.04f, 22.001f, 20.395f, 22.001f, 19.6f)
                curveTo(22.001f, 18.804f, 21.356f, 18.16f, 20.561f, 18.16f)
                curveTo(19.766f, 18.16f, 19.121f, 18.804f, 19.121f, 19.6f)
                curveTo(19.121f, 20.395f, 19.766f, 21.04f, 20.561f, 21.04f)
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
                moveTo(16.711f, 16.43f)
                lineTo(22.001f, 14.99f)
            }
        }.build()

        return _MiniMusicSqaure!!
    }

@Suppress("ObjectPropertyName")
private var _MiniMusicSqaure: ImageVector? = null
