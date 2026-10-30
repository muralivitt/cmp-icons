package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Profile2User: ImageVector
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
                moveTo(9.16f, 10.87f)
                curveTo(9.06f, 10.86f, 8.94f, 10.86f, 8.83f, 10.87f)
                curveTo(6.45f, 10.79f, 4.56f, 8.84f, 4.56f, 6.44f)
                curveTo(4.56f, 3.99f, 6.54f, 2f, 9f, 2f)
                curveTo(11.45f, 2f, 13.44f, 3.99f, 13.44f, 6.44f)
                curveTo(13.43f, 8.84f, 11.54f, 10.79f, 9.16f, 10.87f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.41f, 4f)
                curveTo(18.35f, 4f, 19.91f, 5.57f, 19.91f, 7.5f)
                curveTo(19.91f, 9.39f, 18.41f, 10.93f, 16.54f, 11f)
                curveTo(16.46f, 10.99f, 16.37f, 10.99f, 16.28f, 11f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.16f, 14.56f)
                curveTo(1.74f, 16.18f, 1.74f, 18.82f, 4.16f, 20.43f)
                curveTo(6.91f, 22.27f, 11.42f, 22.27f, 14.17f, 20.43f)
                curveTo(16.59f, 18.81f, 16.59f, 16.17f, 14.17f, 14.56f)
                curveTo(11.43f, 12.73f, 6.92f, 12.73f, 4.16f, 14.56f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
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
