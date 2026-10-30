package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.UserOctagon: ImageVector
    get() {
        if (_UserOctagon != null) {
            return _UserOctagon!!
        }
        _UserOctagon = ImageVector.Builder(
            name = "UserOctagon",
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
                moveTo(12f, 11f)
                curveTo(13.287f, 11f, 14.33f, 9.957f, 14.33f, 8.67f)
                curveTo(14.33f, 7.383f, 13.287f, 6.34f, 12f, 6.34f)
                curveTo(10.713f, 6.34f, 9.67f, 7.383f, 9.67f, 8.67f)
                curveTo(9.67f, 9.957f, 10.713f, 11f, 12f, 11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 16.66f)
                curveTo(16f, 14.86f, 14.21f, 13.4f, 12f, 13.4f)
                curveTo(9.79f, 13.4f, 8f, 14.86f, 8f, 16.66f)
            }
        }.build()

        return _UserOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _UserOctagon: ImageVector? = null
