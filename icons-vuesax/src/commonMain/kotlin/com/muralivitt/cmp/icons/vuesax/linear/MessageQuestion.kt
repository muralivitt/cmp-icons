package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MessageQuestion: ImageVector
    get() {
        if (_MessageQuestion != null) {
            return _MessageQuestion!!
        }
        _MessageQuestion = ImageVector.Builder(
            name = "MessageQuestion",
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
                moveTo(17f, 18.43f)
                horizontalLineTo(13f)
                lineTo(8.55f, 21.39f)
                curveTo(7.89f, 21.83f, 7f, 21.36f, 7f, 20.56f)
                verticalLineTo(18.43f)
                curveTo(4f, 18.43f, 2f, 16.43f, 2f, 13.43f)
                verticalLineTo(7.43f)
                curveTo(2f, 4.43f, 4f, 2.43f, 7f, 2.43f)
                horizontalLineTo(17f)
                curveTo(20f, 2.43f, 22f, 4.43f, 22f, 7.43f)
                verticalLineTo(13.43f)
                curveTo(22f, 16.43f, 20f, 18.43f, 17f, 18.43f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 11.36f)
                verticalLineTo(11.15f)
                curveTo(12f, 10.47f, 12.42f, 10.11f, 12.84f, 9.82f)
                curveTo(13.25f, 9.54f, 13.66f, 9.18f, 13.66f, 8.52f)
                curveTo(13.66f, 7.6f, 12.92f, 6.86f, 12f, 6.86f)
                curveTo(11.08f, 6.86f, 10.34f, 7.6f, 10.34f, 8.52f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.995f, 13.75f)
                horizontalLineTo(12.005f)
            }
        }.build()

        return _MessageQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _MessageQuestion: ImageVector? = null
