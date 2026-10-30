package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Tag2: ImageVector
    get() {
        if (_Tag2 != null) {
            return _Tag2!!
        }
        _Tag2 = ImageVector.Builder(
            name = "Tag2",
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
                moveTo(4.405f, 15.526f)
                lineTo(8.935f, 20.056f)
                curveTo(10.795f, 21.916f, 13.815f, 21.916f, 15.685f, 20.056f)
                lineTo(20.075f, 15.666f)
                curveTo(21.935f, 13.806f, 21.935f, 10.786f, 20.075f, 8.916f)
                lineTo(15.535f, 4.396f)
                curveTo(14.585f, 3.446f, 13.275f, 2.936f, 11.935f, 3.006f)
                lineTo(6.935f, 3.246f)
                curveTo(4.935f, 3.336f, 3.345f, 4.926f, 3.245f, 6.916f)
                lineTo(3.005f, 11.916f)
                curveTo(2.945f, 13.266f, 3.455f, 14.576f, 4.405f, 15.526f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(9.735f, 12.226f)
                curveTo(11.116f, 12.226f, 12.235f, 11.107f, 12.235f, 9.726f)
                curveTo(12.235f, 8.346f, 11.116f, 7.226f, 9.735f, 7.226f)
                curveTo(8.354f, 7.226f, 7.235f, 8.346f, 7.235f, 9.726f)
                curveTo(7.235f, 11.107f, 8.354f, 12.226f, 9.735f, 12.226f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.235f, 17.226f)
                lineTo(17.235f, 13.226f)
            }
        }.build()

        return _Tag2!!
    }

@Suppress("ObjectPropertyName")
private var _Tag2: ImageVector? = null
