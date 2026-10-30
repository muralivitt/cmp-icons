package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.VideoOctagon: ImageVector
    get() {
        if (_VideoOctagon != null) {
            return _VideoOctagon!!
        }
        _VideoOctagon = ImageVector.Builder(
            name = "VideoOctagon",
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
                moveTo(21.08f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(21.08f, 16.54f, 20.48f, 17.58f, 19.51f, 18.15f)
                lineTo(13.57f, 21.58f)
                curveTo(12.6f, 22.14f, 11.4f, 22.14f, 10.42f, 21.58f)
                lineTo(4.48f, 18.15f)
                curveTo(3.51f, 17.59f, 2.91f, 16.55f, 2.91f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(2.91f, 7.46f, 3.51f, 6.42f, 4.48f, 5.85f)
                lineTo(10.42f, 2.42f)
                curveTo(11.39f, 1.86f, 12.59f, 1.86f, 13.57f, 2.42f)
                lineTo(19.51f, 5.85f)
                curveTo(20.48f, 6.42f, 21.08f, 7.45f, 21.08f, 8.58f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.75f, 12f)
                verticalLineTo(10.8f)
                curveTo(9.75f, 9.26f, 10.84f, 8.63f, 12.17f, 9.4f)
                lineTo(13.21f, 10f)
                lineTo(14.25f, 10.6f)
                curveTo(15.58f, 11.37f, 15.58f, 12.63f, 14.25f, 13.4f)
                lineTo(13.21f, 14f)
                lineTo(12.17f, 14.6f)
                curveTo(10.84f, 15.37f, 9.75f, 14.74f, 9.75f, 13.2f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _VideoOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _VideoOctagon: ImageVector? = null
