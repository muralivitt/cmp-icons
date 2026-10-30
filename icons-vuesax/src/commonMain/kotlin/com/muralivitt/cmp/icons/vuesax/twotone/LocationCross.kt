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

val VuesaxIconsTwotone.LocationCross: ImageVector
    get() {
        if (_LocationCross != null) {
            return _LocationCross!!
        }
        _LocationCross = ImageVector.Builder(
            name = "LocationCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(3.62f, 8.49f)
                curveTo(5.59f, -0.17f, 18.42f, -0.16f, 20.38f, 8.5f)
                curveTo(21.53f, 13.58f, 18.37f, 17.88f, 15.6f, 20.54f)
                curveTo(13.59f, 22.48f, 10.41f, 22.48f, 8.39f, 20.54f)
                curveTo(5.63f, 17.88f, 2.47f, 13.57f, 3.62f, 8.49f)
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
                moveTo(13.999f, 12.96f)
                lineTo(10.039f, 9f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.96f, 9.04f)
                lineTo(10f, 13f)
            }
        }.build()

        return _LocationCross!!
    }

@Suppress("ObjectPropertyName")
private var _LocationCross: ImageVector? = null
