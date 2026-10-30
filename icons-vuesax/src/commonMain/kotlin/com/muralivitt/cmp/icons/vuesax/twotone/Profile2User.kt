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

val VuesaxIconsTwotone.Profile2User: ImageVector
    get() {
        if (_Profile2User != null) {
            return _Profile2User!!
        }
        _Profile2User = ImageVector.Builder(
            name = "Profile2User",
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
                moveTo(9.161f, 10.87f)
                curveTo(9.061f, 10.86f, 8.941f, 10.86f, 8.831f, 10.87f)
                curveTo(6.451f, 10.79f, 4.561f, 8.84f, 4.561f, 6.44f)
                curveTo(4.561f, 3.99f, 6.541f, 2f, 9.001f, 2f)
                curveTo(11.45f, 2f, 13.441f, 3.99f, 13.441f, 6.44f)
                curveTo(13.431f, 8.84f, 11.54f, 10.79f, 9.161f, 10.87f)
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
                moveTo(16.409f, 4f)
                curveTo(18.349f, 4f, 19.909f, 5.57f, 19.909f, 7.5f)
                curveTo(19.909f, 9.39f, 18.409f, 10.93f, 16.539f, 11f)
                curveTo(16.459f, 10.99f, 16.369f, 10.99f, 16.279f, 11f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.161f, 14.56f)
                curveTo(1.741f, 16.18f, 1.741f, 18.82f, 4.161f, 20.43f)
                curveTo(6.911f, 22.27f, 11.421f, 22.27f, 14.171f, 20.43f)
                curveTo(16.591f, 18.81f, 16.591f, 16.17f, 14.171f, 14.56f)
                curveTo(11.431f, 12.73f, 6.921f, 12.73f, 4.161f, 14.56f)
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
                moveTo(18.34f, 20f)
                curveTo(19.06f, 19.85f, 19.74f, 19.56f, 20.3f, 19.13f)
                curveTo(21.86f, 17.96f, 21.86f, 16.03f, 20.3f, 14.86f)
                curveTo(19.75f, 14.44f, 19.08f, 14.16f, 18.37f, 14f)
            }
        }.build()

        return _Profile2User!!
    }

@Suppress("ObjectPropertyName")
private var _Profile2User: ImageVector? = null
