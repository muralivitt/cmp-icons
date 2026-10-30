package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.SearchNormal: ImageVector
    get() {
        if (_SearchNormal != null) {
            return _SearchNormal!!
        }
        _SearchNormal = ImageVector.Builder(
            name = "SearchNormal",
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
                moveTo(11f, 20f)
                curveTo(15.971f, 20f, 20f, 15.971f, 20f, 11f)
                curveTo(20f, 6.029f, 15.971f, 2f, 11f, 2f)
                curveTo(6.029f, 2f, 2f, 6.029f, 2f, 11f)
                curveTo(2f, 15.971f, 6.029f, 20f, 11f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.93f, 20.69f)
                curveTo(19.46f, 22.29f, 20.67f, 22.45f, 21.6f, 21.05f)
                curveTo(22.45f, 19.77f, 21.89f, 18.72f, 20.35f, 18.72f)
                curveTo(19.21f, 18.71f, 18.57f, 19.6f, 18.93f, 20.69f)
                close()
            }
        }.build()

        return _SearchNormal!!
    }

@Suppress("ObjectPropertyName")
private var _SearchNormal: ImageVector? = null
