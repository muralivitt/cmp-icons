package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Status: ImageVector
    get() {
        if (_Status != null) {
            return _Status!!
        }
        _Status = ImageVector.Builder(
            name = "Status",
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
                moveTo(2.45f, 14.97f)
                curveTo(3.52f, 18.41f, 6.4f, 21.06f, 9.98f, 21.79f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.05f, 10.98f)
                curveTo(2.56f, 5.93f, 6.82f, 2f, 12f, 2f)
                curveTo(17.18f, 2f, 21.44f, 5.94f, 21.95f, 10.98f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.01f, 21.8f)
                curveTo(17.58f, 21.07f, 20.45f, 18.45f, 21.54f, 15.02f)
            }
        }.build()

        return _Status!!
    }

@Suppress("ObjectPropertyName")
private var _Status: ImageVector? = null
