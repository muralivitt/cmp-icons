package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Settings: ImageVector
    get() {
        if (_Settings != null) {
            return _Settings!!
        }
        _Settings = ImageVector.Builder(
            name = "Settings",
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
                moveTo(12f, 16.5f)
                curveTo(14.485f, 16.5f, 16.5f, 14.485f, 16.5f, 12f)
                curveTo(16.5f, 9.515f, 14.485f, 7.5f, 12f, 7.5f)
                curveTo(9.515f, 7.5f, 7.5f, 9.515f, 7.5f, 12f)
                curveTo(7.5f, 14.485f, 9.515f, 16.5f, 12f, 16.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                horizontalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 12f)
                horizontalLineTo(22f)
            }
        }.build()

        return _Settings!!
    }

@Suppress("ObjectPropertyName")
private var _Settings: ImageVector? = null
