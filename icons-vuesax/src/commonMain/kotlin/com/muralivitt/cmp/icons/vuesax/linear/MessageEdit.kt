package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MessageEdit: ImageVector
    get() {
        if (_MessageEdit != null) {
            return _MessageEdit!!
        }
        _MessageEdit = ImageVector.Builder(
            name = "MessageEdit",
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
                moveTo(16f, 2f)
                horizontalLineTo(8f)
                curveTo(4f, 2f, 2f, 4f, 2f, 8f)
                verticalLineTo(21f)
                curveTo(2f, 21.55f, 2.45f, 22f, 3f, 22f)
                horizontalLineTo(16f)
                curveTo(20f, 22f, 22f, 20f, 22f, 16f)
                verticalLineTo(8f)
                curveTo(22f, 4f, 20f, 2f, 16f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.91f, 7.84f)
                lineTo(7.72f, 13.03f)
                curveTo(7.52f, 13.23f, 7.33f, 13.62f, 7.29f, 13.9f)
                lineTo(7.01f, 15.88f)
                curveTo(6.91f, 16.6f, 7.41f, 17.1f, 8.13f, 17f)
                lineTo(10.11f, 16.72f)
                curveTo(10.39f, 16.68f, 10.78f, 16.49f, 10.98f, 16.29f)
                lineTo(16.17f, 11.1f)
                curveTo(17.06f, 10.21f, 17.49f, 9.17f, 16.17f, 7.85f)
                curveTo(14.85f, 6.52f, 13.81f, 6.94f, 12.91f, 7.84f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.17f, 8.58f)
                curveTo(12.61f, 10.15f, 13.84f, 11.39f, 15.42f, 11.83f)
            }
        }.build()

        return _MessageEdit!!
    }

@Suppress("ObjectPropertyName")
private var _MessageEdit: ImageVector? = null
