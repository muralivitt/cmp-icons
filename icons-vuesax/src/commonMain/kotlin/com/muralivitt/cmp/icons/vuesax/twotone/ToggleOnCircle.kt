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

val VuesaxIconsTwotone.ToggleOnCircle: ImageVector
    get() {
        if (_ToggleOnCircle != null) {
            return _ToggleOnCircle!!
        }
        _ToggleOnCircle = ImageVector.Builder(
            name = "ToggleOnCircle",
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
                moveTo(10f, 4f)
                horizontalLineTo(14f)
                curveTo(18.42f, 4f, 22f, 7.58f, 22f, 12f)
                curveTo(22f, 16.42f, 18.42f, 20f, 14f, 20f)
                horizontalLineTo(10f)
                curveTo(5.58f, 20f, 2f, 16.42f, 2f, 12f)
                curveTo(2f, 7.58f, 5.58f, 4f, 10f, 4f)
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
                moveTo(14f, 16f)
                curveTo(16.209f, 16f, 18f, 14.209f, 18f, 12f)
                curveTo(18f, 9.791f, 16.209f, 8f, 14f, 8f)
                curveTo(11.791f, 8f, 10f, 9.791f, 10f, 12f)
                curveTo(10f, 14.209f, 11.791f, 16f, 14f, 16f)
                close()
            }
        }.build()

        return _ToggleOnCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleOnCircle: ImageVector? = null
