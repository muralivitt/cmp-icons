package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Eye: ImageVector
    get() {
        if (_Eye != null) {
            return _Eye!!
        }
        _Eye = ImageVector.Builder(
            name = "Eye",
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
                moveTo(15.58f, 12f)
                curveTo(15.58f, 13.98f, 13.98f, 15.58f, 12f, 15.58f)
                curveTo(10.02f, 15.58f, 8.42f, 13.98f, 8.42f, 12f)
                curveTo(8.42f, 10.02f, 10.02f, 8.42f, 12f, 8.42f)
                curveTo(13.98f, 8.42f, 15.58f, 10.02f, 15.58f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20.27f)
                curveTo(15.53f, 20.27f, 18.82f, 18.19f, 21.11f, 14.59f)
                curveTo(22.01f, 13.18f, 22.01f, 10.81f, 21.11f, 9.4f)
                curveTo(18.82f, 5.8f, 15.53f, 3.72f, 12f, 3.72f)
                curveTo(8.47f, 3.72f, 5.18f, 5.8f, 2.89f, 9.4f)
                curveTo(1.99f, 10.81f, 1.99f, 13.18f, 2.89f, 14.59f)
                curveTo(5.18f, 18.19f, 8.47f, 20.27f, 12f, 20.27f)
                close()
            }
        }.build()

        return _Eye!!
    }

@Suppress("ObjectPropertyName")
private var _Eye: ImageVector? = null
